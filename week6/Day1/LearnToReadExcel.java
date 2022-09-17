package dataIntegration;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnToReadExcel {

	public static void main(String[] args) throws IOException {

		// Step:1-->Created the excel sheet
		// Step:2 -->Copy the Excel file into the Project under folder

		// Step:3--->Set the path to read the required excel file
		XSSFWorkbook book = new XSSFWorkbook("./data/SampleData.xlsx");
		// Step:4-->Read the required sheet form the workbook
		XSSFSheet sheet = book.getSheetAt(0); // book.getSheet("Sheetname")
		// Step:5 Get into the row
		XSSFRow row = sheet.getRow(3);
		// Step:6 Get into the Column
		XSSFCell cell = row.getCell(0); // [2,1]
		// Step:7 Read the Value
		String stringCellValue = cell.getStringCellValue();
		// System.out.println("Reading the Excel sheet value from row and Column"
		// +stringCellValue);

		// Book-->sheet-->row-->column-->Value from the cell

		// To Read all the values from the excel sheet

		// [0,0][0,1]
		// [1,0][1,1]
		// Step: 8-->Get the row Count
		int rowCount = sheet.getLastRowNum();// by default -->the first row as header
		// step :9-->to get the column count from single row

		/*
		 * int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		 * System.out.println(physicalNumberOfRows);
		 */
		int colCount = row.getLastCellNum();
		System.out.println("Row Count : " + rowCount + " and Column Count : " + colCount);
		//
		for (int i = 0; i <= rowCount; i++)// row iteration {
			// i=1 for second iteration
			for (int j = 0; j < colCount; j++) { // col iteration {
				// sheet-->row-->column-->Value from the cell
				String allValues = sheet.getRow(i).getCell(j).getStringCellValue();
				// getRow(0).getCell(0).getthevalue
				// getRow(0).getCell(1).getthevalue
				System.out.println(allValues);
			}

	}

}
