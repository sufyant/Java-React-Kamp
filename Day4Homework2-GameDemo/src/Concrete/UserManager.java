package Concrete;

import Entities.User;
import Interfaces.UserCheckService;
import Interfaces.LoggerService;
import Interfaces.UserService;

public class UserManager implements UserService {

    LoggerManager loggerManager;
    UserCheckService userCheckService;

    public UserManager(UserCheckService userCheckService, LoggerService loggerService) {
        this.userCheckService = userCheckService;
        this.loggerManager = new LoggerManager(loggerService);
    }

    @Override
    public void register(User user) {
        if (userCheckService.isUserValid(user)) {
            System.out.println("Kimlik dogrulama basarili\n " + user.getFirstName() + " adli kullanici kayit edildi...");
            loggerManager.log();
        }
        else {
            System.out.println("Kullanici dogrulanamadi...");
            loggerManager.log();
        }
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " adli kullanici silindi...");
        loggerManager.log();
    }

    @Override
    public void update(User user, String newName) {
        user.setFirstName(newName);
        System.out.println(user.getFirstName() + " adli kullanicinin ismi guncellendi...\n Yeni isim: " + user.getFirstName());
        loggerManager.log();
    }
}
