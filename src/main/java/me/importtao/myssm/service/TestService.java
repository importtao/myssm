package me.importtao.myssm.service;

import me.importtao.myssm.dao.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author importtao
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: TODO
 * @date ${date} ${time}
 */
@Service
public class TestService {
    @Resource
    TestMapper testMapper;

    public Object selectByPrimaryKey(Integer id){
        return testMapper.selectByPrimaryKey(id);
    }
}
