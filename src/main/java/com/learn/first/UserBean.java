package com.learn.first;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "user")
public class UserBean implements Serializable {

    private String userName;
    private String password;
    private String message;
    private boolean rememberMe;
    private String[] language;
    private String gender;
    private String country;
    public UserBean() {
    }

    public void doCommand(){
        System.out.println("button clicked !");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
