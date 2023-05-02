package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testdemo16 {
  @Test
  public void f() throws InterruptedException {
	  
	  RemoteWebDriver driver;	
	  driver = new ChromeDriver();
	  driver.get( "https://blazedemo.com/");
	  new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
	  Thread.sleep(5000);
	  new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Rome");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
	  Thread.sleep(3000);
		driver.findElement(By.id("inputName")).sendKeys("Sonia");
		Thread.sleep(5000);
		driver.findElement(By.id("address")).sendKeys("123 south dale");
		Thread.sleep(5000);
	driver.findElement(By.id("city")).sendKeys("saint paul");
	Thread.sleep(5000);
	driver.findElement(By.id("state")).sendKeys("USA");
	Thread.sleep(5000);
		driver.findElement(By.id("zipCode")).sendKeys("55124");
		Thread.sleep(5000);
		new Select(driver.findElement(By.id("cardType"))).selectByVisibleText("Visa");
		  Thread.sleep(5000);
		  driver.findElement(By.id("creditCardNumber")).sendKeys("034566789990");
		  Thread.sleep(5000);
		  driver.findElement(By.id("creditCardMonth")).sendKeys("12");
		  Thread.sleep(5000);
		  driver.findElement(By.id("creditCardYear")).sendKeys("2029");
		  Thread.sleep(5000);
		  driver.findElement(By.id("nameOnCard")).sendKeys("sonia smith");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		  Thread.sleep(5000);
		  String findtext =	driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		  System.out.println("findtext");
		  Thread.sleep(5000);
		  
		  
		  driver.quit();
		  
  }
}
