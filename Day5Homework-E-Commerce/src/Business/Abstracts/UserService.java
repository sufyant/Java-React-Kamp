package Business.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserService {
    void       add(User user);
    void       update(User user);
    void       delete(User user);
    User       getUserById(int id);
    User       getUserByEmail(String email);
    List<User> getAllUsers();

}
