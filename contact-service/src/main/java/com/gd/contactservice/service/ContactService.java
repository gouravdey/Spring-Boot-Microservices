package com.gd.contactservice.service;

import com.gd.contactservice.model.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);

}
