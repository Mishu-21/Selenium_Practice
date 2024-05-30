package selenium_Basic_And_locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksInAnyWebsite {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//as links can be more than one so use findelements to find all links and store it in set 
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		 System.out.println(allLinks.size());  //24
		 
		 //now iterate to each link and print it
		 for(int i=0;i<allLinks.size()-1;i++)
		 {
			 WebElement a1=allLinks.get(i);
		//	 System.out.println(a1); 
			 //output ---->[[ChromeDriver: chrome on windows (03076caa0a2299c4f50b1bfb584258fd)] -> tag name: a]
			 
			 /*so now allLinks will be having set of all links so in that we are getting the links one by one using iterator 
			 which is stored in a1
			 and than  from that as my links will be having many details so in that we are taking href attribute name value only  as in href only we have the link of the website 
			 
			  
			  lOGIX HERE IS in short --------->  give the attribute value of those atttribute name whose attribute name is href
			  */
			
			 String URL =a1.getAttribute("href"); //will have url of the website
			// String idValue =a1.getAttribute("id");   //will get the id value 
			 
		//	 System.out.println(URL);
			 
			 String linkText =a1.getText(); // will get if any text prsent in the url 
			 
			 System.out.println(linkText +"text of the URL "+ URL);
			 
			 
		 }
	}
	
	
	
	/*
	 OUTPUT------------------------>
	 24
Gmailtext of the URL https://mail.google.com/mail/&ogbl
Imagestext of the URL https://www.google.com/imghp?hl=en&ogbl
text of the URL https://www.google.co.in/intl/en/about/products
Sign intext of the URL https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/&ec=GAZAmgQ
हिन्दीtext of the URL https://www.google.com/setprefs?sig=0_S87qU7Ezm0Ydy43hxGx-oTjnkPY%3D&hl=hi&source=homepage&sa=X&ved=0ahUKEwioxeS8qa-GAxXU7zgGHWIHCogQ2ZgBCBU
বাংলাtext of the URL https://www.google.com/setprefs?sig=0_S87qU7Ezm0Ydy43hxGx-oTjnkPY%3D&hl=bn&source=homepage&sa=X&ved=0ahUKEwioxeS8qa-GAxXU7zgGHWIHCogQ2ZgBCBY
తెలుగుtext of the URL https://www.google.com/setprefs?sig=0_S87qU7Ezm0Ydy43hxGx-oTjnkPY%3D&hl=te&source=homepage&sa=X&ved=0ahUKEwioxeS8qa-GAxXU7zgGHWIHCogQ2ZgBCBc
मराठीtext of the URL https://www.google.com/setprefs?sig=0_S87qU7Ezm0Ydy43hxGx-oTjnkPY%3D&hl=mr&source=homepage&sa=X&ved=0ahUKEwioxeS8qa-GAxXU7zgGHWIHCogQ2ZgBCBg
தமிழ்text of the URL https://www.google.com/setprefs?sig=0_S87qU7Ezm0Ydy43hxGx-oTjnkPY%3D&hl=ta&source=homepage&sa=X&ved=0ahUKEwioxeS8qa-GAxXU7zgGHWIHCogQ2ZgBCBk
ગુજરાતીtext of the URL https://www.google.com/setprefs?sig=0_S87qU7Ezm0Ydy43hxGx-oTjnkPY%3D&hl=gu&source=homepage&sa=X&ved=0ahUKEwioxeS8qa-GAxXU7zgGHWIHCogQ2ZgBCBo
ಕನ್ನಡtext of the URL https://www.google.com/setprefs?sig=0_S87qU7Ezm0Ydy43hxGx-oTjnkPY%3D&hl=kn&source=homepage&sa=X&ved=0ahUKEwioxeS8qa-GAxXU7zgGHWIHCogQ2ZgBCBs
മലയാളംtext of the URL https://www.google.com/setprefs?sig=0_S87qU7Ezm0Ydy43hxGx-oTjnkPY%3D&hl=ml&source=homepage&sa=X&ved=0ahUKEwioxeS8qa-GAxXU7zgGHWIHCogQ2ZgBCBw
ਪੰਜਾਬੀtext of the URL https://www.google.com/setprefs?sig=0_S87qU7Ezm0Ydy43hxGx-oTjnkPY%3D&hl=pa&source=homepage&sa=X&ved=0ahUKEwioxeS8qa-GAxXU7zgGHWIHCogQ2ZgBCB0
Abouttext of the URL https://about.google/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1
Advertisingtext of the URL https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1
Businesstext of the URL https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1
How Search workstext of the URL https://google.com/search/howsearchworks/?fg=1
Privacytext of the URL https://policies.google.com/privacy?hl=en-IN&fg=1
Termstext of the URL https://policies.google.com/terms?hl=en-IN&fg=1
text of the URL https://www.google.com/preferences?hl=en-IN&fg=1
text of the URL https://www.google.com/advanced_search?hl=en-IN&fg=1
text of the URL https://www.google.com/history/privacyadvisor/search/unauth?utm_source=googlemenu&fg=1&cctld=com
text of the URL https://www.google.com/history/optout?hl=en-IN&fg=1

	 */
}
