//launch amazon and click on dropdown and get the text of each dropdown

package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class PrintTextNames_PresentInTheDropdown {
public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement cate_dd=driver.findElement(By.id("searchDropdownBox"));
		
		//select books
		Select s1=new Select(cate_dd);
		//s1.selectByVisibleText("Books");
		
		//so we can use a method name getOptions() which has return type of List of webelement
		
		List<WebElement> dropDown_count=s1.getOptions();
		
		
		System.out.println(dropDown_count.size());  //46
		
		for(int i=0;i<dropDown_count.size();i++)
		{
			
			System.out.println(cate_dd.getText());
		}
		
		
		
		
	}
}


/*
 OUTPUT---------------->
 
 
 Jun 10, 2024 3:02:20 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 125
Jun 10, 2024 3:02:20 AM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 125.0.6422.142. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.19.1` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
46
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Fresh Meat
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
Beauty
Books
Car & Motorbike
Clothing & Accessories
Collectibles
Computers & Accessories
Deals
Electronics
Furniture
Garden & Outdoors
Gift Cards
Grocery & Gourmet Foods
Health & Personal Care
Home & Kitchen
Industrial & Scientific
Jewellery
Kindle Store
Luggage & Bags
Luxury Beauty
Movies & TV Shows
MP3 Music
Music
Musical Instruments
Office Products
Pet Supplies
Prime Video
Shoes & Handbags
Software
Sports, Fitness & Outdoors
Subscribe & Save
Tools & Home Improvement
Toys & Games
Under ₹500
Video Games
Watches



*/
