package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_sheet  {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./excel1/Book1.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sheet = book.getSheet("sheet1");
Row row = sheet.getRow(1);
Cell cell = row.getCell(1);
String value = cell.getStringCellValue();
System.out.println(value);


	}

}
