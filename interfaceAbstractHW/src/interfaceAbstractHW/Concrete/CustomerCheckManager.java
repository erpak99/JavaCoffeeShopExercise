package interfaceAbstractHW.Concrete;

import interfaceAbstractHW.Abstract.ICustomerCheckService;
import interfaceAbstractHW.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true; 
	}
	
}
