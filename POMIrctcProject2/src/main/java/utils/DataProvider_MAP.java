package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProvider_MAP {
	
	
	public static Object[][] getData() throws IOException{
		
		
		Object[][] testData = null;
		HashMap<String, Object> map;
		
		FileInputStream fis = new FileInputStream("");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rc = sheet.getLastRowNum();
		int cc = sheet.getRow(0).getLastCellNum();
		
		testData = new Object[rc][1];
		
		for(int i=1; i<=rc; i++){
			XSSFRow row = sheet.getRow(i);
			map = new HashMap<String, Object>();
			for(int j=0; j<cc; j++){
			String heading = sheet.getRow(0).getCell(j).getStringCellValue();
			
			CellType cell = row.getCell(j).getCellType();
			
			if(cell==cell.STRING){
				String cellValue = row.getCell(j).getStringCellValue();
				map.put(heading, cellValue);
			}else if(cell==cell.NUMERIC){
				Integer cellValue = (int) row.getCell(j).getNumericCellValue();
				map.put(heading, cellValue);
			}
				testData[i-1][0] = map;
			}		
		}
		wb.close();
		return testData;
		
		
		
	}
	

}
