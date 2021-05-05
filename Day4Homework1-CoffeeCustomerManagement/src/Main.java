import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1,"süfyan","taşkın","11111111111", new Date(1990,5,16));

        BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        BaseCustomerManager neroCustomerManager      = new NeroCustomerManager();

        starbucksCustomerManager.save(customer);
        neroCustomerManager.save(customer);


    }

}
