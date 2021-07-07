package business.abstracts;

import entities.concretes.Customer;

public interface CustomerService {
	void register(Customer customer);
	void delete(Customer customer);
	

}
