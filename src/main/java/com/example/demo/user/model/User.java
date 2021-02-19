package com.example.demo.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name="id_user")
    @GeneratedValue
    private Integer id;

    @Column(name="name_user")
    private String name;

    @Column(name="password_user")
    private String password;

    @Column(name="email_user")
    private String email;

    @Column(name="avatar_user")
    private String avatar;

    @Column(name="ban_user")
    private Integer ban;

    public User() {
        super();
    }

    // Generate with ALT+SHIFT+S => getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getBan() {
        return ban;
    }

    public void setBan(Integer ban) {
        this.ban = ban;
    }

}
