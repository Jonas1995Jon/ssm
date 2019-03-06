package com.jang.repository;

import com.jang.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Desc：
 * Author Jonas
 * 2019/2/19 14:33
 */
@Repository
public interface UserRepository {

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
