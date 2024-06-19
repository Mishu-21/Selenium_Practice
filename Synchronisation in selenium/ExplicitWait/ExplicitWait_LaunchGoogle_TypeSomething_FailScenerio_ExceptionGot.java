/*
 EXPLICIT WAIT----> wait until the condition met 
 
 syntax:
   WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));  -->//parameterized constructor WebDriverWait() 
   w1.until(ExpectedConditions.listOfStaticMethod); --->ExpectedConditions is the class

   
   here "ExpectedConditions" is the class and all the method which it have is static method
 */



package selenium_Basic_And_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_LaunchGoogle_TypeSomething_FailScenerio_ExceptionGot {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.google.com/");
WebElement search=driver.findElement(By.name("q"));

//define explicit wait 

WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
//now condition wait until my condition is met
w1.until(ExpectedConditions.titleIs("manish"));

/*
above 2 line meaning is 
created object of WebDriverWait and we will wait maximum of 10 second ie i am excepting my application to be fully loaded in 10 second
so if it is going beyond it we will se another exception 
but now after waiting for 10 second
than before typing we will wait until my title is not going to be manish
and if its manish we will type and move forward and of not getting title as manish we will wait for more time 



so now it is never going to type sunny deol as title is never gone a be manish 

exception which we get is "TimeOutException"

error getting as: 
Exception in thread "main" org.openqa.selenium.TimeoutException: Expected condition failed: waiting for title to be "manish". Current title: "Google" (tried for 10 second(s) with 500 milliseconds interval)

*/

search.sendKeys("Sunny Deol ");
search.sendKeys(Keys.ENTER);

	}

}
