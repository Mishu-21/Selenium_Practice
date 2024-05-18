//Launch fb,click on new user,enter ur first name ,last name ,email ,pswd,dob

package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Problem2 {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch fb
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//click on create new  user button 
	WebElement click_on_CreateNewUser	=driver.findElement(By.partialLinkText("Create new account"));
	click_on_CreateNewUser.click();
	Thread.sleep(2000);
	
	//click on first name tab and enter ur firstname
	driver.findElement(By.name("firstname")).sendKeys("Himanshi");
	Thread.sleep(1000);
	
	//Click on last name and enter ur last name 
	WebElement surname=driver.findElement(By.name("lastname"));
	surname.sendKeys("Chauhan");
	Thread.sleep(1000);
	//Click on email and phone number tab n enter it 
	driver.findElement(By.name("reg_email__")).sendKeys("+919667203182");
	Thread.sleep(1000);
	//Click on pswd tab and enter pswd
	driver.findElement(By.id("password_step_input")).sendKeys("anything");
	Thread.sleep(1000);
	
	//now from the dropdown select dob 
	WebElement date=driver.findElement(By.id("day"));
	Select s1=new Select(date);
	s1.selectByIndex(20); //select date by using selectByIndex()
	Thread.sleep(1000);
	
	
	//select month using selectByVisbleText()
	WebElement month=driver.findElement(By.id("month"));
	Select s2=new Select(month);
	
	s2.selectByValue("1");
	Thread.sleep(1000);
	
	//select year using selectByValue()
	WebElement year=driver.findElement(By.id("year"));
	Select s3=new Select(year);
	s3.selectByValue("2000");
	Thread.sleep(1000);
	
	//select female
	driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
	Thread.sleep(1000);
	driver.close();

	}

}
