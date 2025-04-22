package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchStringValue_AmazonCredentialSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1= new FileInputStream("C:\\Users\\Brijesh Chauhan\\eclipse-workspace\\selenium\\DataSheet\\HimanshiSheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		
		String username=w1.getSheet("amazon_credentails").getRow(1).getCell(0).getStringCellValue();
		String password=w1.getSheet("amazon_credentails").getRow(1).getCell(1).getStringCellValue();

		System.out.println(username);
		System.out.println(password);
		
		//can also fetch value from different sheet in a same program 
		
		String c1=w1.getSheet("loginDetails").getRow(4).getCell(1).getStringCellValue();
		System.out.println(c1);
	}
	
	
 }

