//application given by manish --> write something in username text field with the help of absoluteXpath

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem1_AbsoluteXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/UFL%20IT%202/Desktop/imp/Study_Himanshi/GroTechMinds/Study%20Material/learningHTML1.html");

		//absolute xpath for uername field
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("himanshi");
		
		//select male using absolute xpath
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
	}

}
