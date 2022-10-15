package Parameterization;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcellSheetpoi {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\SANTOSH\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");

    Workbook Sheet1 = WorkbookFactory.create(file);      //by using create method you can open excellsheet  //workbook is a interface
     
       Sheet sh = Sheet1.getSheet("Sheet1");               //specific sheet open karna tha // sheet is a interface
        
        Row ro = sh.getRow(0);                                //particular row ke liye // row is a interface
        
        Cell cll = ro.getCell(3);						// particular row main se particular ko call kar dega
        
        Boolean cellvalue =cll.getBooleanCellValue();
        
        System.out.println(Sheet1);
        
        
     }
}
