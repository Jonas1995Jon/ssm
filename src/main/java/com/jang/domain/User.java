package com.jang.domain;

import java.io.Serializable;

/**
 * Desc：
 * Author Jonas
 * 2019/2/19 14:29
 */
public class User implements Serializable {

    private long id;

    private String email;

    private String username;

    private String role;

    private String mobile;

    public User() {
    }

    public User(long id, String email, String username, String role, String mobile) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.role = role;
        this.mobile = mobile;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
