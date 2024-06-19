//Launch google search bangalore and will get the autosuggestion and select any value from it   


package AutoSuggestion;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_typeBangalore_andSelectAnyValueFromTheAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//write something on search bar before selecting anything 
		driver.findElement(By.name("q")).sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		//step 1-->after sending banglore will get the autosugestion so store it that in findElemnets() 
	
		
		// and here list is the interface so so it is having size() as its abstract method 
		List<WebElement> e1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));  // return type of findElemnets is List<WebElement>
		
		// Step 2--->xapth is written in form that we are staring from grandparent n then parent n then child  
		
		//Step 3--->than we can use size() method and it is the abstract method which is used   to find how many methods we have in list
	System.out.println(	e1.size());// output 10
	
	
	int count =e1.size();
	
	//Step 4--->now use get(int index ) method and get any value from the list as its accept the paramter as index so it start from 0 
//	e1.get(5).click(); // now it will select 6 element but as it accept index tgerefore passing 5 as the parameter  
		
		
		/*do we also thing WebElement will also have the  size() present in t0??
		 * no as WebElemnet will have only one element so size() abstract method is not present 
		 * but List<WebElement> has multiple elemnet stored in it so it will be having size() abstarct method 
		 * 
		 *   
		
*/
	
	e1.get(count-1).click();  //will select the last value 
	}

}
