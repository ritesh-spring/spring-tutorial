/**
 * 
 */
package spring.core.ritesh.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 * @author Ritesh Kumar
 * @since   Jun 20, 2015 2:24:38 AM
 * 
 */
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	SessionFactory sessionFacory;
	
   private static final Logger log=Logger.getLogger(CustomerDaoImpl.class);
   
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		log.info("Executing saveCustomer(Customer customer) IN "+log.getName());
		sessionFacory.getCurrentSession().save(customer);
		log.info("Execution Finished saveCustomer(Customer customer) IN "+log.getName());
	}

	@Transactional
	public void updateCustomer(Customer customer, int customer_id) {
		// TODO Auto-generated method stub
		Session session = sessionFacory.getCurrentSession();
		Customer customerToUpdate = (Customer) session.get(Customer.class,
				customer_id);
		customerToUpdate.setAddress(customer.getAddress());
		session.saveOrUpdate(customerToUpdate);
	}

	@Transactional
	public void deleteCustomer(int customer_id) {
		// TODO Auto-generated method stub
		if(getCustomer(customer_id) != null)
		sessionFacory.getCurrentSession().delete(getCustomer(customer_id));
	}

	@Transactional
	public Customer getCustomer(int customer_id) {
		// TODO Auto-generated method stub
		return (Customer) sessionFacory.getCurrentSession().get(Customer.class,
				customer_id);
	}

	@Transactional
	public List<Customer> getCustomers() {
		@SuppressWarnings("unchecked")
		List<Customer> customers= sessionFacory.getCurrentSession().createQuery("from Customer").list();
		return customers;
	}
}
