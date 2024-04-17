package Selenium_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNaukri_ClickOnRegister_ClickContinueWithGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		//launch naukri.com
		driver.get("https://www.naukri.com/");
		
		//Max window
				driver.manage().window().maximize();
				
		//Click on Register link
				driver.findElement(By.linkText("Register")).click();
				
		//Click on Continue with google
				driver.findElement(By.className("google-text")).click();	
	}

}
