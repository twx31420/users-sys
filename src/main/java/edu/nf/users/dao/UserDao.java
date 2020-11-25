package edu.nf.users.dao;

import edu.nf.users.entity.Users;

import java.util.List;

public interface UserDao {
    /**
     * 添加用户
     */
    void addUser(Users users);

    /**
     * 查询用户
     */
    List<Users> listUser();
}
