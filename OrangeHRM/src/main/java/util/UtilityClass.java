package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	 public static void cpatureScreenshots(WebDriver driver) throws IOException
	 {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File Source=ts.getScreenshotAs(OutputType.FILE);
		 SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy HH mm ss");
		 Date date=new Date();
		 String today=(format.format(date));
		 File dest=new File("C:\\Users\\Admin\\screenshots\\test"+today+".jpeg");
		 	FileHandler.copy(Source, dest);	
		 
		 
	 }
	 public static String getexcellsheetdata(int r,int c) throws EncryptedDocumentException, IOException
	 {
		 String excellpath="\"C:\\Users\\Admin\\excellsheet.xlsx";
		 FileInputStream file= new FileInputStream(excellpath);
		 Workbook book=WorkbookFactory.create(file);
		 Sheet sheet=book.getSheet(excellpath);
		 Row row=sheet.getRow(r);
		 Cell cell= row.getCell(c);
		 String data=cell.getStringCellValue();
		 return data;
	 }
		 
		 
		 
		 
		 
		
		 
		 
	 

}
