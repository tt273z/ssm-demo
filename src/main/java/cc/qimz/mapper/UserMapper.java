package cc.qimz.mapper;

import cc.qimz.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    int update(User user);

    int insert(User user);

    int deleteByIds(List<Integer> ids);
}
