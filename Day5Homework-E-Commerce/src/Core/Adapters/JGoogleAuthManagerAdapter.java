package Core.Adapters;

import Core.Abstracts.AuthService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;
import GoogleAuth.JGoogleAuthManager;

public class JGoogleAuthManagerAdapter implements AuthService {

    private final JGoogleAuthManager jGoogleAuthManager;
    UserDao userDao;

    public JGoogleAuthManagerAdapter(JGoogleAuthManager jGoogleAuthManager, UserDao userDao) {
        this.jGoogleAuthManager = jGoogleAuthManager;
        this.userDao            = userDao;
    }

    @Override
    public void register(User user) {
        jGoogleAuthManager.register(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
    }

    @Override
    public void login(String email, String password) {
        User user = userDao.getUserByEmail(email);
        jGoogleAuthManager.login(user.getEmail(), user.getPassword(), user.getFirstName());
    }
}
