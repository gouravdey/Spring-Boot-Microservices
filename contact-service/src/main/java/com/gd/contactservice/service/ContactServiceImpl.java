package com.gd.contactservice.service;

import com.gd.contactservice.model.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> contactList = Arrays.asList(
            new Contact(1L, "amit@gmail.com", "Amit", 1L),
            new Contact(2L, "anil@gmail.com", "Anil", 1L),
            new Contact(3L, "rohan@gmail.com", "Rohan", 2L),
            new Contact(4L, "sameer@gmail.com", "Sameer", 4L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contactList.stream()
                .filter(contact -> contact.getUserId().equals(userId))
                .collect(Collectors.toList());
    }
}
