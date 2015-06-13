/**
 * 
 */
package spring.core.injection.ritesh;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * @author Ritesh Kumar 
 * @since   Jun 14, 2015 1:44:54 AM
 * 
 */
public class ExcelFileWriter implements IFileWriter{

	public void writeInFile() {
		System.err.println("Writing in Excel File");
		
		Workbook workBook= new XSSFWorkbook();
		Sheet sheet= workBook.createSheet("Sheet-1");
		Row row= sheet.createRow(0);
		row.createCell(0).setCellValue("Name");
		row.createCell(1).setCellValue("Roll Number");
		row.createCell(2).setCellValue("DOB");
		row.createCell(3).setCellValue("Marks");
		
		try {
			File textFileDir = new File("." + File.separator
					+ "generatedFile");

			File textFile = new File(textFileDir.getAbsolutePath()
					+ File.separator + "myExcelFile.xlsx");

			if (textFileDir.exists()) {
				textFileDir.delete();
			}
			
			textFileDir.mkdir();
			
			if (textFile.exists()) {
				textFile.delete();
			}
			FileOutputStream outputStream = new FileOutputStream(textFile);
			workBook.write(outputStream);
			
			workBook.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
