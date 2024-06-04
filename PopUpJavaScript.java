package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpJavaScript {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		WebElement popUp_Click=driver.findElement(By.xpath("//button[.='Click ']"));
	  Thread.sleep(1000);
	  popUp_Click.click();
	  Thread.sleep(1000);
	driver.switchTo().alert().accept();
	}
	
}
