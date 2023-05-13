package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_pageAssign13 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, Exception {//Assignment (13)
	  //Read the excel test data.
	 //find the excel sheet path.
	  FileInputStream ab = new FileInputStream("C:\\Users\\Jannatul Ferdous\\Desktop\\Testdata1.xlsx");
	//Using Apachi poi s/w,it will call excel workbook,sheet,coloumn,rows.
	 /* we can use two type of method.
	 1. workbook wb = new HSSFWorkbook(ab);  (this method for .xls.)
	 2. workbook wb = new XSSFWorkbook(ab);  (this method for .xlsx.)*/
	   Workbook wb = new XSSFWorkbook(ab);
	  Sheet ws = wb.getSheet("LOGIN_PAGE1");//Method for get the sheet path.
	  Row R =ws.getRow(1); // method for get the row number.
	  Cell Username = R.getCell(0); //method for get the username.
	  Cell Password = R.getCell(1); // method for get the password.
	  System.out.println(Username);
	  System.out.println(Password);
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		 Thread.sleep(5000);
		  driver.findElement(By.name("username")).sendKeys(Username.getStringCellValue());
		  driver.findElement(By.name("password")).sendKeys(Password.getStringCellValue());
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  driver.quit();
		  
	/*driver = new ChromeDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	 Thread.sleep(5000);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  driver.quit();*/
  }
}
