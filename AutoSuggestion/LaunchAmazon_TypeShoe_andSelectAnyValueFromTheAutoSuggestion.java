//Launch amazon search shoe and will get the autosuggestion and select any value from it   


package AutoSuggestion;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchAmazon_TypeShoe_andSelectAnyValueFromTheAutoSuggestion {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	
	//type shoe in search box
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
	
	//will get the autosuggestion 
	Thread.sleep(1000);
	
	//store autosuggestion in the list --->xpath coming from grandparent ,parent and child inspect any one autosugWebElementd will get the xpath
	
	List<WebElement> e1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	

	int count =e1.size(); // will return the size my list is having and list will be having those many elements which are provided by the autosuggestion 
System.out.println(count);
	
	//will click on the last autosuggestion 
	e1.get(count-1).click();
	
}
}
