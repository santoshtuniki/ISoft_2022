package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProvider_POM {
	
	
	
	public static String[][] getData(String dataSheetName) throws IOException{
		
		String[][] testdata2;
		
		FileInputStream fis=new FileInputStream("./testData/"+dataSheetName+".xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int rowcount=sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		int coloumncount=sheet.getRow(0).getLastCellNum();
		
		System.out.println(coloumncount);
		
		testdata2=new String[rowcount][coloumncount]; 
		
		for(int i=1;i<=rowcount;i++){
			
		XSSFRow	row=sheet.getRow(i);
		
		for(int j=0;j<coloumncount;j++){
			
			String celldata=row.getCell(j).getStringCellValue();
			
			System.out.println("The value of row "+i+" and column "+j+" is "+celldata);
			
			testdata2[i-1][j]=celldata;
		}
			
		}
		
	return testdata2;
		
	}


}
