package orm;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User getUserById(String id);

    Integer addUser(User user);

    Integer addUser2(User user);

    Integer addUser3(User user);

    Integer deleteUserById(String id);

    Integer updateUser(User user);

    List<User> getAllUser();

    List<User> getAllUserByOrder(String orderBy);

    Integer updateUsernameById(@Param("username") String username,@Param("id") String id);

    Integer addUser4(@Param("user") User user);

    User getUserByIdMap(String id);

}

