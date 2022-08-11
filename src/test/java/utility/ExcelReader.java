package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public void writeData() throws IOException
	
	
	{
		String path = System.getProperty("user.dir")+"\\Testdata.xlsx";
		
		File src = new File(path);
		
//		To load that particular location
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		sh1.getRow(7).getCell(1).setCellValue("test value");
		
		sh1.createRow(105).createCell(5).setCellValue("create row and column test");
		
		wb.write(fos);
			
	}
	
	
	
	public String readData(int row, int column) throws IOException
	{
		File src = new File("F:\\Desktop\\Katraj\\23 April\\Testdata.xlsx");
		
//		To load that particular location
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
//		String value = sh1.getRow(row).getCell(column).getStringCellValue();
//		
//		System.out.println(value);
		
		DataFormatter df = new DataFormatter();
		
		String formattedvalue = df.formatCellValue(sh1.getRow(row).getCell(column));
		
		return formattedvalue;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		File src = new File("F:\\Desktop\\Katraj\\23 April\\Testdata.xlsx");
		
//		To load that particular location
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("Sheet1");
//		To get the last used row index value
		int lastrownumber = sh1.getLastRowNum();
		
		System.out.println("Last row number is :"+lastrownumber);//19
//	To get the last column number	
		int lastcolumnnumber = sh1.getRow(1).getLastCellNum();
		
		System.out.println("Last column number is :"+lastcolumnnumber);//2
		
		String value = sh1.getRow(5).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		String value2 = sh1.getRow(19).getCell(0).getStringCellValue();
		
		System.out.println(value2);
		
		ExcelReader er = new ExcelReader();
		
		String intvalue = er.readData(10, 0);
		
		System.out.println(intvalue);
		
		String intvalue2 = er.readData(10, 1);
	
		System.out.println(intvalue2);
		
		er.writeData();
		
		
		
			
	}
	
	
	
	
//	WAP to login into Orange HRM using excel sheet data
//	WAP to print all the values present inside the excel sheet with row and column
	
	
	
	

}
