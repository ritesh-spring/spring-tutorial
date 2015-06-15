/**
 * 
 */
package spring.core.injection.ritesh;

import java.io.File;
import java.io.FileWriter;

/**
 * @author Ritesh Kumar 
 * @since   Jun 14, 2015 1:43:53 AM
 * 
 */
public class CsvFileWriter implements IFileWriter {

	/* (non-Javadoc)
	 * @see spring.core.injection.ritesh.IFileWriter#writeInFile()
	 */
	public void writeInFile() {
		System.err.println("Writing in CSV file");
		try {
			File csvFileDir = new File("." + File.separator
					+ "generatedFile");

			File csvFile = new File(csvFileDir.getAbsolutePath()
					+ File.separator + "myCsvFile.csv");

			if (csvFileDir.exists()) {
				csvFileDir.delete();
			}
			
			
			csvFileDir.mkdir();
			
			if (csvFile.exists()) {
				csvFile.delete();
			}

			csvFile.createNewFile();
			 FileWriter writer = new FileWriter(csvFile.getAbsolutePath());
			 
			    writer.append("DisplayName");
			    writer.append(',');
			    writer.append("Age");
			    writer.append('\n');
		 
			    writer.append("MKYONG");
			    writer.append(',');
			    writer.append("26");
		            writer.append('\n');
		 
			    writer.append("YOUR NAME");
			    writer.append(',');
			    writer.append("29");
			    writer.append('\n');
		 
			    //generate whatever data you want
		 
			    writer.flush();
			    writer.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.err.println("CSV File Written....Done");
	}

}
