/*

 titleIs meaning --->that my whole title is 

 titleContains meaning--->My title contains any part which is defined in the condition means partial title 
 ie suppose my title is manish kumar tiwar 
 so if we write titleContains(kumar) --->it will work 
 
 
 TitleContains :It checks whether the title of the located element has the letters present in it and those letters must be case sensitive.
 TitleIs: It checks the title of the located element
 */


package selenium_Basic_And_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_TitleIs_TitleContains_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://www.google.com/");
         WebElement search=driver.findElement(By.name("q"));

        //define explicit wait 

       WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
       //now condition wait until my condition is met
     //    w1.until(ExpectedConditions.titleIs("Google")); //if will pass 'google' ie small g it will fail as it is case sensitive 
        //as titleIs is expecting string parameter and string is case sensitive  
       
       w1.until(ExpectedConditions.titleContains("Goog")); //will pass the condition and type further
              
         search.sendKeys("Sunny Deol ");
         search.sendKeys(Keys.ENTER);
	}

}
