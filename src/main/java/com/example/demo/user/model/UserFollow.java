package com.example.demo.user.model;

import com.example.demo.user.view.UserFollowView;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user_follow")
public class UserFollow implements Serializable {

    @Id
    @Column(name="id_user_follow")
    @GeneratedValue
    @JsonView( { UserFollowView.UserFollowViewPublic.class , UserFollowView.UserFollowViewSimple.class } )
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user_user_follow", referencedColumnName = "id_user")
    @JsonView( UserFollowView.UserFollowViewPrivate.class )
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_follow_user_follow", referencedColumnName = "id_user")
    @JsonView( UserFollowView.UserFollowViewPublic.class )
    private User follow;

    public UserFollow() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFollow() {
        return follow;
    }

    public void setFollow(User follow) {
        this.follow = follow;
    }
}
