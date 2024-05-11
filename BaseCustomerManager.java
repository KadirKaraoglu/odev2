package odev1;

public abstract class BaseCustomerManager implements CustomerServis{
	

	@Override
	public void save(Customer customer) {	
		System.out.println(customer.getFirtsName()+"save to db");
	}


}
