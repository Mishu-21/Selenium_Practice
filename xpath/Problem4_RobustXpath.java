//login fb using an and av xapth 

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem4_RobustXpath {

	public static void main(String[] args) throws InterruptedException {


ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch fb
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//email field
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Himansh");
		Thread.sleep(500);
		
		//pswd field 
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Himansh");
		
		//login field
		driver.findElement(By.xpath("//button[@name='login']")).click();

		
		
		
		
	}

}
