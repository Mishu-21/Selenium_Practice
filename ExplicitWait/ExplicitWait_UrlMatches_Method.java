//URL matches- It checks whether a particular word or letter is present in the given url or not

package selenium_Basic_And_locators;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_UrlMatches_Method {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.in");

        driver.manage().window().maximize();
  	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

      boolean isUrlCorrect2 =    wait.until(ExpectedConditions.urlMatches("amazon"));

      System.out.println(isUrlCorrect2);
	}
}
