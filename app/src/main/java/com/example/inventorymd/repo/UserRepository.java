package com.example.inventorymd.repo;

import com.example.inventorymd.pojo.User;

import java.util.ArrayList;

/**
 * Created by usuario on 8/11/17.
 */

public class UserRepository {

    ArrayList<User> users;
    static UserRepository userRepository;

    static {
        userRepository = new UserRepository();
    }

    void inicializarUsers()
    {
        addUser(new User(1, "user1", "usuario", "user1", "user1@gmail.com", true, true));
        addUser(new User(2, "user2", "usuario2", "user2", "user2@gmail.com", false, false));
        addUser(new User(2, "user3", "usuario3", "user3", "user3@gmail.com", false, true));
    }

    private UserRepository()
    {
        this.users = new ArrayList<>();
        inicializarUsers();
    }

    void addUser(User u)
    {
        users.add(u);
    }

    public static UserRepository getInstance()
    {
        return userRepository;
    }

    public ArrayList<User> getUsers()
    {
        return users;
    }

    // Metodo
    public boolean userExists(User checkingUser)
    {
        return true;
    }
}
