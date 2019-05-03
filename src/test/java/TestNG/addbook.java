package TestNG;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbook {
	  ChromeDriver driver;
	  @BeforeMethod
	  public void launch() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
	 	  driver.get("http://192.168.2.6:8090/addressbook");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void verifyaddbook() {
		  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();	
		  driver.findElement(By.id("gwt-uid-5")).sendKeys("Hitesh");
		  driver.findElement(By.id("gwt-uid-7")).sendKeys("Soni");
		  driver.findElement(By.id("gwt-uid-9")).sendKeys("123456789");
		  driver.findElement(By.id("gwt-uid-11")).sendKeys("temp@ca");
		  driver.findElement(By.id("gwt-uid-13")).sendKeys("12/12/12");
		  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();		  
	  }
	  @AfterMethod
	  public void close() {
		  driver.close();
	  }
	}