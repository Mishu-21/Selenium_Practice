package NavigationMethodsInSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class backward_Forward_Navigation {

	/*
	 syntax-->
	 To move back from the screen use --> driver.navigate().back(); 
	 To move forward from the screen use--> driver.navigate().forward();
	 */
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();  //this will launch empty browser 
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		/*
		Statement below 
		ChromeDriver driver=new ChromeDriver();
		will launch my empty browser and after that if we do 
		driver.navigate().to("https://www.facebook.com/");
		my facebook is launch 
		
		so we notice that my forward -> arrow is not enabled but my backward <- arrow is enabled because 
		as first we launch empty browser and than facebook so my backward is present 
		so first lets backward the screen---> which will launch my empty browser
		and than lets forward the screen ---> which will launch my facebook browser
		 */
		driver.navigate().back();  //will move backward ie empty screen will be launched 
		Thread.sleep(2000);
		driver.navigate().forward(); //will move forward ie fb will be launched
	}
}
