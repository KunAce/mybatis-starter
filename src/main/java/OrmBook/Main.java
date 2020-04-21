package OrmBook;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
//        SqlSession sqlSession = factory.openSession();
//        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
//        Book book = mapper.getBookById(1);
//        System.out.println(book);
//        sqlSession.close();

//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
//        SqlSession sqlSession = factory.openSession();
//        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
//        SysUser sysUser = mapper.getUserById(1);
//        System.out.println(sysUser);
//        sqlSession.close();

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = factory.openSession();
        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        SysUser sysUser = mapper.getUserById2(1);
        List<Role> roles = mapper.getRolesByUid(1);
        System.out.println(roles);
        System.out.println(sysUser);
        sqlSession.close();
    }
}
