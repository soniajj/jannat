package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testdemo14 {
  @Test
  public void f() throws InterruptedException {
	  // Refresh,back, forward demo.
	 RemoteWebDriver driver;	
	  driver = new ChromeDriver();
	  driver.get( "https://www.justrechargeit.com/");
	  driver.findElement(By.linkText("Create New Account")).click();
	  driver.findElement(By.id("signup_name")).sendKeys("jannat sonia");
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  Thread.sleep(5000);
	  driver.navigate().forward();
	  
	 driver.quit(); 
	  
	  
	  
	  
	  
	  
	  
  }
}
