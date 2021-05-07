package eticaretDemo.business.abstracts;



import eticaretDemo.entities.concretes.Customer;

public interface CustomerService {
	void register(Customer customer);
	void login(Customer customer, String eMail, String password);
	boolean checkMailAddress(Customer customer);
	void verificationStatement(Customer customer);
	boolean verif(Customer customer);

}
