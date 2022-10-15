package Parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheetA1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		

		FileInputStream file = new FileInputStream("C:\\Users\\SANTOSH\\Desktop\\New Microsoft Excel Worksheet (2).xlsx");

		int LastRow1 = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();	//return index for last row
		
		System.out.println(LastRow1);
		
	}
	}

