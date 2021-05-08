package DataAccess.Concretes;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.List;

public class InMemoryUserDao implements UserDao {

    List<User> userList;

    public InMemoryUserDao(List<User> userList) {
        this.userList = userList;
    }


    @Override
    public void add(User user) {
        userList.add(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {
        userList.remove(user);
    }

    @Override
    public String getPasswordByEmail(String email) {
        User user = getUserByEmail(email);
        return user.getPassword();
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

}
