package com.jang.service;

import com.jang.domain.User;

import java.util.List;

/**
 * Desc：
 * Author Jonas
 * 2019/2/19 14:35
 */
public interface UserService {

    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getUser();

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    User getUserById(Long id);

}
