package com.jang.service.impl;

import com.jang.domain.User;
import com.jang.repository.UserRepository;
import com.jang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc：
 * Author Jonas
 * 2019/2/19 14:36
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser() {
        return userRepository.getUser();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }
}
