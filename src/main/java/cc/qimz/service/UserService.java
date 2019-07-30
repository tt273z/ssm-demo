package cc.qimz.service;

import cc.qimz.pojo.User;

import java.util.List;

public interface UserService {
    /**
    * 查询全部用户
    * @return List<User>
    */
    List<User> selectAll();

    /**
     * 修改用户
     * @param user
     * @return Integer
     */
    int update(User user);
}
