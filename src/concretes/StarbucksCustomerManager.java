package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entitiess.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }
    @Override
    public void save(Customer customer) {

        if (customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
            System.out.println("Valid person.");
        }else{
            System.out.println("Not a valid person.");
        }
    }

}
