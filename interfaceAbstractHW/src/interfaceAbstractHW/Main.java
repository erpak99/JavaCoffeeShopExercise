package interfaceAbstractHW;

import Adapters.MernisServiceAdapter;
import interfaceAbstractHW.Abstract.BaseCustomerManager;
import interfaceAbstractHW.Concrete.NeroCustomerManager;
import interfaceAbstractHW.Concrete.StarbucksCustomerManager;
import interfaceAbstractHW.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(11, "Arda", "Erpak", 2000, 1234567890L));
	}

}
