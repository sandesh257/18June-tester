package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataExcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file =  new FileInputStream("C:\\Users\\SANTOSH\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");
	
   String sandesh = WorkbookFactory.create(file).getSheet("practice").getRow(0).getCell(3).getStringCellValue();
	
   System.out.println(sandesh);
	
   
  
	}
}
