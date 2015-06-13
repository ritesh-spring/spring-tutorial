/**
 * 
 */
package spring.core.injection.ritesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ritesh Kumar 
 * @since Jun 14, 2015 1:56:51 AM
 * 
 */
public class RunFileWriter {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");

		FileWriterHelper writerHelper = (FileWriterHelper) context
				.getBean("fileWriterHelper");

		writerHelper.fileWriter();

		((AbstractApplicationContext) context).close();
	}

}
