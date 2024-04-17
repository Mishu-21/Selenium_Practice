package Selenium_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver=new ChromeDriver();
		
		//Launch facebook
		driver.get("https://www.facebook.com/");
		
		//send keys on email field
		driver.findElement(By.id("email")).sendKeys("himanshi@gmail.com");
		
		//send keys on password field
				driver.findElement(By.id("pass")).sendKeys("hiamhd");
				
		//click on login button
			//	driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click());  //as yeh classname tag se value junk lg rhe hai isliyi use another locator 
				driver.findElement(By.name("login")).click();	
	}

}
