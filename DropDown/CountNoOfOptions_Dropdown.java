package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountNoOfOptions_Dropdown {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement cate_dd=driver.findElement(By.id("searchDropdownBox"));
		
		//select books
		Select s1=new Select(cate_dd);
		s1.selectByVisibleText("Books");
		
		//so we can use a method name getOptions() which has return type of List of webelement
		
		List<WebElement> dropDown_count=s1.getOptions();
		
		// than list has one more method which is size()
		System.out.println(dropDown_count.size());  //46
		
		//give the count of no. of optuons we have in the dropdown
		
		
	}
}
