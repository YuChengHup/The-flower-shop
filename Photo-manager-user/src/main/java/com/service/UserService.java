package com.service;

import com.domain.User;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-10-18 22:15
 **/
public interface UserService {
    /**
     * 登录
     */
    int login(User user);
}
