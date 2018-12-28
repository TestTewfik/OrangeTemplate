package utilitaires;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import base.TestBase;

public class TestUtil extends TestBase {
	
	//String projectpath = System.getProperty("user.dir");
	String excelPath = projectpath+"\\src\\test\\resources\\excel\\data.xlsx"; 
	
	@DataProvider(name = "dp")
	public  Object[][] getData(Method m) {
		
		String sheetName = m.getName();
		String cellData= null;
		ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				
				
				cellData = excel.getCellDataString(i, j);
				data[i-1][j]= cellData;
			}
		}
	
		return data;
	}

}
