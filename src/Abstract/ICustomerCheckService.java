package Abstract;

import entities.Customer;

public interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
	
}
