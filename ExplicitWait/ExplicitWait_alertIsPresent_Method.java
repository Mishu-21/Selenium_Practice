package selenium_Basic_And_locators;

//   https://grotechminds.com/explicit-wait-and-its-methods-in-selenium-webdriver/
//Alert is Present: It is used to detect the presence of any alert or popup

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_alertIsPresent_Method {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://grotechminds.com/javascript-popup/");
         
        driver.findElement(By.className("btnjs")).click();
        
        /*after clicking a popup will come 
        will wait until popup nhi aajata and jaise he aa jata hai will click on popup 
        popup means javascript popup 
        
         */
         
         WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
         w1.until(ExpectedConditions.alertIsPresent()); //will pass the condition and move forward 
       
        // alertIsPresent() will only check the alert is present or not 
         
         //if present accept it 
         driver.switchTo().alert().accept();
         


	}

}
