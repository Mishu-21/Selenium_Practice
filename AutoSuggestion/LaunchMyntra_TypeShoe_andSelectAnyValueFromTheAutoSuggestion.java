//Launch myntra search shoe and will get the autosuggestion and select any value from it   

//as on this page right click was not working so do f12 to inspect the page and also pause the screen while writing xpath for autosuggestion as woh gayab ho raha hai baar baar 
package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchMyntra_TypeShoe_andSelectAnyValueFromTheAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		
		//type shoe in search box --and can use this rule ie combination of relatiove and absolute xpath if normal xpath is nt working ie its mandatory to use it only with autosuggestion 
		driver.findElement(By.xpath("//div[@class='desktop-bound']/div/input")).sendKeys("shoe");
		
		Thread.sleep(1000); //wait sometime to select any element 
		
		//now select any value from the autosuggestion ,first store it in List<WebElement>
		
		List<WebElement> e1 =driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li"));
       int count=e1.size();	
       System.out.println(count);
       
       
       //select any element from autosuggestion 
       e1.get(count-2).click(); //will select last second element
	
	}

}
