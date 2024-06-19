package selenium_Basic_And_locators;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksInAmazon_ToOverComeNullPointerException_UsingExceptionHandling {

	
	
	
	public static void verify_each_Link(String url) throws 
	IOException
		{
		//one try can have 2 catch also 
		try
		{
			URL url1=new URL(url); 
			HttpsURLConnection url2=(HttpsURLConnection) url1.openConnection(); // can upcaste only explicilty as implicity mai error aayega 
			
			url2.connect();
			
			
			if(url2.getResponseCode()==200)
			{ 
				System.out.println("Link is valid ---->"+ url2.getResponseCode() +" --->  "+ url2.getResponseMessage() +" --->  " +url); //we can also get response message--> which means get the msg as Ok for 200 status code   and agar  401 ke liye check krte toh milta msg bad request and so on................ 
			} 
			else
			{
				System.out.println("Not Valid ---->"+ url2.getResponseCode() +" --->  "+ url2.getResponseMessage() +"  ---> " + url);
			}
		}
		catch(NullPointerException a1)
		{
			System.out.println("since url was null it was handled");
		}
		catch(MalformedURLException a1) //import its package also
		{
			System.out.println("Managed MalformedURLException too");
		}
		}
		
		public static void main(String[] args) throws IOException {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
			List<WebElement> allLinks=driver.findElements(By.tagName("a"));
			 System.out.println(allLinks.size());  
			 
			
			 for(int i=0;i<=allLinks.size()-1;i++)
			 {
				 WebElement a1=allLinks.get(i);
			
				 
				  
				 String url =a1.getAttribute("href"); 
			//	 System.out.println(url);
				 
				
			verify_each_Link(url); 
		
			 
			 
			}
	   }
}
	/*
	 * 
	 * Below code run kiya to handle nullpointer exception so ab humko malformedURL exception mil raha hai lets handle that tooo-------
	 * public static void verify_each_Link(String url) throws IOException { try {
	 * URL url1=new URL(url); HttpsURLConnection url2=(HttpsURLConnection)
	 * url1.openConnection(); // can upcaste only explicilty as implicity mai error
	 * aayega
	 * 
	 * url2.connect();
	 * 
	 * 
	 * if(url2.getResponseCode()==200) { System.out.println("Link is valid ---->"+
	 * url2.getResponseMessage() +" --->  " +url); //we can also get response
	 * message--> which means get the msg as Ok for 200 status code and agar 401 ke
	 * liye check krte toh milta msg bad request and so on................ } else {
	 * System.out.println("Not Valid ---->"+ url2.getResponseMessage() +"  ---> " +
	 * url); } } catch(NullPointerException a1) {
	 * System.out.println("since url was null it was handled"); } }
	 * 
	 * public static void main(String[] args) throws IOException { ChromeDriver
	 * driver=new ChromeDriver(); driver.get("https://www.amazon.in/");
	 * driver.manage().window().maximize();
	 * 
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * 
	 * List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	 * System.out.println(allLinks.size());
	 * 
	 * 
	 * for(int i=0;i<=allLinks.size()-1;i++) { WebElement a1=allLinks.get(i);
	 * 
	 * 
	 * 
	 * String url =a1.getAttribute("href"); // System.out.println(url);
	 * 
	 * 
	 * verify_each_Link(url);
	 * 
	 * 
	 * 
	 * } }
	 Output------------->
	 * Exception in thread "main" java.net.MalformedURLException: Cannot invoke "String.length()" because "spec" is null
	at java.base/java.net.URL.<init>(URL.java:708)
	at java.base/java.net.URL.<init>(URL.java:569)
	at java.base/java.net.URL.<init>(URL.java:516)
	at selenium_Basic_And_locators.BrokenLinksInAmazon_ToOverComeNullPointerException_UsingExceptionHandling.verify_each_Link(BrokenLinksInAmazon_ToOverComeNullPointerException_UsingExceptionHandling.java:21)
	at selenium_Basic_And_locators.BrokenLinksInAmazon_ToOverComeNullPointerException_UsingExceptionHandling.main(BrokenLinksInAmazon_ToOverComeNullPointerException_UsingExceptionHandling.java:65)
Caused by: java.lang.NullPointerException: Cannot invoke "String.length()" because "spec" is null
	at java.base/java.net.URL.<init>(URL.java:614)
	... 4 more

	 */



