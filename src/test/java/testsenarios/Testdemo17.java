package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo17 {
  @Test
  public void f() throws InterruptedException {
	 //Alert demo
	  WebDriver driver;
	  driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(5000); 
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		//driver.findElement(By.partialLinkText("New User")).click();
		Thread.sleep(5000);
		//Alert with cancle demo with dismiss(); 
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		  driver.quit(); 
		
		
  } 
	  
}  
	  
	  
	  
	  
	  
	  
	  
	 

