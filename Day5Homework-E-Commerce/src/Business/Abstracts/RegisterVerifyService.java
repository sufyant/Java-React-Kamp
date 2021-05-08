package Business.Abstracts;

public interface RegisterVerifyService {
    boolean isVerifyPassword(String password);
    boolean isVerifyEmail(String email);
    boolean isExistEmail(String email);
    boolean isVerifyFirstName(String firstName);
    boolean isVerifyLastName(String lastName);
}
