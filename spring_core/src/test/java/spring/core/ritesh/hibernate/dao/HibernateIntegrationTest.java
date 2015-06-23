/**
 * 
 */
package spring.core.ritesh.hibernate.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ritesh Kumar
 * @since Jun 23, 2015 5:59:29 PM
 * 
 */
@ContextConfiguration(locations = { "classpath*:Hibernate-Context-Test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class HibernateIntegrationTest {

	@Autowired
	Customer customer;

	@Autowired
	CustomerDao customerDao;

	@Test
	public void testSaveCustomer() {
		customer.setAddress("Indore");
		customer.setName("Ritesh Kumar");
		customer.setPhoneNo(123456789L);
		customerDao.saveCustomer(customer);

	}
}
