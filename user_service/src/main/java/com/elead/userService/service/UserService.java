package com.elead.userService.service;

import com.elead.userService.mapper.UserMapper;
import com.elead.userService.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zwr
 * @version 1.0
 * @date 2020/1/14 11:17
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
