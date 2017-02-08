package com.bohdankhrystov.remindme.server.service;

import com.bohdankhrystov.remindme.server.entity.User;

import java.util.List;

/**
 * Created by Bodia on 08.02.2017.
 */
public interface UserService {
    List<User> getAll();

    User getById(Long id);

    User save(User user);

    void remove(long id);
}
