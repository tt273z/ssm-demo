package cc.qimz.service.impl;

import cc.qimz.mapper.UserMapper;
import cc.qimz.pojo.User;
import cc.qimz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    //注入mapper
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectAll() {
        return userMapper.select();
    }
}
