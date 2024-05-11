package odev1;

public class StarbucksCustomerManager extends BaseCustomerManager{
 private ICustomerCheckService checkService;
  
      public StarbucksCustomerManager (ICustomerCheckService checkService) {
    	  this.checkService=checkService;
      }
      @Override
	
	public void save(Customer customer) {
    	  if (checkService.check(customer)) {
    		  super.save(customer);
    	  }
    	  System.out.println("Not a valid Porsen");
      }
 

}
