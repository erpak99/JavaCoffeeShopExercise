package Adapters;

import java.rmi.RemoteException;

import interfaceAbstractHW.Abstract.ICustomerCheckService;
import interfaceAbstractHW.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
	KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		return(proxy.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),customer.getDateOfBirth()));
	}
	
}
