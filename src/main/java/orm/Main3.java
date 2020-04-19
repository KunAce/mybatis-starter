package orm;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
//        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
//        SqlSession sqlSession = instance.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> list = mapper.getUserByPage(null,null);
//        System.out.println(list);
//        list = mapper.getUserByPage(2,2);
//        System.out.println(list);
//        sqlSession.close();


        // Where Clause
//        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
//        SqlSession sqlSession = instance.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> list = mapper.getUserByUsernameAndId("2","cppuser");
//        System.out.println(list);
//        list = mapper.getUserByUsernameAndId("5",null);
//        System.out.println(list);
//        list = mapper.getUserByUsernameAndId(null,null);
//        System.out.println(list);
//        sqlSession.close();

        // Using array of parameter values in query
//        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
//        SqlSession sqlSession = instance.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        String[] ids = {"3","7"};
//        List<User> list = mapper.getUserByIds(ids);
//        System.out.println(list);

        // Batch Insert
//        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
//        SqlSession sqlSession = instance.openSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = new ArrayList<>();
//        User u1 = new User();
//        u1.setId("10");
//        u1.setUsername("AnotherUser1");
//        u1.setAddress("AnotherAddress1");
//        users.add(u1);
//        User u2 = new User();
//        u2.setId("11");
//        u2.setUsername("AnotherUser2");
//        u2.setAddress("AnotherAddress2");
//        users.add(u2);
//        userMapper.batchInsertUser(users);
//        sqlSession.commit();
//        sqlSession.close();

        // Update based on the provided parameters
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User updUser = new User();
        updUser.setId("3");
        updUser.setFavorites(new ArrayList<>(Arrays.asList("swimming","rock climbing")));
        int update = mapper.updateUser(updUser);
        System.out.print(update);
        sqlSession.commit();
        sqlSession.close();

    }
}
