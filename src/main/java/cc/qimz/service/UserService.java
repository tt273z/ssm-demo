package cc.qimz.service;

import cc.qimz.pojo.Result;
import cc.qimz.pojo.User;

import java.util.List;

public interface UserService {
    /**
    * 查询全部用户
    * @return List<User>
    */
    Result selectAll();

    /**
     * 修改用户
     * @param user
     * @return Integer
     */
    Result update(User user);
}
