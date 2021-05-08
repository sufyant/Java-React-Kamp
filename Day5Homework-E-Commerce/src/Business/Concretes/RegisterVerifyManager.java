package Business.Concretes;

import Business.Abstracts.RegisterVerifyService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterVerifyManager implements RegisterVerifyService {

    private final UserDao userDao;

    public RegisterVerifyManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean isVerifyPassword(String password) {
        if (password.length() < 6) {
            System.out.println("-Password must be at least 6 characters!");
            return false;
        }
        else
            return true;
    }

    @Override
    public boolean isVerifyEmail(String email) {
        String  regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        else {
            System.out.println("-This email adress is invalid!");
            return false;
        }
    }

    @Override
    public boolean isExistEmail(String email) {
        List<User> mailList = userDao.getAllUsers();
        for (User user : mailList) {
            if (user.getEmail().equals(email)) {
                System.out.println("-This email is already registered please choose another one!");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isVerifyFirstName(String firstName) {
        if (firstName.length() < 2) {
            System.out.println("-First name must be at least 6 characters!");
            return false;
        }
        else {
            return true;
        }

    }

    @Override
    public boolean isVerifyLastName(String lastName) {
        if (lastName.length() < 2) {
            System.out.println("-Last name must be at least 6 characters!");
            return false;
        }
        else {
            return true;
        }
    }
}
