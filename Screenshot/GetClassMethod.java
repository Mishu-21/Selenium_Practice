package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetClassMethod {

	
	
	public static void main(String[] args) {
	


		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Gmail")).click();
		
		/*
		 getClass() is the method of object class---> and my class GetClassMethod is inheriting object class only
		 so by creating  GetClassMethod class object we can utilise getClass() directly 
		 
		 
		 */
		
		GetClassMethod g1=new GetClassMethod();
		System.out.println(g1.getClass()); //OUTPUT-------> "class selenium_Basic_And_locators.GetClassMethod"  which is packageName.className
		
		
	}
}
