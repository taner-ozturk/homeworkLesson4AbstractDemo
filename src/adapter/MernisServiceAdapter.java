package adapter;

import abstracts.CustomerCheckService;
import entitiess.Customer;
import mernisReferance.MKAKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        MKAKPSPublicSoap client = new MKAKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(Locale.ROOT), customer.getLastName().toUpperCase(Locale.ROOT), customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
