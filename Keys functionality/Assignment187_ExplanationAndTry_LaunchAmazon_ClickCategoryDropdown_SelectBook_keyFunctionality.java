//Launch amazon.in and click on catrgory dropdown  and sekect books using keys funcyionality 

package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment187_ExplanationAndTry_LaunchAmazon_ClickCategoryDropdown_SelectBook_keyFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch amazon.in
		driver.get("https://www.amazon.in/");
		
		//click on category option and select books from dropdown using keys functionality 
		
		WebElement select_book=driver.findElement(By.id("searchDropdownBox"));
		
		select_book.click(); //will click the dropdown option so now we can see thr drop-down 
		 //now select book option using key functionality
		
			/*
			 * while(driver.findElement(By.xpath(
			 * "//option[@value='search-alias=stripbooks'][1]")).isDisplayed()) {
			 * select_book.sendKeys(Keys.ARROW_DOWN); Thread.sleep(1000); }
			 */
		
		/*
		 * do { select_book.sendKeys(Keys.ARROW_DOWN); Thread.sleep(1000); }
		 * while(driver.findElement(By.xpath("//option[@value='search-alias=stripbooks'][1]")).isDisplayed());
		*/
		
		//as books 11 number par hai so 11 baar loop run karo 
		for(int i=0;i<=11;i++)
		{
			select_book.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
		}
		select_book.sendKeys(Keys.ENTER);
		
		//ab jaise run toh ho arha hai lekin vha book dikh nhi raha hai maybe compatibility issue ho so lets do one thing 
		//type world war there/or type anythimg and presss eneter and see vha tab kya aa rha hai 
//		tb book aayega 
		
		
		//seach world war
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		//press enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}

}