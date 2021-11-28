package configuration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String readExcel(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(Path.sheet);
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		CellType type = sheet.getRow(row).getCell(col).getCellType();
		
	    String data;
		if(type==CellType.STRING) {
	    	data=sheet.getRow(row).getCell(col).getStringCellValue();
	    }
		else {
			long num = (long) sheet.getRow(row).getCell(col).getNumericCellValue();
			data=Long.toString(num);
		}
		System.out.println(data);
		return data;
	}
}
