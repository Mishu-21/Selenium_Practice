/*

Methods of Explicit Wait:
The methods of explicit wait ensures that the webpages or websites loads properly and certain conditions are satisfied before actions are performed on them through test scripts.


*/
package selenium_Basic_And_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_LaunchGoogle_TypeSomething_PassScenerio {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://www.google.com/");
         WebElement search=driver.findElement(By.name("q"));

        //define explicit wait 

       WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
       //now condition wait until my condition is met
         w1.until(ExpectedConditions.titleIs("Google")); //if will pass 'google' ie small g it will fail as it is case sensitive 
        //as titleIs is expecting string parameter and string is case sensitive  
         search.sendKeys("Sunny Deol ");
         search.sendKeys(Keys.ENTER);


	}

}
