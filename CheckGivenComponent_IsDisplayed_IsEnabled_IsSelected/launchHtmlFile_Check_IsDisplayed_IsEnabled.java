package CheckGivenComponent_IsDisplayed_IsEnabled_IsSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchHtmlFile_Check_IsDisplayed_IsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/UFL%20IT%202/Desktop/imp/Study_Himanshi/GroTechMinds/Study%20Material/learningHTML1.html");
		
		//checlk lastname field is displayed and enabled 
		WebElement lastname=driver.findElement(By.name("lname"));
		
		System.out.println(lastname.isDisplayed()); //true as its diplayed
		System.out.println(lastname.isEnabled()); //false as its disabled 
		
		
		//check boy checkmark is selected or not 
		WebElement boy_checkbox=driver.findElement(By.name("name1"));
		System.out.println(boy_checkbox.isSelected());  //false as it is not selected before hand 
		
		boolean b1=boy_checkbox.isSelected();
		
		//if boy chechbox is not selected click on it 
		
		if(b1==false) //will execute and click on boy check box as it was not selected before 
		{
			boy_checkbox.click();
		}
		
	}

}
