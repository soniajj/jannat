package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo3 {
  @Test
  public void f() throws InterruptedException {
	  
	WebDriver driver;
	driver = new ChromeDriver();
	  
	driver.get("https://phptravels.com/demo/");
	Thread.sleep(5000);
	
	driver.findElement(By.linkText("Signup")).click();
	Thread.sleep(5000);
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
