package cc.qimz.mapper;

import cc.qimz.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> select(@Param("id") int id, @Param("username") String username);

    int update(User user);

    int insert(User user);

    int deleteByIds(List<Integer> ids);
}
