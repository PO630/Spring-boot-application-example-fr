package com.example.demo.user.model;

import com.example.demo.user.view.UserView;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="user")
public class User implements Serializable {

    @Id
    @Column(name="id_user")
    @GeneratedValue
    @JsonView( { UserView.UserViewPublic.class , UserView.UserViewSimple.class } )
    private Integer id;

    @Column(name="name_user")
    @JsonView( { UserView.UserViewPublic.class , UserView.UserViewSimple.class } )
    private String name;

    @Column(name="password_user")
    @JsonView(UserView.UserViewPrivate.class)
    private String password;

    @Column(name="email_user")
    @JsonView(UserView.UserViewPrivate.class)
    private String email;

    @Column(name="avatar_user")
    @JsonView( { UserView.UserViewPublic.class , UserView.UserViewSimple.class } )
    private String avatar;

    @Column(name="ban_user")
    @JsonView( { UserView.UserViewPublic.class , UserView.UserViewSimple.class } )
    private Integer ban;

    @OneToMany(mappedBy="user")
    @JsonView( UserView.UserViewPublic.class )
    private Set<UserFollow> userFollows;

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
