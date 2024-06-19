package selenium_Basic_And_locators;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinksInGoogle {

	//step 5
	public static void verify_each_Link(String url) throws 
IOException
	{
		/*URL is the predefined class in java  which will help us to find the status code of each url
		this is the rarest class in java as in this all the letters are in capital letter where as we have seen that only 1 letter of the class is capital and after that every letter is in small letter but here every letter is in capital
		
		step 5.1 create the object of URL class and import java.net.URL package
		*/
		
	//	URL url1=new URL();  //aise define kiya toh gives an error as it is same like scanner class which means it doesnot have any non parameterised constructor 
	
		URL url1=new URL(url); // will accept the string url which is having one one link with it 
		// will throw some exception MalformedURLException
		
		
		/*
		 Now using its reference variable call the method openConnection()
		 and add throw exceptation declaration too --->which is IOException and once we throw this exception we see that MalformedURLException is removed automatically from the method 
		 */
		HttpsURLConnection url2=(HttpsURLConnection) url1.openConnection(); // can upcaste only explicilty as implicity mai error aayega 
		
		/*Step 5.3
		 *openConnection() method ka return type hai URLConnection but we dont need to store it there 
		 *but forget that as we need to upcaste it to another class which is  HttpUrlConnection class and create it reference variable to as done above
		
		 HttpUrlConnection and  import the class
		 
		 reason to upcaste--------------------->HttpsURLConnection class is the only class in java which can check the status code
		  
		 
		 */
		
		//Step 5.4--> as we have started the connect now we can  connect it using HttpsURLConnection referenec variable
		url2.connect();
		
		//Step 5.5  --> will use if block  and will get the ResponseCode using getResponseCode() method which is coming from HttpsURLConnection thats the reason we upcasted it
		
		//printed in such a way so that thoda thik lge dikhne mai 
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
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	// step 2
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		 System.out.println(allLinks.size());  
		 
		 //step 3
		 for(int i=0;i<=allLinks.size()-1;i++)
		 {
			 WebElement a1=allLinks.get(i);
		
			 
			 /*
			  lOGIX HERE IS --------->  give the attribute value of those atttribute name whose attribute name is href
			  
			  
			  */
			 //changed capital URL to small url because Capital URl is the class
			 
			 //String URL =a1.getAttribute("href"); 
			 String url =a1.getAttribute("href"); 
		//	 System.out.println(url);
			 
			 //step4
		verify_each_Link(url);  // created it paramterised because to check one-one link we need to pass each link 
	
		 
		 
		}
   }
}



/*
 OUTPUT--------------------------->
 24
Link is valid ---->OK --->  https://mail.google.com/mail/&ogbl
Link is valid ---->OK --->  https://www.google.com/imghp?hl=en&ogbl
Link is valid ---->OK --->  https://www.google.co.in/intl/en/about/products
Link is valid ---->OK --->  https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/&ec=GAZAmgQ
Link is valid ---->OK --->  https://www.google.com/setprefs?sig=0_L1zLo6LDpDu1a1SBS34R5Gaqlf0%3D&hl=hi&source=homepage&sa=X&ved=0ahUKEwi5lsbv6LKGAxX9TGwGHXttAnQQ2ZgBCBU
Link is valid ---->OK --->  https://www.google.com/setprefs?sig=0_L1zLo6LDpDu1a1SBS34R5Gaqlf0%3D&hl=bn&source=homepage&sa=X&ved=0ahUKEwi5lsbv6LKGAxX9TGwGHXttAnQQ2ZgBCBY
Link is valid ---->OK --->  https://www.google.com/setprefs?sig=0_L1zLo6LDpDu1a1SBS34R5Gaqlf0%3D&hl=te&source=homepage&sa=X&ved=0ahUKEwi5lsbv6LKGAxX9TGwGHXttAnQQ2ZgBCBc
Link is valid ---->OK --->  https://www.google.com/setprefs?sig=0_L1zLo6LDpDu1a1SBS34R5Gaqlf0%3D&hl=mr&source=homepage&sa=X&ved=0ahUKEwi5lsbv6LKGAxX9TGwGHXttAnQQ2ZgBCBg
Link is valid ---->OK --->  https://www.google.com/setprefs?sig=0_L1zLo6LDpDu1a1SBS34R5Gaqlf0%3D&hl=ta&source=homepage&sa=X&ved=0ahUKEwi5lsbv6LKGAxX9TGwGHXttAnQQ2ZgBCBk
Link is valid ---->OK --->  https://www.google.com/setprefs?sig=0_L1zLo6LDpDu1a1SBS34R5Gaqlf0%3D&hl=gu&source=homepage&sa=X&ved=0ahUKEwi5lsbv6LKGAxX9TGwGHXttAnQQ2ZgBCBo
Link is valid ---->OK --->  https://www.google.com/setprefs?sig=0_L1zLo6LDpDu1a1SBS34R5Gaqlf0%3D&hl=kn&source=homepage&sa=X&ved=0ahUKEwi5lsbv6LKGAxX9TGwGHXttAnQQ2ZgBCBs
Link is valid ---->OK --->  https://www.google.com/setprefs?sig=0_L1zLo6LDpDu1a1SBS34R5Gaqlf0%3D&hl=ml&source=homepage&sa=X&ved=0ahUKEwi5lsbv6LKGAxX9TGwGHXttAnQQ2ZgBCBw
Link is valid ---->OK --->  https://www.google.com/setprefs?sig=0_L1zLo6LDpDu1a1SBS34R5Gaqlf0%3D&hl=pa&source=homepage&sa=X&ved=0ahUKEwi5lsbv6LKGAxX9TGwGHXttAnQQ2ZgBCB0
Link is valid ---->OK --->  https://about.google/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1
Link is valid ---->OK --->  https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1
Link is valid ---->OK --->  https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1
Link is valid ---->OK --->  https://google.com/search/howsearchworks/?fg=1
Link is valid ---->OK --->  https://policies.google.com/privacy?hl=en-IN&fg=1
Link is valid ---->OK --->  https://policies.google.com/terms?hl=en-IN&fg=1
Link is valid ---->OK --->  https://www.google.com/preferences?hl=en-IN&fg=1
Link is valid ---->OK --->  https://www.google.com/advanced_search?hl=en-IN&fg=1
Link is valid ---->OK --->  https://www.google.com/history/privacyadvisor/search/unauth?utm_source=googlemenu&fg=1&cctld=com
Link is valid ---->OK --->  https://www.google.com/history/optout?hl=en-IN&fg=1
Link is valid ---->OK --->  https://support.google.com/websearch/?p=ws_results_help&hl=en-IN&fg=1

 */
