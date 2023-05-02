package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo12 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;

		driver= new ChromeDriver();
	  driver.get("https://opencart-prf.exense.ch/");
	  driver.findElement(By.xpath("/html/body/nav/div/div[1]/form/div/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/nav/div/div[1]/form/div/ul/li[1]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("iPhone")).click();
	  driver.findElement(By.id("button-cart")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("cart-total")).click();
	 driver.findElement(By.xpath(" /html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[2]")).click();
	 driver.findElement(By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input")).click();
	 
	
	 
	  Thread.sleep(2000);
	  driver.quit();
	  
	  
	  
	  
	  
	  
  }
}
