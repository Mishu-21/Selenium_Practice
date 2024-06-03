package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class Problem1_StepsToTakeSS {
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
  //Lets take the ss after clicking 
  
  
  //Step 1: upcaste driver -->TakesScreenshot
    TakesScreenshot t1=driver; //implicit way
  //  TakesScreenshot t1=(TakesScreenshot)driver; //explicit way
    
    //Step2-->utilise TakesScreenshot method which is getScreenshotAs() and it is source location so store it  -->therefore used File source to store ss
    File source =t1.getScreenshotAs(OutputType.FILE); //getScreenshotAs() accepts the parameter which we can get to know by just hover over getScreenshotAs() 

   /*
    step3: defining destination location where we need to store the ss
    
    so go to the package -->which is screenshot---> right click -->properties and copy the location ----->we have give the location as package name only  which is C:\Users\UFL IT 2\eclipse-workspace\Selenium\src\Screenshot
    but my screenshot must have a name so after paste the location of ss write \\screenshot_name.png  (.png bcz extension of the image)
   which is ------->   C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot\\SunMoon.png
    */
    
    File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot\\SunMoon.png");

    
    //step4-->copy file/screenshot from source to destination
    FileHandler.copy(source, destination);  //will throw the exception IOException
    
    
    //now run code-->and after running refresh the screenshot project ---> and we will see my ss is there
    
    /*
     as many time i will run my code my ss is getting replaced by the new one 
    why it is getting replaced because 
    my name of every screenshot is same which is SunMoon.png

   */

}

}
