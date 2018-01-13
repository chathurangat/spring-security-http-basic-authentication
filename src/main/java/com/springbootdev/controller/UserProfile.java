package com.springbootdev.controller;

public class UserProfile {

    private String username;

    private String name;

    public UserProfile() {
        super();
    }

    public UserProfile(String username, String name) {
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
