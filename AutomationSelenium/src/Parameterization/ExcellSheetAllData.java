package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetAllData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\SANTOSH\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");

      Sheet sh = WorkbookFactory.create(file).getSheet("result");
   
      int LastRowIndex = sh.getLastRowNum();
      					//step1 take outer for loop for row
      
      for(int i=0; i<=LastRowIndex; i++) {
      					//step2 inner for loop used for column
      
      int LastCellIndex = sh.getRow(0).getLastCellNum()-1;
      
      for(int j=0; j<=LastCellIndex; j++)
      {
    	 String info = sh.getRow(i).getCell(j).getStringCellValue();
    	  System.out.print(info +"  ");
      }
      System.out.println();
    	  
      }
      
   }
}

