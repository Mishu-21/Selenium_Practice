/*tagname of drrop down is select 
Done using select 

syntax: 
       Select s1=new select (Element);

can be handled in 3 ways:
   1.)s1.selectByValue (blue mai jo dikhte hai inspect ke baad  )
   2.)s1.selectByIndex
   3.)s1.selectByVisisbleText (Black mai jo dikhte hai inspect ke baad)
*/

package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowToHandleDropDown {

	public static void main(String[] args) {


		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement category_Dropdown=driver.findElement(By.id("searchDropdownBox"));
		//return type of findElement is WebElement
		
		Select s1=new Select(category_Dropdown);
	//	s1.selectByIndex(2); //3rd option will get selected as starts from 0
		
		//s1.selectByValue("search-alias=collectibles");
		
		s1.selectByVisibleText("Car & Motorbike");
	}

}
