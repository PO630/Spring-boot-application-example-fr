package com.example.demo.user.view;

public class UserView {

    public static class UserViewSimple {}

    public static class UserViewPublic extends UserFollowView.UserFollowViewSimple {}

    public static class UserViewPrivate extends UserViewPublic {}


}
