package com.gd.userservice.service;

import com.gd.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> userList = Arrays.asList(
            new User(1L, "Durgesh Tiwari", "23525625"),
            new User(2L, "Ankit Tiwari", "99999"),
            new User(4L, "Ravi Tiwari", "888")
    );

    @Override
    public User getUser(Long id) {
        return userList.stream()
                .filter(user -> user.getUserId().equals(id))
                .findAny().orElse(null);
    }
}
