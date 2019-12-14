package com.plugin.sqllog;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author zlf
 * @Description
 * @createTime 2019年12月14日 12:10:00
 */
@Mapper
public interface TestMapper {

    @Select("select * from cmp_info_res where id = #{id}")
    List<Object> selectAll(@Param("id") Long id);

    @Update("update cmp_info_res set info_res_name = #{name} where id = #{id}")
    int updateById(String name, Long id);
}
