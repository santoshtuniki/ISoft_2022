package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadnWrite {

	public static void main(String[] args) throws IOException {
		
		// Creating a File Object by name 'f'
		File f = new File("./testdata/testdata1.xlsx");		// Creating a new file instance
		
		// Creates a FileInputStream by opening a connection to an actual file, the file named 'f' in the file system. 
		FileInputStream fs = new FileInputStream(f);		// Obtaining bytes from the file  
		
		// Constructs a XSSFWorkbook object, by buffering the whole stream into memory and then opening an OPCPackage object for it.	
		XSSFWorkbook workbook = new XSSFWorkbook(fs);		// Creating Workbook instance that refers to .xlsx file  
		
//		// Create a new sheet for this Workbook.
//		XSSFSheet sheet = workbook.createSheet("EmployeeDetails");		
		
		// Creating a Sheet object to retrieve object  
		XSSFSheet sheet1 = workbook.getSheet("EmployeeDetails");		
		
		// Returns the logical row (not physical) 0-based. If you ask for a row that is not defined you get a null
		XSSFRow row1 = sheet1.getRow(0);
		
		// Returns value in the cell
		XSSFCell cell = row1.getCell(2);
		
		System.out.println("Value in cell: "+cell);
		workbook.close();
	}

}
