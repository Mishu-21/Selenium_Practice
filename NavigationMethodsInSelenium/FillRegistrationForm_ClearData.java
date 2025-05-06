/*ques---> In the registration form fill the data and now dont submit it  and make the registration page as it is before

Solution:-
so now after filling the form  we need to refresh the screen as per the question
*/
package NavigationMethodsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillRegistrationForm_ClearData {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.id("First Name")).sendKeys("Himanshi");
		driver.findElement(By.id("Last Name")).sendKeys("Chauhan");
		driver.findElement(By.id("Address")).sendKeys("Y-82/B Sector -12 Noida");
		driver.findElement(By.id("email")).sendKeys("grotechminds@gmail.com");
		driver.findElement(By.id("Phone")).sendKeys("8667890645");
	//	driver.findElement(By.xpath("(//div[@class='gender-options']/label/input)[2]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement genderRadioBtn = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		js.executeScript("arguments[0].scrollIntoView(true);", genderRadioBtn);
		
		/* when we directly trying to click 
          genderRadioBtn.click();
          //done chatgpt for the solution
     exception showing as---->  org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element is not clickable at point (360, 803)
            which means
            This means that something is visually covering the radio button (like a popup, loader, or hidden overlay), even though it's in the DOM and appears visible.
           
           so when used below line the exception disappear
	*/
		js.executeScript("arguments[0].click();", genderRadioBtn);

		//This avoids the interception by not using click() directly, which is sensitive to overlapping elements.

		Thread.sleep(2000);
		
		//now to make the registration page as it is before use 
		driver.navigate().refresh();
	}

}
