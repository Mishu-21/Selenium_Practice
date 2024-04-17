package Selenium_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn_amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		//launch sihn-in browser url
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	 
		//maximise the screen
		driver.manage().window().maximize();
		
		//Click on email tab and enter ur emailor phone number 
        driver.findElement(By.name("email")).sendKeys("+919899653182");
        
        //click on continue button
        driver.findElement(By.id("continue")).click();
        
      //Click onpswd tab and enter ur  pswd
        driver.findElement(By.name("password")).sendKeys("Himanshi21@");
        
      
        //click on sign-in button
        driver.findElement(By.className("a-button-input")).click();
	}

}
