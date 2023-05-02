package testsenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testdemo15 {
  @Test
  public void f() throws InterruptedException {
	  //Gettext method demo.
	  
	  WebDriver driver;
	  driver= new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		Thread.sleep(5000);  
		driver.findElement(By.id("imgbtnSignin")).click();
		Thread.sleep(2000); 
	String findErrormas =	driver.findElement(By.id("imgbtnSignin")).getText();
	  System.out.println("findErrormas");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
