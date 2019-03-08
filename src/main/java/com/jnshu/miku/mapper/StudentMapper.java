package com.jnshu.miku.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.jnshu.miku.pojo.Student;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangziping
 * @since 2019-03-04
 */
public interface StudentMapper extends BaseMapper<Student> {

    Student findRule(@Param("account") String account);

}
