package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testdemo9 {
  @Test
  public void f() throws InterruptedException {
	  //dropdown demo.
	  WebDriver driver;

		driver= new ChromeDriver();
	  driver.get("https://collegeweeklive.com/go-signup");
	 Thread.sleep(5000); 
	 driver.findElement(By.name("attendeeType")).click();
	  Thread.sleep(4000); 
	  new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
	  Thread.sleep(4000); 
	  
	  driver.quit();
	  
	  
	  
	  
  }
}
