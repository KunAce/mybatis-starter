package OrmBook;

import java.util.List;

public interface SysUserMapper {
    SysUser getUserById(Integer id);

    List<Role> getRolesByUid(Integer id);

    SysUser getUserById2(Integer id);
}
