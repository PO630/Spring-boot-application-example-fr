package com.example.demo.user.view;

public class UserFollowView {

    public static class UserFollowViewSimple {}

    public static class UserFollowViewWithUserPublic extends UserView.UserViewSimple{ }
    public static class UserFollowViewWithUserPrivate extends UserView.UserViewSimple { }

    public static class UserFollowViewPublic extends UserFollowViewWithUserPublic { }
    public static class UserFollowViewPrivate extends UserFollowViewWithUserPrivate { }

}
