package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceltoMap {
	
	public static LinkedHashMap<String, String> getExcelDataAsMap(String excelFileName, String sheetName) throws EncryptedDocumentException, IOException {
		// Create a Workbook
		Workbook wb = WorkbookFactory.create(new File(excelFileName));
		// Get sheet with the given name "Sheet1"
		Sheet s = wb.getSheet(sheetName);
		// Initialized an empty LinkedHashMap which retain order
		LinkedHashMap<String, String> data = new LinkedHashMap<>();
		// Get total row count
		int rowCount = s.getPhysicalNumberOfRows();
		// Skipping first row as it contains headers
		for (int i = 1; i < rowCount; i++) {
			// Get the row
			Row r = s.getRow(i);
			// Since every row has two cells, first is field name and another is value.
			String fieldName = r.getCell(0).getStringCellValue();
			String fieldValue = r.getCell(1).getStringCellValue();
			data.put(fieldName, fieldValue);
		}
		return data;
	}
 
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String filelocation = "/Users/waquaralam/Desktop/emailexcel.xls";
 
		LinkedHashMap<String,String> mapData = getExcelDataAsMap(filelocation,"UserAccounts");
		for(String s: mapData.keySet())
		{
			System.out.println("Value of "+s +" is : "+mapData.get(s));
		}
	}
 

}

