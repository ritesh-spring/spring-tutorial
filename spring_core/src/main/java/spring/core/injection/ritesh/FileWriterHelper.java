/**
 * 
 */
package spring.core.injection.ritesh;

/**
 * @author Ritesh Kumar
 * @since Jun 14, 2015 1:49:40 AM
 * 
 */
public class FileWriterHelper {

	IFileWriter fileWriter;

	public void fileWriter() {
		// TODO Auto-generated constructor stub
		fileWriter.writeInFile();
	}

	public void setFileWriter(IFileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

}
