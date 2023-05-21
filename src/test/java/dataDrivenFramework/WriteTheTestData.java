package dataDrivenFramework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteTheTestData {
  @Test
  public void f() throws Exception  {
	  FileOutputStream fi = new FileOutputStream(".\\src\\test\\resources\\testing.xlsx");
	  
	  Workbook wb = new XSSFWorkbook(); 
	  Sheet ws = wb.createSheet("abc");
	  Row R = ws.createRow(1); 
		Cell c = R.createCell(1) ;
		
	  c.setCellValue("sonia");
	  R.createCell(2).setCellValue("farida");
	  R.createCell(3).setCellValue("Durga");
	  R.createCell(4).setCellValue("Nasir");
	  Row Rl = ws.createRow(5); 
		Cell cl = Rl.createCell(10) ;
	  cl.setCellValue("My number is 232564789");
	  
	  wb.write(fi);
	  wb.close();
	  
	  
  }


}
