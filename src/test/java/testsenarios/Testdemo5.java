package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo5 {
  @Test
  public void f() throws InterruptedException {
	  
	  
	  
	  WebDriver driver;
	  driver = new ChromeDriver();	
	  
	  driver.get("https://autotestdata.com/");
	  
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[1]/button")).click();
	   driver.findElement(By.id("email")).sendKeys("jferdous2791@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("2345678");
	   
     // Thread.sleep(5000);
	   driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/section/form[1]/div[3]/button")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
