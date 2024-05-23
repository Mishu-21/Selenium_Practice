//Element to be clickable- It is used to check if the element which is present in the webpage is clickable or not


package selenium_Basic_And_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait_ElementToBeClickable_Method {
	

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/");
         driver.manage().window().maximize();
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
         wait.until(ExpectedConditions.titleContains("Goo"));
	    

	     WebElement search= driver.findElement(By.name("q"));
	     search.sendKeys("India");
	     search.sendKeys(Keys.ENTER);

	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[.='India']"))).click();
}
}