package com.mapper;

import com.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-10-18 22:10
 **/
@Repository
public interface UserMapper {
    /**
     * 通过用户名查询用户信息
     */
    User findUserByUsername(String username);
}
