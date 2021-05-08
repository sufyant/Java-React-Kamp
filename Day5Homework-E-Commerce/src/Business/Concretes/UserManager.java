package Business.Concretes;

import Business.Abstracts.RegisterVerifyService;
import Business.Abstracts.UserService;
import Business.Abstracts.VerificationService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private final VerificationService verificationService;
    private final UserDao userDao;

    public UserManager(VerificationService verificationService, UserDao userDao) {
        this.verificationService = verificationService;
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        verificationService.send(user);
        userDao.add(user);
    }

    @Override
    public void update(User user) {
        System.out.println("Hello, " + user.getFirstName().substring(0, 1).toUpperCase() + user.getFirstName().substring(1));
        System.out.println("We updated your account!");
        userDao.update(user);
    }

    @Override
    public void delete(User user) {
        System.out.println("Hello " + user.getFirstName().substring(0, 1).toUpperCase() + user.getFirstName().substring(1) + ", we are sorry to hear that you want to leave the our family");
        System.out.println("Your account is deleted. We hope you come again!");
        userDao.delete(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getById(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

}
