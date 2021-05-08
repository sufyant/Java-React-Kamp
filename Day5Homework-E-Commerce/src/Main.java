import Business.Abstracts.LoginVerifyService;
import Business.Abstracts.RegisterVerifyService;
import Business.Abstracts.UserService;
import Business.Abstracts.VerificationService;
import Business.Concretes.*;
import Core.Abstracts.AuthService;
import Core.Adapters.JGoogleAuthManagerAdapter;
import DataAccess.Abstracts.UserDao;
import DataAccess.Concretes.HibernateUserDao;
import DataAccess.Concretes.InMemoryUserDao;
import Entities.Concretes.User;
import GoogleAuth.JGoogleAuthManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {


    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        User sufyan = new User(1, "Sufyan", "Taskin", "sufyantaskin@gmail.com", "12345", false, true);
        userList.add(sufyan);


        UserDao               inMemoryUserDao       = new InMemoryUserDao(userList);
        UserDao               hibernateUserDao      = new HibernateUserDao();

        RegisterVerifyService registerVerifyService = new RegisterVerifyManager(inMemoryUserDao);
        LoginVerifyService    loginVerifyService    = new LoginVerifyServiceManager(inMemoryUserDao);
        VerificationService   verificationService   = new EmailVerificationManager();

        UserService           userService           = new UserManager(verificationService, inMemoryUserDao);

        AuthService           authManager           = new AuthManager(registerVerifyService, loginVerifyService, userService, inMemoryUserDao);
        AuthService           jGoogleAuthManager    = new JGoogleAuthManagerAdapter(new JGoogleAuthManager(), inMemoryUserDao);

        String optionsText = "Please choose an option below\n" +
                "1- Sign up\n" +
                "2- Sign up with Google\n" +
                "3- Login\n" +
                "4- Login with Google\n" +
                "Q- Quit";


        Scanner scanner =  new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("Welcome To E-Commerce Web Site");
        System.out.println("-------------------------------");

        while (true) {

            System.out.println(optionsText);
            String operation = scanner.nextLine();

            if (operation.equals("1")) {
                System.out.println("Please enter your first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Please enter your last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Please enter your email: ");
                String email = scanner.nextLine();
                System.out.println("Please enter your password: ");
                String password = scanner.nextLine();

                UUID myuuid = UUID.randomUUID();
                int id = (int) myuuid.getLeastSignificantBits();

                User user = new User(id, firstName, lastName, email, password, false, false);
                authManager.register(user);

                System.out.println("Please choose an option below");
                System.out.println("1- Verify");
                System.out.println("Q- Quit");
                String option = scanner.nextLine();

                if (option.equals("1")) {
                    verificationService.verify(user);
                }
                else {
                    System.out.println("Logging out...");
                    return;
                }

            }
            else if (operation.equals("2")) {
                System.out.println("Please enter your first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Please enter your last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Please enter your email: ");
                String email = scanner.nextLine();
                System.out.println("Please enter your password: ");
                String password = scanner.nextLine();

                UUID myuuid = UUID.randomUUID();
                int id = (int) myuuid.getLeastSignificantBits();

                User user = new User(id, firstName, lastName, email, password, false, false);
                jGoogleAuthManager.register(user);


            }
            else if (operation.equals("3")) {
                System.out.println("Please enter your email: ");
                String email = scanner.nextLine();
                System.out.println("Please enter your password: ");
                String password = scanner.nextLine();

                authManager.login(email, password);
            }
            else if (operation.equals("4")) {
                System.out.println("Please enter your email: ");
                String email = scanner.nextLine();
                System.out.println("Please enter your password: ");
                String password = scanner.nextLine();

                jGoogleAuthManager.login(email, password);
            }
            else if (operation.toLowerCase().equals("q")) {
                System.out.println("Logging out...");
                return;
            }
            else {
                System.out.println("Please enter a valid value...");
            }

        }



    }

}
