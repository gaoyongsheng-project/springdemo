package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;
//https://www.cnblogs.com/wjw1014/p/11386401.html
//@Repository  //option+return 自动导包
//@Mapper
@Repository
public interface UserMapper {
    User getUserInfo(@Param("name") String name);
}
