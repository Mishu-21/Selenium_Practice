//use TagName locator to clock on  login button of fb 

package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator_FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch fb
		driver.get("https://www.facebook.com/");
		
		//tagname when used with findelement so it must be unique--as here tagname button is unique 
		WebElement login=driver.findElement(By.tagName("button"));
		login.click();
		
		//if we have button tag as 51 and we r doing findelement so it will always select the first one 
		
		
	}

}
