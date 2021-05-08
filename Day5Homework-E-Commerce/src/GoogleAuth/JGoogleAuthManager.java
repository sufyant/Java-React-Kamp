package GoogleAuth;


public class JGoogleAuthManager {

    public void register(String firstName, String lastName, String email, String password) {
        System.out.println("Welcome to Google " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + "!");
        System.out.println("Registered with Google Account...");
    }

    public void login(String email, String password, String firstName) {
        System.out.println("You have successfully logged in with Google Account!");
        System.out.println("Hello " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + "!");
    }


}
