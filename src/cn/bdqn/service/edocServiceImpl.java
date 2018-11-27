package cn.bdqn.service;
import cn.bdqn.dao.EntryDao;
import cn.bdqn.pojo.entry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 泽先生
 * @package cn.bdqn.service
 * @description TODO
 */
@Service
public class edocServiceImpl implements edocService {

    @Resource
    private EntryDao entryDao;

    @Override
    public List<entry> select() {
        return entryDao.select();
    }

    @Override
    public List<entry> classFen(String name) {
        return entryDao.classFen(name);
    }

    @Override
    public int delete(int id) {
            int result=0;
            try {
                if(entryDao.delete(id)>0){
                    result=1;
                }
            }catch (Exception e){
                e.printStackTrace();
                result=0;
            }
            return result;
        }
    }

