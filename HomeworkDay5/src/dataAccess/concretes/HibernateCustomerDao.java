package dataAccess.concretes;

 

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
 


	

	@Override
	public void register(Customer customer) {
        customer.emails.add(customer.geteMail());
		
		System.out.println("user registered successfully : "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		 
		System.out.println("user deleted successfully : "+customer.getFirstName());
		
	}

}
