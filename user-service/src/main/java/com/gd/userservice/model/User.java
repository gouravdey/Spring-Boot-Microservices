package com.gd.userservice.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long userId;
    private String userName;
    private String phoneNumber;

    List<Contact> contacts = new ArrayList<>();

    public User(Long userId, String userName, String phoneNumber, List<Contact> contacts) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.contacts = contacts;
    }

    public User(Long userId, String userName, String phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
