//launch google and type india with the help of css selector id 

package CSS_Selector_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Id_LaunchGoogle_TypeIndia {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//css selector id syntax----> #id_value
		
		WebElement Search= driver.findElement(By.cssSelector("#APjFqb"));
		Search.sendKeys("India");
	}

}
