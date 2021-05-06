package concretes;

import abstracts.CustomerCheckService;
import entitiess.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        return false;
    }
}
