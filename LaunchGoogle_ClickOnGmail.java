package Selenium_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_ClickOnGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		ChromeDriver driver=new ChromeDriver();
		
		//launch google
		driver.get("https://www.google.com/");
		//Max window
		driver.manage().window().maximize();
		
		//Click on gmail link 
		//as inspect kiya toh 'a' hai iska tagname so ismai text hoga he
		
		//so mainly iss time always try to use LinkText or PartialLINKtexT locator
		
		driver.findElement(By.linkText("Gmail")).click();
		
	}

}
