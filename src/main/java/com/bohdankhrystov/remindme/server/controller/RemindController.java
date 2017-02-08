package com.bohdankhrystov.remindme.server.controller;

import com.bohdankhrystov.remindme.server.entity.User;
import com.bohdankhrystov.remindme.server.repository.UserRepository;
import com.bohdankhrystov.remindme.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Bodia on 07.02.2017.
 */

@RestController
@RequestMapping("/reminder")
public class RemindController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUserList() {
        return userService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @RequestMapping(value = "/save/{id}", method = RequestMethod.POST)
    @ResponseBody
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteUser(@PathVariable long id) {
        userService.remove(id);
    }

}
