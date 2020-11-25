package edu.nf.users.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;

@Data
public class Users {
    private Integer id;
    private String name;
    private String pwd;
    private Integer age;
    private String sex;
    private String tel;
    private String email;
    private String address;
}
