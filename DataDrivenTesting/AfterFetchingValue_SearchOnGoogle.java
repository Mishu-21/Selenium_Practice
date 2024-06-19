package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AfterFetchingValue_SearchOnGoogle {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream f1= new FileInputStream("C:\\Users\\Brijesh Chauhan\\eclipse-workspace\\selenium\\DataSheet\\HimanshiSheet.xlsx");
	    Workbook w1=WorkbookFactory.create(f1);
	    Sheet s1=w1.getSheet("loginDetails");
	    Row r1=s1.getRow(4);
	    Cell c1=r1.getCell(1);
	    String company_Name=c1.getStringCellValue();
	    System.out.println(company_Name);
	    
	    /*
	     now the value which u fetched from excel sheet pass that on google and see the result 
	     */
	    
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    WebElement searchbox=driver.findElement(By.name("q"));
	    searchbox.sendKeys(company_Name);
	    searchbox.sendKeys(Keys.ENTER);
  }
}
