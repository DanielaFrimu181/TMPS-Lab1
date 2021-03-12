package Prototype.service;

import Prototype.classes.User;

import java.util.ArrayList;

public class UserService {
    ArrayList users;

    public UserService() {
        users = new ArrayList();
        users.add(new User("Damean","damean@gmail.com"));
        users.add(new User("Rotari","rotari@gmail.com"));
        users.add(new User("Romanov","romanov@gmail.com"));
        users.add(new User("Vacari","Vacari@gmail.com"));
    }
    public ArrayList getUsers(){
        return users;
    }
}