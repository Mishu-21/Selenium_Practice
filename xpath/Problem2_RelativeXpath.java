//application given by manish --> write password in pswd text field with the help of relative xapth 


package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem2_RelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/UFL%20IT%202/Desktop/imp/Study_Himanshi/GroTechMinds/Study%20Material/learningHTML1.html");

		//relative xpath for pswd field
		driver.findElement(By.xpath(("(//input)[3]"))).sendKeys("hima");
		
		
	}

}
