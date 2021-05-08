package DataAccess.Concretes;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public String getPasswordByEmail(String email) {
        return null;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

}
