package com.sky.mapper;

import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    //sql 简单则使用注解 复杂使用xml
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

}
