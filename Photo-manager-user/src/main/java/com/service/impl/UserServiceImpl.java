package com.service.impl;

import com.domain.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-10-18 22:22
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int login(User user) {
        User user1 = userMapper.findUserByUsername(user.getUsername());
        if (user1==null){
//            用户名不存在
            return 1;
        }

        if (!user.getPasswd().equals(user1.getPasswd())){
//            密码错误
            return 2;
        }
        return 3;
    }
}
