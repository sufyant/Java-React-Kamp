package Adapters;

import Entities.User;
import Interfaces.UserCheckService;
import MernisServiceAdapter.KPSPublic;

public class MernisServiceAdapter implements UserCheckService {

    @Override
    public boolean isUserValid(User user) {
        KPSPublic service = new KPSPublic();

        return service.getKPSPublicSoap().tcKimlikNoDogrula(
                                                            Long.parseLong(user.getNationalityID()),
                                                            user.getFirstName(),
                                                            user.getLastName().toUpperCase(),
                                                            user.getDateOfBirth().getYear());
    }
}
