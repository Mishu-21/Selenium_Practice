package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class fetchNumericValue {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1= new FileInputStream("C:\\Users\\Brijesh Chauhan\\eclipse-workspace\\selenium\\DataSheet\\HimanshiSheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		
	//	String username=w1.getSheet("amazon_credentails").getRow(2).getCell(0).getStringCellValue();
		String password=w1.getSheet("amazon_credentails").getRow(2).getCell(1).getStringCellValue();

		//System.out.println(username);
		System.out.println(password);
		
		/*
		 As now my (2,0)have numeric value ie suppose my mobile no so i am fetching its value n try to store in string 
		 so when run my  code
		 Given exception--------->
		 "IllegalStateException"
		  
		  Exception in thread "main" java.lang.IllegalStateException: Cannot get a STRING value from a NUMERIC cell
	at org.apache.poi.xssf.usermodel.XSSFCell.typeMismatch(XSSFCell.java:987)
	at org.apache.poi.xssf.usermodel.XSSFCell.getRichStringCellValue(XSSFCell.java:336)
	at org.apache.poi.xssf.usermodel.XSSFCell.getStringCellValue(XSSFCell.java:280)
	at DataDrivenTesting.fetchNumericValue.main(fetchNumericValue.java:17)


so now as we are getting error in line no. 17 so 

  make use of NumberToTextConverter class and its method toText()
		 */
		
		String username=NumberToTextConverter.toText(w1.getSheet("amazon_credentails").getRow(2).getCell(0).getNumericCellValue());
		System.out.println(username);
	
	}
}
