package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Problem3_Grotech_DropDown_Problem1_2 {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		/*
		 * driver.get(
		 * "https://grotechminds.com/courses/automation-software-testing-course/");
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//a[@class='elementor-item'])[6]")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[@href='https://grotechminds.com/dropdown/']"
		 * )).click();
		 */
		
		
		driver.get("https://grotechminds.com/dropdown/");
		
		//1. Write A Code To Select Demo2 Using Select By Visible Text.
		WebElement dd1=driver.findElement(By.id("Choice1"));
		Select s1=new Select(dd1);
		s1.selectByVisibleText("Demo2");
		
		//2. Write A Code To Select SQL 15 Using Select By Value.
		WebElement dd2=driver.findElement(By.id("Choice2"));
		Select s2=new Select(dd2);
		s2.selectByValue("practice15");
	}

}
