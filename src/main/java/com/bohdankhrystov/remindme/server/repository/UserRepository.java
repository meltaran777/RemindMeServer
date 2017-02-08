package com.bohdankhrystov.remindme.server.repository;

import com.bohdankhrystov.remindme.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Bodia on 08.02.2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
