import abstracts.BaseCustomerManager;
import adapter.MernisServiceAdapter;
import concretes.CustomerCheckManager;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entitiess.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Taner","Öztürk",LocalDate.of(2020,9,28),"43546534563"));
    }
}
