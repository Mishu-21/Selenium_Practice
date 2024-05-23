//Element to be selected : It checks the status of the particular element which is to be selected is actually selected or not


package selenium_Basic_And_locators;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 
import static org.testng.Assert.assertTrue; //phle testng nhi tha project mai isliyi was getting the error on this line



public class Explicitwait_ElementToBeSelected_Method {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		 c1.get("file:///C:/Users/UFL%20IT%202/Desktop/imp/Study_Himanshi/GroTechMinds/Study%20Material/learningHTML1.html");
		 WebElement a= c1.findElement(By.id("123"));
		 boolean boy = a.isSelected();
		 System.out.println(boy);
		if(a.isSelected()==false)
		{

			 a.click();
		}
		 WebDriverWait wait = new WebDriverWait(c1,Duration.ofSeconds(10));
		assertTrue(wait.until(ExpectedConditions.
elementToBeSelected(By.id("123")))); //testng nhi tha iss project mai phle isliyi was getting error in assertTrue
	}
}
