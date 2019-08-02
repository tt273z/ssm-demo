package cc.qimz.service.impl;

import cc.qimz.enums.ResultEnum;
import cc.qimz.mapper.UserMapper;
import cc.qimz.pojo.Result;
import cc.qimz.pojo.User;
import cc.qimz.service.UserService;
import cc.qimz.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    //注入mapper
    @Autowired
    private UserMapper userMapper;


    @Override
    public Result selectAll() {
        return ResultUtil.success(userMapper.selectAll());
    }

    @Override
    public Result update(User user) {
        Integer i = userMapper.update(user);
        if(i==0){
            return ResultUtil.error(ResultEnum.UPDATE_ERROR);
        }
        return ResultUtil.success(ResultEnum.SUCCESS);
    }

    @Override
    public Result insert(User user) {
        Integer i = userMapper.insert(user);
        if(i==0){
            return ResultUtil.error(ResultEnum.ADD_ERROR);
        }
        return ResultUtil.success(ResultEnum.SUCCESS);
    }

    @Override
    public Result deleteByIds(List<Integer> ids) {
        Integer i = userMapper.deleteByIds(ids);
        if(i==0){
            return ResultUtil.error(ResultEnum.DELETE_ERROR);
        }
        return ResultUtil.success(ResultEnum.SUCCESS);
    }
}
