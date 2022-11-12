package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ReadData extends TestBase{

	public static String excelFile(int rowNum,int colNum) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\SwagLab\\Book1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(rowNum).getCell(colNum).getStringCellValue();
		return value;
	}
	
	
	
	
	
	
	
	
}
