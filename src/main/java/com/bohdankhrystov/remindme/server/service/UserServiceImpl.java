package com.bohdankhrystov.remindme.server.service;

import com.bohdankhrystov.remindme.server.entity.User;
import com.bohdankhrystov.remindme.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Bodia on 08.02.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    public User save(User user) {
        return userRepository.saveAndFlush(user);
    }

    public void remove(long id) {
        userRepository.delete(id);
    }
}
