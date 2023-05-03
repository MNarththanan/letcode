package excelDataDriven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getExcelSheetData() {
		
		String fileLocation = "./TestDataFromExcel/Login_Test_Data.xlsx";
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fileLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet1 = workbook.getSheetAt(0);
		int lastRowNum = sheet1.getLastRowNum();
		int phy = sheet1.getPhysicalNumberOfRows();
		int lastSellNo = sheet1.getRow(0).getLastCellNum();
		
		String[][] data = new String[lastRowNum][lastSellNo];
		
		System.out.println(lastRowNum);
		System.out.println(phy);
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row1 = sheet1.getRow(i);
			
			for (int j = 0; j < 2; j++) {
				XSSFCell cell1 = row1.getCell(j);
				String value = cell1.getStringCellValue();
				System.out.println(value);
				data[i-1][j] = value;
			} 
		}
		
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;



}

}
