package odev1;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		Customer customer1 =new Customer(1, "kadir","karaoglu",new Date (2005,03,23),"1365465485");
		baseCustomerManager.save(customer1);
		

	}

}
