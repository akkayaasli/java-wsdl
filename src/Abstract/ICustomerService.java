package Abstract;

import entities.Customer;

public interface ICustomerService {
	//interface implementasyonunu yapan herkes bu Save metot yap�s�n� kullanmak zorunda.
	public void Save(Customer customer);
}
