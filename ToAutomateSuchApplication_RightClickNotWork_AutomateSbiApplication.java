/*
 Launch sbi appliaction ands see that we are not able to inspect the page

 
 in such case use F12 to inspect the page 
 once we click f12 we will get the html code so agr f12 se work nhi hua tioh press fnand f12
 
 than ek\ arroe dikheha vha click karo fir screen par jakar hover karo dikh gaya html mai ki kaha haoi woh element 
 
 https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm --->url
 kbhi kbhi yeh aayega session fail so tb launch sbi click new user and do 
 ie steps
 https://retail.onlinesbi.sbi/retail/login.htm --> launch login page 
 Click on continue to login
 than click on new user .register user etc 
 */

/*
 Now automate sbi application
 and enter account number ,cif number, branch code,country,register mobile number,facility required and click i agree 
 */

package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToAutomateSuchApplication_RightClickNotWork_AutomateSbiApplication {

	public static void main(String[] args) throws InterruptedException {
		
                        ChromeDriver driver=new ChromeDriver();
                        
                        driver.get("https://retail.onlinesbi.sbi/retail/newuserreg.htm");
                        driver.manage().window().maximize();
                        //as right click is not working click f12 and than inspect 
                        driver.findElement(By.id("nextStep")).click();
                        
                        //enter Account Number 
                        driver.findElement(By.id("accountNo")).sendKeys("123467");
                        Thread.sleep(500);
                        
                        //enter cif code
                        driver.findElement(By.id("cifNo")).sendKeys("123467");
                        Thread.sleep(500);
                        
                        //enter branch code
                        driver.findElement(By.id("branchCode")).sendKeys("123");
                        Thread.sleep(500);
                        
                       //from dropdown choose country 
                        Select s1=new Select(driver.findElement(By.id("selCountry")));
                        s1.selectByVisibleText("India");
                        Thread.sleep(500);
                        
                        //enter register mobile number 
                        driver.findElement(By.id("mobileNo")).sendKeys("708079797979");
                        Thread.sleep(2000);
                        
                        //from dropdown choose option from facility Required 
                        Select s2=new Select(driver.findElement(By.id("txnRights")));
                        s2.selectByVisibleText("Limited Transaction Rights");
                        Thread.sleep(2000);
                        
                        
                        //Click on I agree
                        driver.findElement(By.id("iAgreeconsent")).click();
                        
	}
	

}
