package entities.abstracts;

 
public class BaseCustomer {
	private String firstName;
	private String surname;
	
	public BaseCustomer() {
		
	}
	public BaseCustomer(String firstName, String surname) {
		super();
		this.firstName = firstName;
		this.surname = surname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

}
