package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo2 {
  @Test
  public void f() throws InterruptedException {
	  
	 //Hyperlink demo.
	  WebDriver driver;
	  driver= new ChromeDriver();
	  driver.get("https://collegeweeklive.com/go-signup/");
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("terms & conditions")).click();
	  Thread.sleep(5000);
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
