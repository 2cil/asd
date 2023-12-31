package com.atu.entity;

public class Users {
    private int uid;
    private String username;
    private String password;
    private int role;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Users(int uid, String username, String password, int role) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Users() {
    }
}
