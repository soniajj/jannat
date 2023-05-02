package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo13 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver= new ChromeDriver();
		driver.get("https://www.applevacations.com/#!/");
		Thread.sleep(5000);  
		driver.findElement(By.id("accessible-megamenu-1682526068914-24")).click();
		 driver.findElement(By.id("scc_rt_vendorpackage_1_H01")).click();
		 Thread.sleep(5000);
		 //driver.findElement(By.id("placeholder")).sendKeys("New York - JFK (JFK)");
		 Thread.sleep(5000);
		driver.findElement(By.id("/html/body/div[2]/div/div[2]/main/div/div[1]/div/div[3]/div/div/div/div/fieldset/div[6]/div/div[8]/div[2]/span[1]")).click();
	
		
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
}
