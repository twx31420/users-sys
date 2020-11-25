package edu.nf.users.test;

import edu.nf.users.service.UserService;
import org.junit.Test;

public class UserTest {
    @Test
    public void testlistUser(){
        System.out.println(new UserService().usersList());
    }
}
