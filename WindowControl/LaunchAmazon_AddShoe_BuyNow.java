//launch amazon, search shoe and click on 1st shoe and click on buyNow and reach till payment page

package WindowControl;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon_AddShoe_BuyNow {

	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("ap_email")).sendKeys("+917834898482");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Himanshi21@Chauhan");
	driver.findElement(By.id("signInSubmit")).click();
	
	
	WebElement search	=driver.findElement(By.id("twotabsearchtextbox"));
	
	search.sendKeys("shoe");
	search.sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]")).click();

	//now to move control

	Set<String> p_cId=driver.getWindowHandles();
	 Iterator<String> pc =p_cId.iterator();
	 String Parent_Id=pc.next();
	 String Child_Id=pc.next();
	 driver.switchTo().window(Child_Id);  
	 
	 //click to buy now
	 
	 driver.findElement(By.id("buy-now-button")).click();
	}
}
