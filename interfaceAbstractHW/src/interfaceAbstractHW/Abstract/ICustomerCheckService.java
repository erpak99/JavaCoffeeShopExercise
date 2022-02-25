package interfaceAbstractHW.Abstract;

import java.rmi.RemoteException;

import interfaceAbstractHW.Entities.Customer;

public interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}
