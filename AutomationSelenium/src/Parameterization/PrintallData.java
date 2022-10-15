package Parameterization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class PrintallData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\SANTOSH\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");

    Sheet sh=  WorkbookFactory.create(file).getSheet("result");
     
    int lastrowindex = sh.getLastRowNum();
  
   // System.out.println(lastrowindex);
 //int i= 0;
 for(int i=0; i<=lastrowindex; i++){
     
     String info = sh.getRow(i).getCell(1).getStringCellValue();
     
     System.out.println(info);
}
}
}
