package selenium_Basic_And_locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	//launch google
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	//new syntax of implicit wait---->applicable to findelements() and findelement() method
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	//old syntax of implicit wait---->applicable to findelements() and findelement() method
	//	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);
}
}
