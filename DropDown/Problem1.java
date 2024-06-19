//Launch Amaazon from dropdown,select books and type world war in search box and click on search button 

package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Problem1 {

	public static void main(String[] args) {
		
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement cate_dd=driver.findElement(By.id("searchDropdownBox"));
	
	//select books
	Select s1=new Select(cate_dd);
	s1.selectByVisibleText("Books");
	
	
	//type world war in search box 
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("World war");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	
	;
	}

}
