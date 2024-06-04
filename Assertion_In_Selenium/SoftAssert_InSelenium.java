package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class SoftAssert_InSelenium {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search_bar=driver.findElement(By.name("q"));
	    search_bar.sendKeys("India");
	    search_bar.sendKeys(Keys.ENTER); 
	Thread.sleep(10000);
	
	//to declare soft Assert we make use of SoftAssert class
	
	SoftAssert s1=new SoftAssert();//import the class  org.testng.asserts.SoftAssert;
	
	
	
	//s1.assertEquals(driver.getTitle(), "India - Google Search");//this is correct assert statement
	
	s1.assertEquals(driver.getTitle(), "India - Google ");//defined wrong  assert statement to see that my assert is failing still code is move forward 

	//to make sure my assertion is  failing-->still it works aage lets works aage
	Thread.sleep(1000);
	driver.findElement(By.xpath("//h3[.='India']")).click();
	}
}
