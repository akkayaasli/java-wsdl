package Abstract;

import entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	public void Save(Customer customer) {
		System.out.println("Save to db : "+customer.FirstName);
	}

	

}
