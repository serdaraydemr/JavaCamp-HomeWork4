package eticaretDemo.dataAccess.concretes;

import java.util.List;

import eticaretDemo.dataAccess.abstracts.CustomerDao;
import eticaretDemo.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate Veritabanına Eklendi : " + customer.getFirstName() +" " + customer.getId());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Hibernate Veritabanından Silindi :" +customer.getFirstName() +   customer.getId());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Hibernate  Veritabanında Güncellendi : " + customer.getFirstName());
		
	}

	
	@Override
	public List<Customer> getAll(Customer customer) {
		System.out.println("Hibernate Veritabanı İle Listeleniyor : " + customer.getFirstName() );
		return null;
	}

	@Override
	public Customer get(int id) {
		System.out.println("Kullanıcı Detayları : " + id  );
		return null;
	}

}
