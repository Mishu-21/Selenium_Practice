//Launch amazon.com and search book in searchbar with the help of Css SubString

package CSS_Selector_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_SubString_LaunchAmazon_TypeBookInSearchBar {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//css selector with SubString syntax----> tagName[AN^='Partial_AV']  
		 driver.findElement(By.cssSelector("input[id^='twotabse']")).sendKeys("Books");
		
	}

}
