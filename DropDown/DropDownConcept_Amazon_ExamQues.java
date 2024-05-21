//Write a logic for dropdown and attach your code here. take amazon application


package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownConcept_Amazon_ExamQues {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		
		//maximise window
		driver.manage().window().maximize();
		
		//launch amazon
		driver.get("https://www.amazon.in/");
		WebElement cate_dd=driver.findElement(By.id("searchDropdownBox"));
		
		//from category drop down we are selecting car and motorbike using selectByVisibleText() method 
		Select s1=new Select(cate_dd);
		s1.selectByVisibleText("Car & Motorbike");

	}

}
