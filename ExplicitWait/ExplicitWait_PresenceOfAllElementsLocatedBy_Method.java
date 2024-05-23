//Presence of all elements located by- It checks whether multiple elements which got located through a locator are present in the webpage or not.

package selenium_Basic_And_locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_PresenceOfAllElementsLocatedBy_Method {

	
	public static void main(String[] args) {
		ChromeDriver g1= new ChromeDriver();
		g1.get("https://www.google.com");
        g1.manage().window().maximize();



		By searchfieldgoogle = By.tagName("a");
        WebDriverWait wait = new WebDriverWait(g1,Duration.ofSeconds(10));
        List<WebElement> presence = wait.until(
                ExpectedConditions
                  .presenceOfAllElementsLocatedBy
                    (searchfieldgoogle));  //wait until tagname 'a' se sb elemnetd nhi mil jate and as more than 1 element honge isliyi stored  them in list  

//get the number of authors found
int presentcount = presence.size();
System.out.println(presentcount);
	}

}

