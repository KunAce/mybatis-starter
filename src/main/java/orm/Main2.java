package orm;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
//        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
//        SqlSession sqlSession = instance.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> allUser = mapper.getAllUser();
//        System.out.println(allUser);

//        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
//        SqlSession sqlSession = instance.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = new User();
//        user.setUsername("cppuser");
//        user.setAddress("cpp.org");
//        List<String> favorites = new ArrayList<String>();
//        favorites.add("Soccer");
//        favorites.add("Basketball");
//        favorites.add("Pingpong");
//        user.setFavorites(favorites);;
//        mapper.addUser3(user);
//        sqlSession.commit();


//        Use $ for dynamic field on query by order
//          SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
//          SqlSession sqlSession = instance.openSession();
//          UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//          List<User> allUser = mapper.getAllUserByOrder("id");
//          System.out.println(allUser);

        //update username by id
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int update = mapper.updateUsernameById("changedName","07009cc0-808c-11ea-aa50-000c297bf035");
        sqlSession.commit();
        System.out.println(update);

        // Using resultMap in mapper file
//        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
//        SqlSession sqlSession = instance.openSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        User user = mapper.getUserByIdMap("2");
//        System.out.println(user);
    }
}
