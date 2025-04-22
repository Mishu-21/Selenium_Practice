//LAUNCH AMAZON--> add shoe to cart and move till checkout page and choose credit card option as payment and handle iframe


package selenium_Basic_And_locators;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ifRAME_AmazonToCart_PaymentAdd {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		Actions a1=new Actions(driver);
        a1.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
        
        driver.findElement(By.linkText("Sign in")).click();
        
     //  Thread.sleep(2000);
        
        driver.findElement(By.id("ap_email_login")).sendKeys("+917834898482");
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
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
        	 
        	 //now moved till checkout page
        	 
        	 //choose credit or debit card option
        	 driver.findElement(By.xpath("(//div[@class='a-radio']/label/input)[2]")).click();
        	 driver.findElement(By.xpath("(//a[normalize-space()='Save Card'])")).click();
        	 
        	 //NOW WE WILL SEE THAT TO enter the card details --> the card details are present in iframe (CHECKED THE MOST gramdparent )
        	 
        	 //now to move the control to iframe-->
        	 WebElement frame_location= driver.findElement(By.name("ApxSecureIframe"));
        	   driver.switchTo().frame(frame_location);
        	   
        	 //now my control is moved to iframe and now i can enter the values
        	   
        	   driver.findElement(By.name("addCreditCardNumber")).sendKeys("5129694809744705");  //entered card number 
        	  driver.findElement(By.name("ppw-accountHolderName")).sendKeys("Mishu");    //entered nick name 
        	  
        	  
        	  //enter expiry date of the card-->which is  prsesnt in dropdown
        	   
        	  //select month 
        	  WebElement month =driver.findElement(By.name("ppw-expirationDate_month"));
        	  Select s1=new Select(month);
        	  s1.selectByValue("5");
        	  
        	  
        	  WebElement year =driver.findElement(By.name("ppw-expirationDate_year"));
        	  Select s2=new Select(year);
        	  s2.selectByVisibleText("2035");
        	  
        	  //click on save button
        	  driver.findElement(By.xpath("(//span[normalize-space()='Save Card'])")).click();
        	  
        	  //will give output as card details wrong so now click on cross sign 
        	  driver.findElement(By.xpath("//button[@class=' a-button-close a-declarative']")).click();
        	  
        	  //now move the control out of iframe 
        	  driver.switchTo().defaultContent();
        	  
        	  //to check that i have moved outside the iframe 
        	  driver.findElement(By.xpath("(//div[@class='a-radio']/label/input)[1]")).click();
        	  
        	  
        	  
        	 
        
	}

}
