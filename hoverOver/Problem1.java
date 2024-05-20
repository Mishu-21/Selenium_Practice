//launch amamzon,hover over account and click on sign in 

package hoverOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        
        /*
         1st way
        
        WebElement e1=driver.findElement(By.id("nav-link-accountList"));
        
        //perform hoverover
        Actions a1=new Actions(driver);
        
        a1.moveToElement(e1).perform();
        
         */
        
        //2nd way 
        Actions a1=new Actions(driver);
        a1.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
        
        driver.findElement(By.linkText("Sign in")).click();
	}

}
