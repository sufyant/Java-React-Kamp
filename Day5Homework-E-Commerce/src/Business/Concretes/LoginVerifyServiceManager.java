package Business.Concretes;

import Business.Abstracts.LoginVerifyService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class LoginVerifyServiceManager implements LoginVerifyService {

    private final UserDao userDao;

    public LoginVerifyServiceManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean isPasswordValid(User user, String enteredPassword) {
        String realPassword = userDao.getPasswordByEmail(user.getEmail());
        return realPassword != null && realPassword.equals(enteredPassword);
    }
}
