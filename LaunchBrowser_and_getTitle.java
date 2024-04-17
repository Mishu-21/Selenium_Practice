package Selenium_Concept;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class LaunchBrowser_and_getTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		//this will launch empty browser 
		/*
		 * with which package it will come ' org.openqa.selenium.chrome.ChromeDriver;
		 */
		
		/*
		 * Methods of WebDriver 
		 * 1.get(String URL)
		 * 2.close()
		 */
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		//to get the title of any launch page----------->getTitle() is mthod 
	String title=	driver.getTitle();
		System.out.println(title);
		//this will close the driver whether my browser will be launched 
		driver.close();
		/*
		 * //Launch Firefox 
		 * FirefoxDriver driver1=new FirefoxDriver();
		 * driver1.get("https://www.google.com/");
		 *  Thread.sleep(3000); 
		 *  driver1.close();
		 * 
		 * //launch Edge 
		 * EdgeDriver driver4 = new EdgeDriver();
		 * 
		 * 
		 * //Internet Explorer
		 *  InternetExplorerDriver driver2 = new InternetExplorerDriver();  
		 *  driver2.get("https://www.google.com/");
		 * Thread.sleep(3000); 
		 * driver2.close();
		 */
	}

}
