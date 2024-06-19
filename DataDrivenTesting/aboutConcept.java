package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




/*
 import everything from 
 import org.apache.poi.ss. 
 ss model yaad se 
 */
public class aboutConcept {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		/*
		 * Step 1---> let the code know where is excel sheet with the help of FileInputStream
		 will throw "FileNotFoundException"
		 */
		
		FileInputStream f1= new FileInputStream("C:\\Users\\Brijesh Chauhan\\eclipse-workspace\\selenium\\DataSheet\\HimanshiSheet.xlsx");
	
		/*
		 Step 2----->
		 Open the sheet using WorkbookFactory.create(object of where the file is )
		 and its return type is Workbook
		 
		will throw exception "EncryptedDocumentException"
		 */
	Workbook w1=WorkbookFactory.create(f1);
	
	/*
	 Step3----> 
	 Go to the particular sheet using getSheet() and pass the sheet name in method
	 so my sheet name is loginDetials therefore wrote getSheet("loginDetials")
	 and return type of getSheet() method is Sheet
	 */
	
	Sheet s1=w1.getSheet("loginDetails");
	
	/*
	 Step 4---->
	 Fetch the value using getRow() and getCell() methods
	 */
	
	Row r1=s1.getRow(4);
	Cell c1=r1.getCell(1);
	
	/*
	 Step5---->
	 Fetch the cell value using getStringCellValue
	 */
	
	   String company_Name=c1.getStringCellValue();
	   System.out.println(company_Name);
	}
}
