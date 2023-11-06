package genericUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility implements IAutoConstants {
	/**
	 * this method is used to read the data from excel file 
	 */
	@DataProvider(name="data")
 public Object[][] readingTheDataFromExcel() {
	  Workbook workbook = null;
	  
	 File file=new File(EXCEL_PATH);
	 try {
		 workbook = WorkbookFactory.create(file);
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 Sheet sheet = workbook.getSheet("Sheet1");
	 int rowcount = sheet.getPhysicalNumberOfRows();
	 int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
	 Object[][] data=new Object[rowcount][cellcount];
	 for(int row=0;row<rowcount;row++) {
	 Row actrow = sheet.getRow(row);
	 for(int cell=0;cell<actrow.getPhysicalNumberOfCells();cell++) {
		 data[row][cell]=actrow.getCell(cell).toString();
	 }
 }
	 return data;
 }
}
