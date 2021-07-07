package entities.concretes;

import java.awt.List;
import java.util.ArrayList;

import entities.abstracts.BaseCustomer;

public class Customer extends BaseCustomer {

	
	private String eMail;
	private String password;
	public ArrayList<String> emails = new ArrayList<String>();
	public Customer() {
		
	}
	public Customer(String eMail, String password) {
		super();
		this.eMail = eMail;
		this.password = password;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<String> getEmails() {
		return emails;
	}
	 
	 
	
}
