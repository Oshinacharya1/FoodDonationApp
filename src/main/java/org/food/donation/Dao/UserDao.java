package org.food.donation.Dao;

import org.food.donation.Model.User;
import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getUsers();
}
