package dataAccess.abstracts;

import entities.concretes.Customer;

public interface CustomerDao {
	void register(Customer customer);
	void delete(Customer customer);

}
