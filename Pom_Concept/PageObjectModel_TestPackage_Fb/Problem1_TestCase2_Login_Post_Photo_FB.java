package PageObjectModel_TestPackage_Fb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel_SourcePackage_Fb.Problem1_FB_Login_Page;

public class Problem1_TestCase2_Login_Post_Photo_FB {

	//now here also first we need to do login 
	
	@Test
	public void Login_Post_Photo_FB()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		Problem1_FB_Login_Page f1=new Problem1_FB_Login_Page(driver); 

		f1.username_method();   
		f1.password_method();  
		f1.loginButton_method();   
		
		//login step will remain constant only additional posting a photo steps will come 
		
		//benefit kya hai pom ka---> locating the elements once ie in source package and using it in multiple  testcase
		
	   
	}
}
