package core.abstracts;

import entities.concretes.Customer;

public interface EmailValidatorService {
	boolean isValidEmail(Customer customer);

}
