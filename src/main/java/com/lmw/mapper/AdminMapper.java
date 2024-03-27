package com.lmw.mapper;


import com.lmw.beans.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper{

    @Select("select * from admin where name = #{name} and password = #{password}")
    Admin login(Admin admin);


    @Select("select * from admin")
    List<Admin> getAllAdmin();
}
