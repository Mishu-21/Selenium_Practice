//launch google and type india with the help of css selector TagName , Attribute Name and Attribute Value


package CSS_Selector_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TagName_AttributeName_AttributeValue_LaunchGoogle_TypeIndia {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//css selector TagName, Attribute Name and Attribute Value syntax----> TagName[AN='AV']
		                       // in xpath similafrly we sue to write as ----> //TagneName[@AN='AV']
		WebElement Search= driver.findElement(By.cssSelector("textarea[name='q']"));
		Search.sendKeys("India");
	}
}
