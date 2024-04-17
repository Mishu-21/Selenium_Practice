package Selenium_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazonin_ClickCustomerService_ClickUrOrder_LoginToAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver driver=new ChromeDriver();
		
//and we must not be log-in to amazon when we do this 


		//launch amazon.in
		driver.get("https://www.amazon.in/");
		//Max window
		driver.manage().window().maximize();
		
		//Click on Customer Service 
		driver.findElement(By.linkText("Customer Service")).click();
		
		//Click on Your orders
		
		//driver.findElement(By.linkText("Your Orders")).click();
		driver.findElement(By.partialLinkText("Track packages")).click();
		
		//Click on email tab and enter mobile
		driver.findElement(By.id("ap_email")).sendKeys("+919667203182");
		
		//Click on pswd tab and enter pswd
		driver.findElement(By.id("ap_password")).sendKeys("Himanshi21@");
		
		
		//click on signin button 
		driver.findElement(By.id("signInSubmit")).click();
		
	}

}
