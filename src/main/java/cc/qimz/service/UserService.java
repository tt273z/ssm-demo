package cc.qimz.service;

import cc.qimz.pojo.User;

import java.util.List;

public interface UserService {
    /**
    * 查询全部用户
    * @return List<User>
    */
    List<User> selectAll();
}
