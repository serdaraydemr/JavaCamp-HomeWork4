package eticaretDemo;

import eticaretDemo.business.abstracts.CustomerService;
import eticaretDemo.business.concretes.CustomerManager;
import eticaretDemo.dataAccess.abstracts.CustomerDao;
import eticaretDemo.dataAccess.concretes.HibernateCustomerDao;
import eticaretDemo.entities.concretes.Customer;
import googleLogger.GoogleLoggerManager;
import eticaretDemo.core.GoogleLoggerManagerAdapter;
import eticaretDemo.core.GoogleService;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new HibernateCustomerDao(), null);
		Customer customer = new Customer(1, "Fatih Serdar", "Aydemir", "serdaraydemr@gmail.com", "123456");
		customerManager.register(customer);
		
		System.out.println("*******************************");
		
		customerManager.login(customer, "serdaraydemr@gmail.com","123456" );
		
		System.out.println("*******************************");
		
		customerManager.checkMailAddress(customer);
		customerManager.verificationStatement(customer);
		customerManager.verif(customer);
		
		System.out.println("*******************************");
		
		GoogleService service = new GoogleLoggerManagerAdapter();
		service.ggoogleAdapter(null);
		
		System.out.println("*******************************");
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
	 
		

	}
	

}
