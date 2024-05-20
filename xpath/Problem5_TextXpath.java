//launch amazon.in ,hoverover accounts and click on sign in using text xapth 

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Problem5_TextXpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch amazon.in
		driver.get("https://www.amazon.in/");
		
		WebElement account=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		
				
				
		Actions a=new Actions(driver);
		a.moveToElement(account).perform();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[.='Sign in'])[1]")).click();
		
	}

	
}
