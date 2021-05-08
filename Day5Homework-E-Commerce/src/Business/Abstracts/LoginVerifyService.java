package Business.Abstracts;

import Entities.Concretes.User;

public interface LoginVerifyService {
    boolean isPasswordValid(User user, String password);
}
