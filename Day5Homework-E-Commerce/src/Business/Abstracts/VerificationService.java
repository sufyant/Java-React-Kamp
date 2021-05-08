package Business.Abstracts;

import Entities.Concretes.User;

public interface VerificationService {
    void send(User user);
    void verify(User user);
}
