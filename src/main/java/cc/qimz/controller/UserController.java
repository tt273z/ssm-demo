package cc.qimz.controller;

import cc.qimz.pojo.User;
import cc.qimz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //注入Userservice
    @Autowired
    private UserService userService;

    @RequestMapping("/selectAllUser")
    @ResponseBody
    public List<User> query(){
        return userService.selectAll();
    }

}
