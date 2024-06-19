package PageObjectModel_TestPackage_Fb;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel_SourcePackage_Fb.Problem1_FB_Login_Page;

public class Problem1_TestCase1_LoginFB {

	@Test
	public void Login_To_FB()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
		//declared  public methods in source package bcz as  we are dealing with 2 package so only public can be accessed outside 
		
		//now to call method of sourcepackage in testpackage we will create the object of source package  class
	
		Problem1_FB_Login_Page f1=new Problem1_FB_Login_Page(driver); // need to import also so ----> import PageObjectModel_SourcePackage_Fb.Problem1_FB_Login_Page;  and as we have created its constructor parameterised so here also pass the parameter while creating an object ie step 3 

		//with help of reference variable now we can  call it method
		f1.username_method();   //calling username method 
		f1.password_method();   //calling password method 
		f1.loginButton_method();   //calling login button  method 
		
		//when we try to run this test without step 3 of source package--->We get java.lang.NullPointerException 
	}
}
