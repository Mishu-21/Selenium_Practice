package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MinimiseWay {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		/*
		 * Step 1 and STEP 2 are same -->
		 */
		
		FileInputStream f1= new FileInputStream("C:\\Users\\Brijesh Chauhan\\eclipse-workspace\\selenium\\DataSheet\\HimanshiSheet.xlsx");
	Workbook w1=WorkbookFactory.create(f1);
	
	String c1=w1.getSheet("loginDetails").getRow(4).getCell(1).getStringCellValue();
	System.out.println(c1);
}
}
