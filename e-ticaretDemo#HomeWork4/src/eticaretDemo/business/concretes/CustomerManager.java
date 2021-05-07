package eticaretDemo.business.concretes;



import java.util.regex.Matcher;


import java.util.regex.Pattern;
import eticaretDemo.business.abstracts.CustomerService;
import eticaretDemo.core.GoogleLoggerManagerAdapter;
import eticaretDemo.core.GoogleService;
import eticaretDemo.dataAccess.abstracts.CustomerDao;
import eticaretDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
	private CustomerDao customerDao;
	private GoogleService googleService;
	

	


	public CustomerManager(CustomerDao customerDao, GoogleService googleService ) {
		super();
		this.customerDao = customerDao;
		this.googleService = googleService;
	}

	@Override
	public void register(Customer customer) {
		if(checkMailAddress(customer)==true && customer.getPasword().length()>=5 && verif(customer) == true && customer.getFirstName().length()>=2 && customer.getLastName().length()>=2) {
			System.out.println("Aramıza Hoş Geldin ! : " + customer.getFirstName());
		}else {
			System.out.println("Girdiğiniz Bilgiler Hatalı Gözüküyor. Lütfen Kontrol Ediniz. ");
			
			return;
		}
		
		
	}

	@Override
	public void login(Customer customer, String eMail, String password) {
		if(eMail == customer.geteMail() && password == customer.getPasword()) {
			System.out.println("Sisteme Giriş Başaralı. Hoş Geldin : " + customer.getFirstName());
			
		}else {
			System.out.println("Giriş Bilgileri Hatalı ! Tekrar Deneyiniz. ");
		}
		
	}

	@Override
	public boolean checkMailAddress(Customer customer) {
		Pattern pattern = Pattern.compile("@");
		Pattern pattern1 = Pattern.compile(".com");
		Matcher matcher = pattern.matcher(customer.geteMail());
		Matcher matcher1 = pattern.matcher(customer.geteMail());
		if(matcher.find() && matcher1.find() == true) {
			return true;
		}else {
			return false;
		}
		
		
		
	}

	@Override
	public void verificationStatement(Customer customer) {
		System.out.println("Hesap Doğrulama Maili Gönderilidi.");
		
	}

	@Override
	public boolean verif(Customer customer) {
		System.out.println("Hesabınız Başarıyla Doğrulanmıştır.");
		return true;
	}

	

}
