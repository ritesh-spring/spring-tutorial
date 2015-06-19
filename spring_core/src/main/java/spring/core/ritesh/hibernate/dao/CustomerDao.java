/**
 * 
 */
package spring.core.ritesh.hibernate.dao;

import java.util.List;

/**
 * @author Ritesh Kumar
 * @since   Jun 20, 2015 2:23:16 AM
 * 
 */
public interface CustomerDao {
	public void saveCustomer(Customer customer);

	public void updateCustomer(Customer customer,int customer_id);

	public void deleteCustomer(int customer_id);

	public Customer getCustomer(int customer_id);
	
	/**
	 * @return List of Customers... 
	 */
	public List<Customer> getCustomers();
}
