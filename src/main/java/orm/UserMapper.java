package orm;

import java.util.List;

public interface UserMapper {
    User getUserById(String id);

    Integer addUser(User user);

    Integer addUser2(User user);

    Integer deleteUserById(String id);

    Integer updateUser(User user);

    List<User> getAllUser();

}

