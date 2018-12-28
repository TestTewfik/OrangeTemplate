package utilitaires;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static  int getRowCount() {
		int rowCount =0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println("Number of rows = " + rowCount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public static int getColCount() {
		int ColCount = 0;
		try {

			ColCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("Number of col = " + ColCount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return ColCount;
	}

	public  String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		DataFormatter formatter = new DataFormatter();
		
		try {
			
			Cell cell = sheet.getRow(rowNum).getCell(colNum);
			cellData = formatter.formatCellValue(cell);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;

	}
	
}
