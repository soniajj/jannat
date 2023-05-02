package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo6 {
  @Test
  public void f() throws InterruptedException {
	  
	  
	  WebDriver driver;	
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://phptravels.com/demo/");
	  Thread.sleep(5000);
	  driver.findElement(By.name("first_name")).sendKeys("SONIA");
	  driver.findElement(By.name("last_name")).sendKeys("SONIAJANNAT");
	  driver.findElement(By.name("business_name")).sendKeys("SONIAJF");
	   driver.findElement(By.name("email")).sendKeys("jferdous2791@gmail.com");
	   Thread.sleep(5000);
	   WebElement element = driver.findElement(By.id("demo"));
	   JavascriptExecutor executor = (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();", element);
	   
	   driver.quit();
	  //driver.findElement(By.id("demo")).click();
		
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
