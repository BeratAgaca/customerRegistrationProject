import java.util.ArrayList;

import business.abstracts.CustomerService;
import business.concretes.CustomerManager;
import core.abstracts.EmailValidatorService;
import core.concretes.EmailValidatorAdapter;
import dataAccess.abstracts.CustomerDao;
import dataAccess.concretes.HibernateCustomerDao;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("berat@outlook.com","123456");
		customer.setFirstName("berat");
		customer.setSurname("agaca");
		customer.emails.add("berat@outlook.com");
		
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(),new EmailValidatorAdapter());
		customerService.register(customer);
	 
		
	}

}
