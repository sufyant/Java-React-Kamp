package Core.Abstracts;

import Entities.Concretes.User;

public interface AuthService {
    void register(User user);
    void login(String email, String password);
}
