package cc.qimz.controller;

import cc.qimz.enums.ResultEnum;
import cc.qimz.pojo.Result;
import cc.qimz.pojo.User;
import cc.qimz.service.UserService;
import cc.qimz.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    //注入Userservice
    @Autowired
    private UserService userService;

    @RequestMapping("/selectAll")
    public Result selectAll(){
        return ResultUtil.success(userService.selectAll());
    }

    @RequestMapping("/update")
    public Result update(@RequestBody User u){
        Integer i = userService.update(u);
        if(i==0){
            return ResultUtil.error(ResultEnum.UPDATE_ERROR);
        }
        return ResultUtil.success(ResultEnum.SUCCESS);
    }


}
