package dataDrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadMultipleRowsAndColumnsfromExcel {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   
	//find the excel sheet path.
	  FileInputStream bc = new FileInputStream(".\\LoginRetesringExcelSheet.xlsx");
	//Using Apachi poi s/w,it will call excel workbook,sheet,coloumn,rows.
		 /* we can use two type of method.
		 1. workbook wb = new HSSFWorkbook(ab);  (this method for .xls.)
		 2. workbook wb = new XSSFWorkbook(ab);  (this method for .xlsx.)*/
		   Workbook wb = new XSSFWorkbook(bc); 
		  Sheet ws = wb.getSheet("Retesting");//Method for get the sheet path.
		  
		
			  
		  for (int i = 1; i < 8; i++) {
			Row R = ws.getRow(1); // method for get the row number.
			Cell UserName = R.getCell(0); //method for get the username.
			Cell Password = R.getCell(1); // method for get the password.
			//System.out.println(Username);
			// System.out.println(Password);
			// we have to clear existing data using clear() method.
			driver.findElement(By.name("username")).sendKeys(UserName.getStringCellValue());
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("password")).sendKeys(Password.getStringCellValue());
			driver.findElement(By.name("password")).clear();
			 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(2000);
			//driver.quit();
			
		}
	  
  }
}
