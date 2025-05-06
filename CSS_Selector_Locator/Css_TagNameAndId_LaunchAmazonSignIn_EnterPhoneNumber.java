//launch amazon sign-in  and type phonenumber with the help of css selector Tagname and Id 


package CSS_Selector_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_TagNameAndId_LaunchAmazonSignIn_EnterPhoneNumber {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");		
		
       //css selector TagName and Id syntax----> TagName#Id_Value
       
       driver.findElement(By.cssSelector("input#ap_email")).sendKeys("8975678903");
		
	}
}
