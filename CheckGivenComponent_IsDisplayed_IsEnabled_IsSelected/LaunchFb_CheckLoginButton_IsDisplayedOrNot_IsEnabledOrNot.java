package CheckGivenComponent_IsDisplayed_IsEnabled_IsSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFb_CheckLoginButton_IsDisplayedOrNot_IsEnabledOrNot {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		//Launch facebook
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.tagName("button"));
		
		//to check is login button is displayed or not 
		boolean b1=login.isDisplayed();
		
		////Now also  check is login button is enabled or not 
		boolean b2=login.isEnabled();
		
		//now if both are true click on login button 
		if(b1 && b2)

		{
			login.click();
		}

	}

}
