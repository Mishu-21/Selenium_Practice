package selenium_Basic_And_locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllURL_getAttributeMethodToGetLink_getTextMethodToGetTHeTextOfLink_StudyThisFirst {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//as links can be more than one so use findelements to find all links and store it in set 
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		 System.out.println(allLinks.size());  //24--->which will give the count of all the links in th website
		 
		 
		 //But ur job is to find the link so to go to each we can use for loop
		
		 //or  for(int i=0;i<=allLinks.size()-1;i++)
		 for(int i=0;i<allLinks.size();i++)
		 {
			 WebElement a1=allLinks.get(i);  //return type of get() is webelement therefore store in webelement
		
			 //now we use its method getAttribute() to get the attribute value of href and the return type of getAttribute() is string therefore store in string
			 String URL =a1.getAttribute("href"); //will give the attribute value of href
			
			 /*mainly getAttribute will give the attribute value of attribute name which is present inside () the bracket
			 suppose we have getAttribute(id)---> so now it will give id value 
			 */
			 
			 System.out.println("---------------------------------START------------------------------------------");
	
			 System.out.println(URL);
	
	System.out.println("\n");
	
	
	//now how to get the text message present in the link
			 String linkText =a1.getText(); // will get if any text prsent in the url 
			 
			 System.out.println(linkText );
	System.out.println("--------------**********************End***************************--------------");		 
			 
		 }
	}
	
	
	
	/*
	 OUTPUT------------------------>
	 
	 May 31, 2024 4:05:38 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 125
May 31, 2024 4:05:38 AM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 125.0.6422.112. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.19.1` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
25
---------------------------------START------------------------------------------
https://mail.google.com/mail/&ogbl


Gmail
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/imghp?hl=en&ogbl


Images
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.co.in/intl/en/about/products



--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/&ec=GAZAmgQ


Sign in
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/url?q=https://www.google.com/gasearch%3Fq%3Dhow%2Bto%2Bvote%2BLok%2BSabha%26source%3Dsmp.htvelectionIN.1&source=hpp&id=19042166&ct=3&usg=AOvVaw25LS_mKnfUqp8UhzMwknm6&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ8IcBCBU


Get ready to vote this election
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/setprefs?sig=0_1whlVqWo_dj3XmkE7rUWESbUQZ4%3D&hl=hi&source=homepage&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ2ZgBCBc


हिन्दी
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/setprefs?sig=0_1whlVqWo_dj3XmkE7rUWESbUQZ4%3D&hl=bn&source=homepage&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ2ZgBCBg


বাংলা
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/setprefs?sig=0_1whlVqWo_dj3XmkE7rUWESbUQZ4%3D&hl=te&source=homepage&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ2ZgBCBk


తెలుగు
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/setprefs?sig=0_1whlVqWo_dj3XmkE7rUWESbUQZ4%3D&hl=mr&source=homepage&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ2ZgBCBo


मराठी
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/setprefs?sig=0_1whlVqWo_dj3XmkE7rUWESbUQZ4%3D&hl=ta&source=homepage&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ2ZgBCBs


தமிழ்
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/setprefs?sig=0_1whlVqWo_dj3XmkE7rUWESbUQZ4%3D&hl=gu&source=homepage&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ2ZgBCBw


ગુજરાતી
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/setprefs?sig=0_1whlVqWo_dj3XmkE7rUWESbUQZ4%3D&hl=kn&source=homepage&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ2ZgBCB0


ಕನ್ನಡ
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/setprefs?sig=0_1whlVqWo_dj3XmkE7rUWESbUQZ4%3D&hl=ml&source=homepage&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ2ZgBCB4


മലയാളം
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/setprefs?sig=0_1whlVqWo_dj3XmkE7rUWESbUQZ4%3D&hl=pa&source=homepage&sa=X&ved=0ahUKEwi13pbkt7aGAxX1cmwGHZRVAFoQ2ZgBCB8


ਪੰਜਾਬੀ
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://about.google/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1


About
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1


Advertising
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1


Business
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://google.com/search/howsearchworks/?fg=1


How Search works
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://policies.google.com/privacy?hl=en-IN&fg=1


Privacy
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://policies.google.com/terms?hl=en-IN&fg=1


Terms
--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/preferences?hl=en-IN&fg=1



--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/advanced_search?hl=en-IN&fg=1



--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/history/privacyadvisor/search/unauth?utm_source=googlemenu&fg=1&cctld=com



--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://www.google.com/history/optout?hl=en-IN&fg=1



--------------**********************End***************************--------------
---------------------------------START------------------------------------------
https://support.google.com/websearch/?p=ws_results_help&hl=en-IN&fg=1



--------------**********************End***************************--------------

	 
	 */
}
