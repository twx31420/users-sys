package edu.nf.users.controller;

import edu.nf.users.entity.Users;
import edu.nf.users.service.UserService;
import org.nf.mvc.core.WebRequest;
import org.nf.mvc.view.JsonView;
import org.nf.mvc.view.RedirectView;
import org.nf.mvc.view.View;

public class UserServlet {

    @WebRequest("/page/add")
    public View addUser(Users users){
        new UserService().addUser(users);
        return new RedirectView("index.html");
    }
    @WebRequest("/page/list")
    public View listuser(){
        return new JsonView(new UserService().usersList());
    }
}
