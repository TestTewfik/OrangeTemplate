package utilitaires;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import base.TestBase;




public class TestUtil extends TestBase  {
	
	
	String excelPath = projectpath+"\\src\\test\\resources\\excel\\data.xlsx"; 
	
	
	/*public static void captureScreenShot() throws IOException {
		String directory = projectpath + "\\src\\test\\resources\\screenshots\\";
		String fileName = "ScreenShot"+getDate()+".png";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);											 
		FileUtils.copyFile(scrFile, new File(directory + fileName));;
	}*/
	
	
	/*public static String getDate()
	{
		final DateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
		Date date = new Date();
		return(sdf.format(date));
	}*/
	
	
	
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
