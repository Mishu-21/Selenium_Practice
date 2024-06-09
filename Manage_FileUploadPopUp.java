package selenium_Basic_And_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		//Thread.sleep(1000);
		WebElement choose_file=driver.findElement(By.xpath("//input[@id='file']"));
		Thread.sleep(1000);
		//choose_file.click();
		//jab phle click kiya fir upload kar rahe hai toh nhi ho rahi upload  isliyi direct upload kiya 
		choose_file.sendKeys("C:\\Users\\UFL IT 2\\Downloads\\UploadFile.jpg");  //add extension also of the file"
		
		
		/*
		 Why mainly directly we are sending before clicking
		 
		bcz waise bhi hum jab  text field mai bhjte hai kuch bhi ie sendkeys ka use krte hai vha hum without click he send krdete hai 
	hum bs vha text feel ko locate krke send krdete hai kuch bhi 
		
		so isliyi yhi choose upload button ke sath kiya 
		
		*/
	
	}
}
