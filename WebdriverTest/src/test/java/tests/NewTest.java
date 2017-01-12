package tests;


import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		


public class NewTest {
	
	private WebDriver driver;
	
	@Test				
	public void testEasy() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thanh.le\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver() ;
		driver.get("http://www.google.com") ;
		
		Thread.sleep(5000);  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit();
		  Thread.sleep(5000);  // Let the user actually see something!

		
		driver.quit();
		//driver.get("http://www.guru99.com/selenium-tutorial.html");  
		//String title = driver.getTitle();				 
		//Assert.assertTrue(title.contains("Free Selenium Tutorials")); 	
		
	}	
	
	  @Test
	  public void f() {
	  }
	  @BeforeTest
	  public void beforeTest() {
		  //driver = new FirefoxDriver();  
	  }
	
	  @AfterTest
	  public void afterTest() {
		  //driver.quit();	
	  }

}

