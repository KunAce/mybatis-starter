package orm;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        SqlSessionFactory instance = SqlSessionFactoryUtils.getInstance();
        SqlSession sqlSession = instance.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        System.out.println(allUser);
    }
}
