//launch google and double click on gmail 

package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOnGmail_AfterLaunchingGoogle {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		/*double click on gmail 
		 so for double click we use Actions class and use its method doubleClick(WebElement target)
		 
		 syntax:
		 Actions a1=new Actions(driver);
		a1.doubleClick(WebElement target).perform();;
		 
		*/
		
		/*
		 1st way to do 
		  Element which needs to be double click 
		WebElement Element_ToDoubleClick =driver.findElement(By.linkText("Gmail"));
		
		Actions a1=new Actions(driver);
		a1.doubleClick(Element_ToDoubleClick).perform();
		
		*/
		
		//2nd way 
		Actions a1=new Actions(driver);
		a1.doubleClick(driver.findElement(By.linkText("Gmail"))).perform();
		
	}
}
