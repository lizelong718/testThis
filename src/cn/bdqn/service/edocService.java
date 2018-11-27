package cn.bdqn.service;

import cn.bdqn.pojo.entry;

import java.util.List;

/**
 * @author 泽先生
 * @package cn.bdqn.service
 * @description TODO
 */
public interface edocService {

    //查询所有
    public List<entry> select();

    //分类查询
    public List<entry> classFen(String name);

    //删除
    public int delete(int id);
}
