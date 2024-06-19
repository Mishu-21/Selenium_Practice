//from grotechminds Drag postman to target location
 



/*
 Drag and drop can be done with the help of  Actions class

 method used is draganddrop()
 
  syntax:
  Actions a1=new Actions (driver);
  a1.dragAndDrop(WebElement source,WebElement target).perform
 */

package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_GroTechWebsite {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		//jo elemnet drag krna hai uski xpath likho 
		WebElement dragableElement=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		
		//jaha drop krna hai vha ki location ki  xpath likhi
		WebElement dropableElement=driver.findElement(By.xpath("(//div[@id='div2'])"));

		//now to drag and drop use action class
		Actions a1=new Actions(driver);  //as it is parameterized constructor so to invoke driver pass driver in action class   
		
		
		a1.dragAndDrop(dragableElement,dropableElement).perform();

	}

}
