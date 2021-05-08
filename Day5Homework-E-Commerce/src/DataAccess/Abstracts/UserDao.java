package DataAccess.Abstracts;

import Entities.Concretes.User;

import java.util.List;

public interface UserDao {
    void       add(User user);
    void       update(User user);
    void       delete(User user);
    String     getPasswordByEmail(String email);
    User       getById(int id);
    User       getUserByEmail(String email);
    List<User> getAllUsers();

}
