package business.concretes;

import com.mkyong.regex.email.EmailValidator;

import business.abstracts.CustomerService;
import core.abstracts.EmailValidatorService;
import dataAccess.abstracts.CustomerDao;
import dataAccess.concretes.HibernateCustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	private CustomerDao customerDao;
	private EmailValidatorService emailValidatorService;
	
	public CustomerManager(CustomerDao customerDao,EmailValidatorService emailValidatorService) {
		super();
		this.customerDao = customerDao;
		this.emailValidatorService=emailValidatorService;
	}

	

	@Override
	public void register(Customer customer) {
		  if(customer.getFirstName().length()>=2 & customer.getSurname().length()>=2 ) {
			  if(customer.getPassword().length()>=6) {
				  if(emailValidatorService.isValidEmail(customer)) {
						customerDao.register(customer);
				  }
				  else {
					  System.out.println("lütfen geçerli bir email giriniz");
				  }
			  }
			  else {
				  System.out.println("lütfen geçerli bir password giriniz");
			  }
		  }
		  else {
			  System.out.println("lütfen geçerli bir isim soyisim giriniz");
		  }
	}

 
	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
