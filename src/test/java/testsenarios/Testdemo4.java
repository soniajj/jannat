package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo4 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver;
	  driver =new ChromeDriver();
	  driver.get("https://autotestdata.com/");
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.linkText("Need Help?")).click();
	  Thread.sleep(5000);
	  
	  driver.quit();
	 
	  
	  
  }
}
