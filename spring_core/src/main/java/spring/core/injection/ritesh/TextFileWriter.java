/**
 * 
 */
package spring.core.injection.ritesh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author Ritesh Kumar
 * @since Jun 14, 2015 1:45:57 AM
 * 
 */
public class TextFileWriter implements IFileWriter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see spring.core.injection.ritesh.IFileWriter#writeInFile()
	 */
	public void writeInFile() {
		System.err.println("Writing in Text File");
		try {
			File textFileDir = new File("." + File.separator
					+ "generatedTextFile");

			File textFile = new File(textFileDir.getAbsolutePath()
					+ File.separator + "myTextFile.txt");

			if (textFileDir.exists()) {
				textFileDir.delete();
			}
			
			textFileDir.mkdir();
			
			if (textFile.exists()) {
				textFile.delete();
			}

			textFile.createNewFile();

			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
					textFile.getAbsolutePath()));
			bufferedWriter
					.write(FileWriterConstants.CONTENT_TO_WRITE_TEXT_FILE);
			bufferedWriter.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.err.println("Text File Written....Done");
	}

}
