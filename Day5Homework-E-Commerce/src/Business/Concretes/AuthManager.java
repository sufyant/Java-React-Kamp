package Business.Concretes;

import Business.Abstracts.LoginVerifyService;
import Business.Abstracts.RegisterVerifyService;
import Business.Abstracts.UserService;
import Core.Abstracts.AuthService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class AuthManager implements AuthService {

    RegisterVerifyService registerVerifyService;
    LoginVerifyService loginVerifyService;
    UserService userService;
    UserDao userDao;

    public AuthManager(RegisterVerifyService registerVerifyService, LoginVerifyService loginVerifyService, UserService userService, UserDao userDao) {
        this.registerVerifyService = registerVerifyService;
        this.loginVerifyService    = loginVerifyService;
        this.userService           = userService;
        this.userDao               = userDao;
    }

    @Override
    public void register(User user) {
        if (    registerVerifyService.isVerifyFirstName(user.getFirstName()) &&
                registerVerifyService.isVerifyLastName(user.getLastName())   &&
                registerVerifyService.isVerifyEmail(user.getEmail())         &&
                registerVerifyService.isExistEmail(user.getEmail())          &&
                registerVerifyService.isVerifyPassword(user.getPassword())) {
            userService.add(user);
        }
        else {
            System.out.println("Sorry an error occurred!");
            System.out.println("We are unable to create your membership due to the above reason or reasons");
            System.out.println("Please fix the errors and try again.");
        }
    }

    @Override
    public void login(String email, String enteredPassword) {
        User user = userDao.getUserByEmail(email);
        if (user != null && loginVerifyService.isPasswordValid(user, enteredPassword)) {
            System.out.println("You have successfully logged in!");
            System.out.println("Hello " + user.getFirstName().substring(0, 1).toUpperCase() + user.getFirstName().substring(1) + "!");
        }
        else {
            if (user == null) {
                System.out.println("-No user can be found for this email!");
            }
            else {
                System.out.println("-The password and confirmation password do not match!");
            }
            System.out.println("Sorry an error occurred!");
            System.out.println("We are unable to login your account due to the above reason or reasons");
            System.out.println("Please fix the errors and try again.");
        }




    }
}
