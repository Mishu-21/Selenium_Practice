//launch google and right click on gmail 



/*

 can be done using actions class
 method used contextClick(WebElement Target)
 */

package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnGmail_AfterLaunchingGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//right click on gmail 
		Actions a1=new Actions(driver);
		a1.contextClick(driver.findElement(By.linkText("Gmail"))).perform();
		
	}

}
