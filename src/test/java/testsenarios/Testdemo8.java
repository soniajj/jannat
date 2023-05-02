package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testdemo8 {
  @Test
  public void f() throws InterruptedException {//dropdown.
	  
	  WebDriver driver;	
	  driver = new ChromeDriver();
	  
	  driver.get("https://testautomationpractice.blogspot.com/"); 
	  
	  new Select(driver.findElement(By.name("speed"))).selectByVisibleText("Fast");
	  new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
	  new Select(driver.findElement(By.name("number"))).selectByVisibleText("4");
	  new Select(driver.findElement(By.name("products"))).selectByVisibleText("Iphone");
	  new Select(driver.findElement(By.id("animals"))).selectByVisibleText("Baby Cat");
	  Thread.sleep(4000);
	  
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
