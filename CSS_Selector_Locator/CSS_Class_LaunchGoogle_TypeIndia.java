//launch google and type india with the help of css selector Class



package CSS_Selector_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Class_LaunchGoogle_TypeIndia {

	
	
public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//css selector Class syntax----> .className_Value
		
		WebElement Search= driver.findElement(By.cssSelector(".gLFyf"));
		Search.sendKeys("India");
	}
}
