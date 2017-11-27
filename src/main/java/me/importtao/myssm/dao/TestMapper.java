package me.importtao.myssm.dao;

import me.importtao.myssm.model.Test;
import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    int deleteByPrimaryKey(@Param("id")Integer id);

    int insert(@Param("record")Test record);

    int insertSelective(@Param("record")Test record);

    Test selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(@Param("record")Test record);

    int updateByPrimaryKey(@Param("record")Test record);
}