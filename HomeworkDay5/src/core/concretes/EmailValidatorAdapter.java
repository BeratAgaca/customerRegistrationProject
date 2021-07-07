package core.concretes;

import com.mkyong.regex.email.EmailValidator;

import core.abstracts.EmailValidatorService;
import entities.concretes.Customer;

public class EmailValidatorAdapter implements EmailValidatorService{

 
	
	
	
	
	
	@Override
	public boolean isValidEmail(Customer customer) {
        for(String ctrl : customer.getEmails()) {
        	if(ctrl==customer.geteMail()) {
        		return false;
        	}
        	else {
        		return EmailValidator.isValid(customer.geteMail());
        	}
        }
        return true;
	

	}
	

}
