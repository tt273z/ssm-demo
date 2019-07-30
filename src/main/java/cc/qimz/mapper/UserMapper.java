package cc.qimz.mapper;

import cc.qimz.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    int update(User user);

    Integer insert();

    Integer delete();
}
