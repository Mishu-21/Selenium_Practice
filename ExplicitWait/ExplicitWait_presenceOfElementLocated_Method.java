//important topic

package selenium_Basic_And_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Presence of Element Located - It checks whether the element which got located through a locator is present in the webpage or not.

public class ExplicitWait_presenceOfElementLocated_Method {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
     driver.get("https://www.google.com/");
       WebElement search=driver.findElement(By.name("q"));

         //define explicit wait 

      WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
     //now condition wait until my condition is met
      w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//s")));
//not important to write xpath as its By.so can use any locator 
      
      /*presenceOfElementLocated() method means wait until the element is present By 
	
	means present of the element  located by the particular syntax
	
	wait until whose element is present and its xpath is this...defined in bracket 
	
	*/
	}

}
