//launch zoom and click on meet and than click on host a meeting 

package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class zoom_Launch {

	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.zoom.com/");
	    driver.manage().window().maximize();
	    
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    WebElement DD= driver.findElement(By.xpath("(//ul[@class='main-nav__list main-nav__list--mobile']/li)[4]"));
	    DD.click();
	    driver.findElement(By.partialLinkText("Host a meeting")).click();
	    
	   
	    
	}
}
