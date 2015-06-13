/**
 * 
 */
package spring.core.injection.ritesh;

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
	}

}
