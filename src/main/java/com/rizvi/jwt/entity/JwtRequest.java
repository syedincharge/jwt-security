package com.rizvi.jwt.entity;


public class JwtRequest {
    private String userName;
    private String userPassword;

    public JwtRequest(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
