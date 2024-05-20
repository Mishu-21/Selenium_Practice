//Click on link by using tagname

package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileSharedByManish_ClickOnLink_UsingTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/UFL%20IT%202/Desktop/imp/Study_Himanshi/GroTechMinds/Study%20Material/learningHTML1.html");

		//click on link 
		driver.findElement(By.tagName("a")).click();
	}

}
