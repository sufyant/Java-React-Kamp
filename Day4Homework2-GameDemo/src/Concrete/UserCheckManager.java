package Concrete;

import Entities.User;
import Interfaces.UserCheckService;

public class UserCheckManager implements UserCheckService {

    @Override
    public boolean isUserValid(User user) {
        return true;
    }
}
