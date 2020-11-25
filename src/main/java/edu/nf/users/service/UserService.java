package edu.nf.users.service;

import edu.nf.users.dao.UserDao;
import edu.nf.users.dao.impl.UserDaoImpl;
import edu.nf.users.entity.Users;

import java.util.List;

public class UserService {

    public void addUser(Users users){
        new UserDaoImpl().addUser(users);
    }

    public List<Users> usersList(){
        return new UserDaoImpl().listUser();
    }
}
