package orm;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDao {
    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getInstance();

    public User GetUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = (User) sqlSession.selectOne("mymapper.getUserById",id);
        sqlSession.close();
        return user;
    }

    public Integer addUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int insert = sqlSession.insert("mymapper.addUser", user);
        sqlSession.commit();
        sqlSession.close();
        return insert;
    }

    public Integer addUser2(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int insert = sqlSession.insert("mymapper.addUser2", user);
        sqlSession.commit();
        sqlSession.close();
        return insert;
    }

    public Integer deleteUserById(String id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int delete = sqlSession.delete("mymapper.deleteUserById",id);
        sqlSession.commit();
        sqlSession.close();
        return delete;
    }

    public Integer updateUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int update = sqlSession.update("mymapper.updateUser", user);
        sqlSession.commit();
        sqlSession.close();
        return update;
    }

    public List<User> getAllUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users  = sqlSession.selectList("mymapper.getAllUser");
        sqlSession.close();
        return users;
    }
}
