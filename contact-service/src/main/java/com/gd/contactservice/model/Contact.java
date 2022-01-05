package com.gd.contactservice.model;

public class Contact {

    private Long contactId;
    private String emailId;
    private String contactName;
    private Long userId;

    public Contact(Long contactId, String emailId, String contactName, Long userId) {
        this.contactId = contactId;
        this.emailId = emailId;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact() {
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
