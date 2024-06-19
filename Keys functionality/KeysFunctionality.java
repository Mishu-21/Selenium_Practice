//sendkeys will help us to sned only aphanumeric value but what about enter, esc ,arrow down ie keys functionality  

package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionality {

	public static void main(String[] args) {
		// scenerio: launch google type indi and press enter 
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search_bar=driver.findElement(By.name("q"));
	    search_bar.sendKeys("India");
	    search_bar.sendKeys(Keys.ENTER); //by keys. we get the whole keyboard 
	
	}

}
