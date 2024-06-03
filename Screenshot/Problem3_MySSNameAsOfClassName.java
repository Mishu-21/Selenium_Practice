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

public class Problem3_MySSNameAsOfClassName {

	
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
	   HOW TO GIVE class NAME as my SS name----------->
	       using getClass()--->about getclass() see code--->GetClassMethod
	       
	  */
	    
//	  File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot\\"+new Problem3_MySSNameAsOfClassName ().getClass()  + Math.random() +".png");

	    
	/*
	 refresh the project and we will see my ss is saved by name 
	               class Screenshot.Problem3_MySSNameAsOfClassName0.15959433809502044.png
	               
	               to remove class from ss name we can use substring method also 
	               and as substring can only be used with string as its a string method
	               
	               so lets first convert my object to string using toString()
	 */
	   
	  Problem3_MySSNameAsOfClassName p1= new Problem3_MySSNameAsOfClassName(); 
	  String s1=p1.toString(); //convert object p1 to string type 
	 //System.out.println(s1); //output---> Screenshot.Problem3_MySSNameAsOfClassName@7ceb3185  so ab last mai se @7ceb3185 yeh htane ke liye use substring concept 
	  
	//  System.out.println(s1.substring(0, s1.length()-9)); //output---> Screenshot.Problem3_MySSNameAsOfClassName
	  
	  /*
	  File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot\\"+s1.substring(0, s1.length()-9)+ ".png");
	  when used above line to save the ss --> the name of ss was "  Screenshot.Problem3_MySSNameAsOfClassName.png  "

*/
		  File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot\\"+s1.substring(0, s1.length()-9)+ Math.random() + ".png");
  //name of ss-------->Screenshot.Problem3_MySSNameAsOfClassName0.5054588639507724.png when runned for the first time
	

	    FileHandler.copy(source, destination); //Math.random() +
	    
	    
	

	}
}
