/*
 Driver has 2 more methods----> 
    i)getWindowHandle(): give the id of parent tab/browser or the tab/browser which has the control
                         Return type is String
    
    ii)getWindowHandles(): give the id of both parent and child browser/tab
                           Return type is Set of string type ie. Set<String>
 
 */



package WindowControl;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveControl_FromOneWindowToAnother {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//will give the id of parent window
		String parent=driver.getWindowHandle();//will give the parent id only 
		System.out.println(parent);  //output of getWindowHandle()
		System.out.println("------------------************************-----------------");
	
	WebElement search	=driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		
		//click on 1st shoe after searching shoe
driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]")).click();

//so now as 2 screens are opened so to get id of both the screen we can use getWindowHandles()
Set<String> p_cId=driver.getWindowHandles();
System.out.println(p_cId); //will give the parent and child tab ie output of getWindowHandles()

//one thing to rememeber about getWindowHandles() ie ----> it will give 100 id but my 1st id will be parent id and than 99 rest is my child id 


//now we need to add the shoe to the cart

/*
 but as we see new tab is opened
 so to do add to cart 
 first we need to move our control from parent to child 
 */
	
//so we can use Iterator method to iterator over values which are stored in my set 
     Iterator<String> pc =p_cId.iterator();
     //so now we can use its next() method to get the id 
     /*
      but jab ek baar use kiya next() so humko parent id mile and next time use kiya toh next id mile 
      and 1st id is paent and 2nd id is child
      Therefore we make use of next() two time to get the id of child
      */
     
     String Parent_Id=pc.next(); //will give paremt id
     System.out.println(Parent_Id);  //output of pc.next() -->1st used --->give parent id
     String Child_Id=pc.next();//will give child id
     System.out.println(Child_Id); //output of pc.next() -->2st used --->give Child id
	//separate id isliyi ki so that we can move the control from paremt to child
     
     
     //synatx to move control from paremt to child is 
     driver.switchTo().window(Child_Id);  //ie move control to child window
     
     //now i can add my product to cart
     
     driver.findElement(By.id("add-to-cart-button")).click();
	}
}
