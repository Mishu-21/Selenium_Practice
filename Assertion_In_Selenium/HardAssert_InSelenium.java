package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class HardAssert_InSelenium {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search_bar=driver.findElement(By.name("q"));
	    search_bar.sendKeys("India");
	    search_bar.sendKeys(Keys.ENTER); 
	Thread.sleep(10000);
	
	//to declare Hard Assert we make use of Assertion class
	
	Assertion a1=new Assertion();//import the class  org.testng.asserts.Assertion;
	
	// a1. ---> we see all the methods and which are coming from assertion class and these methods are same which we have studied in assertion concept of testng 
	
	a1.assertEquals(driver.getTitle(), "India - Google Search");
	
	//to make sure my assertion is passing or failing-->lets works aage
	Thread.sleep(1000);
	driver.findElement(By.xpath("//h3[.='India']")).click();
	}
}
