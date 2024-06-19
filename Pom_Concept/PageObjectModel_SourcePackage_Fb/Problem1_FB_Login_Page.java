/*scenerio-Login page of fb 
 * 
 This is the source package which  will have only login page as the scenerio
 
 */

package PageObjectModel_SourcePackage_Fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Problem1_FB_Login_Page {

	
	WebDriver driver;
	/*Step 1-->locate the elements using @FindBy Annotation
	
	So we have to locate 3 elements ie 
	i) email /phone no. field 
	ii) password field
	iii) login in field 
	*/
	
	//for email field --->first inspect it 
	@FindBy(id="email")
	WebElement username;    //return type of single element is webelement and hover over webelement and FindBy element and import it 

    //similarly locate  pwsd and login
	
	@FindBy(name="pass") // without pom concept also locator path we always define in " " similarly we did here also 
	WebElement password; 
	
	@FindBy(xpath="//button[@name='login']")
	WebElement login_button; 
	
	
	/*
	 Step 2---->create separate methods for each components to perform its action
	
	  which means for username there is a separate method ,for pswd also and for login also 
	
	  why created separate method?? so that  on its compoent we can perform some action 
	 */
	
	//method for username
	public void username_method()
	{
		username.sendKeys("sbtaghjjk");
	}
	
	//method for password
	public void password_method()
	{
		password.sendKeys("gudbdbnnkd");
	}
	
	//method for loginButton
	public void loginButton_method()
	{
		login_button.click();
	}
	
	/* Step 3---->Initializing the element using pagefactory class inside the constructor 

     ------------------>when we dont declare this step and try to run test case  --->We get java.lang.NullPointerException 
*/
	
	public Problem1_FB_Login_Page(WebDriver driver)  //create a constructor which is also parameterised 
	{
		//inside constructor we have pagefactory class and its method initElements which is static method 
		PageFactory.initElements(driver, this);
		
		//whenever my global parameter is same as local variable we can make use of this keyword 
	}
}

