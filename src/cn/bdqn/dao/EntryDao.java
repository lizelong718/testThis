package cn.bdqn.dao;
import cn.bdqn.pojo.entry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 泽先生
 * @package cn.bdqn.dao
 * @description TODO
 */

public interface EntryDao {

    //查询所有
    public List<entry> select();

    //分类查询
    public List<entry> classFen(@Param("name") String name);

    //删除
    public int delete(@Param("id") Integer id);

}
