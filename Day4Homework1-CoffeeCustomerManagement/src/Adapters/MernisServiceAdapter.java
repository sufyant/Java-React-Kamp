package Adapters;


import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceAdapter.KPSPublic;


import java.rmi.RemoteException;
import java.util.Date;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer)  {
        KPSPublic service = new KPSPublic();

        return service.getKPSPublicSoap().tcKimlikNoDogrula(Long.parseLong(customer.nationalityId),
                                                    customer.firstName.toUpperCase(),
                                                    customer.lastName.toUpperCase(),
                                                    customer.dateOfBirth.getYear());

    }

}
