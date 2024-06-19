package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Problem2_UniqueNameOfMySS {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("q")).sendKeys("Bangalore");
		
		Thread.sleep(2000);
		List<WebElement> e1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));  // return type of findElemnets is List<WebElement>
		
		int count =e1.size();
	  e1.get(count-1).click();   
	  
	  Thread.sleep(2000);
	 
	  
	  
	  
	    TakesScreenshot t1=driver; //implicit way
	
	    File source =t1.getScreenshotAs(OutputType.FILE); 

	  /*
	   HOW TO GIVE UNIQUE NAME TO SS----------->
	   
	      concatenate my name of ss with math.random()
	         we do this because if my name is not unique so it is replacing my ss everytime we r running the program
	         therefore need to give unique name to my ss so that everytime it is getting run ,my new ss is not getting replaced.
	 
	  png extension se phle math.random() isliyi define kiya bcz har photo ka extension same he hoga which is png
	  */
	    
	    File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot\\screenshot"+ Math.random() +".png");

	    
	    /*
	      now as we run my program my ss is saved with name ---->screenshot0.49908807555107404.png
	     and now if we run it million time also my name of ss will be unique
	     
	    */
	    
	    
	    FileHandler.copy(source, destination); 
	    
	    
	

	}
}
