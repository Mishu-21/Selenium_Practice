package Selenium_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		//launch google
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//on the tab search india
		
		//driver.findElement(By.className("gLFyf")).sendKeys("India"); //here used classname locator
		//driver.findElement(By.name("q")).sendKeys("India"); //here we used name locator 
				
		/*
		 * //and clich on google search button
		 * driver.findElement(By.name("btnK")).click();
		 * 
		 * 
		 * aise kar rhe hai toh india type krke humko dropdown aa raha hai
		 * 
		 * so iske jgha we can press eneter 
		 * 
		 * now how to press enter 
		 */
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}

}
