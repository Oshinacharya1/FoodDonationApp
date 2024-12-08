package org.food.donation.Impl;

import org.food.donation.Dao.UserDao;
import org.food.donation.Model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    @Override
    public List<User> getUsers() {
        return users;
    }
}
