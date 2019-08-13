package cc.qimz.controller;

import cc.qimz.pojo.Result;
import cc.qimz.pojo.User;
import cc.qimz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    //注入Userservice
    @Autowired
    private UserService userService;

    @RequestMapping("/select")
    public Result select(Integer id, String username){
        return userService.select(id, username);
    }

    @RequestMapping("/update")
    public Result update(@RequestBody User u){
        return userService.update(u);
    }

    @RequestMapping("/insert")
    public Result insert(@RequestBody User u){
        return userService.insert(u);
    }

    @RequestMapping("/deleteByIds")
    public Result delete(String ids){
        List<Integer> idList = new ArrayList<>();
        for(String id :ids.split(",")){
            idList.add(Integer.parseInt(id));
        }
        return userService.deleteByIds(idList);
    }


}
