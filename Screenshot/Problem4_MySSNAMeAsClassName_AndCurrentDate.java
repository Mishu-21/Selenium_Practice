package Screenshot;

import java.io.File;
import java.io.IOException;

import java.util.List;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Problem4_MySSNAMeAsClassName_AndCurrentDate {
public static void main(String[] args) throws InterruptedException, IOException {
	
	 ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/"); driver.manage().window().maximize();
	  
	 
	  driver.findElement(By.name("q")).sendKeys("Bangalore"); Thread.sleep(2000);
	 List<WebElement>
	 e1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li")); 
	
	  int count =e1.size(); e1.get(count-1).click();
	 
	  Thread.sleep(2000);
	 
  
  Date d=new Date(); 
  Date d1=new Date(d.getTime()); //giving us Human understandable time
  
  String currentTime=d1.toString();  //converted d1 in string 
	//System.out.println(currentTime);
	
	String month=currentTime.substring(4,7);
	//System.out.println(month);

	String date=currentTime.substring(8,10);
	//System.out.println(date);
	
	
	String year=currentTime.substring(currentTime.length()-4);
	System.out.println(year);
	
	System.out.println(month.concat("/").concat(date).concat("/").concat(year));
  
	TakesScreenshot t1=driver; //implicit way

    File source =t1.getScreenshotAs(OutputType.FILE); 
    
    /*
     In SS to add current date also 
     */

    
    
//	  File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot\\"+new Problem3_MySSNameAsOfClassName ().getClass()  + Math.random() +".png");

//  File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot" + new Problem4_MySSNAMeAsClassName_AndCurrentDate().getClass()  + Math.random() +".png");

/*
  File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot" + new Problem4_MySSNAMeAsClassName_AndCurrentDate().getClass()  + Math.random() +month.concat("/").concat(date).concat("/").concat(year) +".png");

when we tried to save above ss with that name so give

Error----------->
Exception in thread "main" java.io.FileNotFoundException: C:\Users\UFL IT 2\eclipse-workspace\Selenium\src\Screenshotclass Screenshot.Problem4_MySSNAMeAsClassName_AndCurrentDate0.41107358402777994Jun\03\2024.png (The system cannot find the path specified)
	at java.base/java.io.FileOutputStream.open0(Native Method)
	at java.base/java.io.FileOutputStream.open(FileOutputStream.java:293)
	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:235)
	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:184)
	at org.openqa.selenium.io.FileHandler.copyFile(FileHandler.java:131)
	at org.openqa.selenium.io.FileHandler.copy(FileHandler.java:110)
	at Screenshot.Problem4_MySSNAMeAsClassName_AndCurrentDate.main(Problem4_MySSNAMeAsClassName_AndCurrentDate.java:72)



because my image cannot be saved by using "/" this when we try to add date in that format 
  */  
    
   
  
    File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Screenshot" + new Problem4_MySSNAMeAsClassName_AndCurrentDate().getClass()  + Math.random()+"TodayDATE"+ date.concat(month).concat(year)  + ".png");
//ss saved by -->Screenshotclass Screenshot.Problem4_MySSNAMeAsClassName_AndCurrentDate0.9492231693230749TodayDATE03Jun2024.png name
   FileHandler.copy(source, destination); 
    
    
}
}
