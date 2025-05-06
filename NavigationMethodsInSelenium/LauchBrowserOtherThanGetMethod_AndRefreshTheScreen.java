package NavigationMethodsInSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowserOtherThanGetMethod_AndRefreshTheScreen {

	/*
	 Another way to launch browser other than get() is:- driver.navigate().to("https://chromewebstore.google.com/ ");
	 refresh the screen:--		driver.navigate().refresh();	
	 */
	
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://chromewebstore.google.com/ ");
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}
	
	
	
}
