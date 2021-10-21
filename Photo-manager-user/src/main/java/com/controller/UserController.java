package com.controller;

import com.domain.User;
import com.service.UserService;
import com.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-10-18 22:28
 **/
@RestController

public class UserController {

    @Autowired
     UserService userService;

    @RequestMapping("/user/login")
    public JsonUtil<String> login(User user){
        int i = userService.login(user);
        JsonUtil<String> jsonUtil=new JsonUtil<>();
        if (i==1){
            jsonUtil.setCode(1002);
            jsonUtil.setMessage("用户名不存在");
//            System.out.println(jsonUtil);
            return jsonUtil;
        }

        if (i==2){
            jsonUtil.setCode(1002);
            jsonUtil.setMessage("密码错误");
//            System.out.println(jsonUtil);
            return jsonUtil;
        }

        jsonUtil.setCode(1001);
        jsonUtil.setMessage("登录成功");
        jsonUtil.setData(user.getUsername());
//        System.out.println(jsonUtil);
        return jsonUtil;
    }
}
