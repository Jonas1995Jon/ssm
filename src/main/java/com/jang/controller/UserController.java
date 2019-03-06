package com.jang.controller;

import com.jang.domain.User;
import com.jang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Desc：
 * Author Jonas
 * 2019/2/19 14:46
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("userList")
    public ModelAndView userList() {
        ModelAndView mv = new ModelAndView();
        List<User> users = userService.getUser();
        mv.setViewName("user");
        mv.addObject("users", users);
        return mv;
    }

    @RequestMapping("getUserById")
    public ModelAndView getUserById(Long id) {
        ModelAndView mv = new ModelAndView();
        User user = userService.getUserById(id);
        mv.setViewName("user");
        mv.addObject("user", user);
        return mv;
    }

}
