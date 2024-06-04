package selenium_Basic_And_locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenAnyLinkInIncognitoMode {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//right click on gmail 
		Actions a1=new Actions(driver);
		a1.contextClick(driver.findElement(By.linkText("Gmail"))).perform();
	
		/*
		 so now after doing right click --> to choose any option we can make use of Robot class
		  
		  here robot class n java is generally used to stimulate keyboard and mouse operation/functionality
		   */
		
		//Step 1---> Create object of robot class
		Robot r1=new Robot();   //throws exception "AWTException"  and import import java.awt.AWTException;
		//import java.awt.Robot;  --> this come from java isliyi java import kiya hai 

		
		//Step2----> Utilise its method keyPress and inside the method we can use KeyEvent class and its method VK_DOWN----> which will move my cursor in down  
		r1.keyPress(KeyEvent.VK_DOWN);  //1st down ---> vk is virtual keyboard
		Thread.sleep(2000);
		//so now as i need to open my link in incognitio mode which is 3rd option when we do right click so down karo 3 baar and than click 
		r1.keyPress(KeyEvent.VK_DOWN);  //2nd down
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN); //3rd down
		Thread.sleep(2000);
		//and than we need to click 
		r1.keyPress(KeyEvent.VK_ENTER);
	}

}
