package Business.Concretes;

import Business.Abstracts.VerificationService;
import Entities.Concretes.User;

public class EmailVerificationManager implements VerificationService {

    @Override
    public void send(User user) {
        System.out.println("Hello " + user.getFirstName().substring(0, 1).toUpperCase() + user.getFirstName().substring(1) + "!");
        System.out.println("We'll send an email to "+ user.getEmail() + " in 5 minutes. Open it up to activate your account.");
    }

    @Override
    public void verify(User user) {
        System.out.println("Welcome " + user.getFirstName().substring(0, 1).toUpperCase() + user.getFirstName().substring(1) + "!");
        System.out.println("Your registration is complete.");
        System.out.println("Redirecting to the main menu...");

    }
}
