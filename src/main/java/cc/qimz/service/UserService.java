package cc.qimz.service;

import cc.qimz.pojo.Result;
import cc.qimz.pojo.User;

import java.util.List;

public interface UserService {
    /**
    * 查询全部用户
    * @return List<User>
    */
    Result select(Integer id, String username);

    /**
     * 修改用户
     * @param user
     * @return Result
     */
    Result update(User user);

    /**
     * 添加用户
     * @param user
     * @return Result
     */
    Result insert(User user);

    /**
     *
     * @param ids
     * @return Result
     */
    Result deleteByIds(List<Integer> ids);
}
