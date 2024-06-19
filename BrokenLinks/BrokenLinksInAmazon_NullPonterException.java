package selenium_Basic_And_locators;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksInAmazon_NullPonterException {




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
		 System.out.println(url);
	 }
}
}

/*
 so we see in output we get null which means in attribute name href we have no link present ie href=""
 so isko handle krne ke liye we use excepttion handling 
 
 OUTPUT---->
405---->total links
null
null
https://www.amazon.in/ref=nav_logo
null
https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F&ref_=topnav_lang
https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0
https://www.amazon.in/gp/css/order-history?ref_=nav_orders_first
https://www.amazon.in/gp/cart/view.html?ref_=nav_cart
https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0
https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0
https://www.amazon.in/hz/wishlist/ls?triggerElementID=createList&ref_=nav_ListFlyout_navFlyout_createList_lv_redirect
https://www.amazon.in/wishlist/universal?ref_=nav_ListFlyout_gno_listpop_uwl
https://www.amazon.in/baby-reg/homepage?ref_=nav_ListFlyout_gno_listpop_br
https://www.amazon.in/discover/?ref_=nav_ListFlyout_sbl
https://www
 */
/*
 	
below code likha ----------> so we are getting  java.lang.NullPointerException:
 so lets see how we can handle it ie. we are going to learn about exception handling 
	public static void verify_each_Link(String url) throws 
IOException
	{
		
		URL url1=new URL(url); 
		HttpsURLConnection url2=(HttpsURLConnection) url1.openConnection(); // can upcaste only explicilty as implicity mai error aayega 
		
		url2.connect();
		
		
		if(url2.getResponseCode()==200)
		{ 
			System.out.println("Link is valid ---->"+ url2.getResponseMessage() +" --->  " +url); //we can also get response message--> which means get the msg as Ok for 200 status code   and agar  401 ke liye check krte toh milta msg bad request and so on................ 
		} 
		else
		{
			System.out.println("Not Valid ---->"+ url2.getResponseMessage() +"  ---> " + url);
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
   
   */

