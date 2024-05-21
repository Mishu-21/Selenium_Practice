////Launch amazon search shoe and will get the autosuggestion and select any value from it   


package AutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LaunchFlipkart_TypeShoe_andSelectAnyValueFromTheAutoSuggestion_PauseUrScreen {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		//type shoe in search box
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("shoe");
		Thread.sleep(1000); //when time was not added here it was showing the error so add time here 
		
		/*now after searching shoe we are gettimg the autosuggestion but once we tryto inspect the autosiggestion it goes away
		what to do in this case???
				
				IN SUCH CASE 
				do imspect and utilise the source tab
				in source tab we have the button like || which is pause button 
				so after seaching go to source and pause ur screen 
				so now autosuggestion will not go away 
				
				but its ovios that right click will also not work on the screen
				
				so we can do one thing 
				jo bhi option apko dikh rahe hai autosuggestion mai try to search for that 
				
				and jaise he mil jayega u can get ur child ,parent and grandparent and now we can write the xpath 
				
				
				and do store the autosuggestion inListst<WebElement>
				
				*/
		
		List<WebElement> e1=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		
		int count=e1.size();
		System.out.println(count);
		
		Thread.sleep(1000);
	
		e1.get(count-1).click(); //this will select the last value from the autosuggestion 

	}

}
