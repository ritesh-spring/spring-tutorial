/**
 * 
 */
package spring.core.injection.ritesh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author Ritesh Kumar 
 * @since Jun 14, 2015 2:18:13 AM
 * 
 */
public class XmlFileWriter implements IFileWriter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see spring.core.injection.ritesh.IFileWriter#writeInFile()
	 */
	public void writeInFile() {
		// TODO Auto-generated method stub
		System.err.println("Writing in XML File");
		
		try {
			File textFileDir = new File("." + File.separator
					+ "generatedFile");

			File textFile = new File(textFileDir.getAbsolutePath()
					+ File.separator + "myXmlFile.xml");

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
					.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
			bufferedWriter.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.err.println("Xml File Written....Done");
	}

}
