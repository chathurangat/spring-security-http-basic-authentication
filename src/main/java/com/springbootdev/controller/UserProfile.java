package com.springbootdev.controller;

/**
 * Created with IntelliJ IDEA.
 * User: chathuranga
 * Date: 9/4/17
 * Time: 3:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserProfile {


    private String username;
    private String name;


    public UserProfile(String username,String name) {
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
