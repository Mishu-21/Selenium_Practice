//URL contains: It checks the presence of a particular word or letter in the given url

package selenium_Basic_And_locators;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_UrlContain_Method {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.in");

        driver.manage().window().maximize();
  	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        boolean isUrlCorrect = wait.until (
                ExpectedConditions .
                   urlContains("in"));
      System.out.println(isUrlCorrect);
    	}
}
