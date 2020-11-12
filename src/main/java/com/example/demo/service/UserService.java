package com.example.demo.service;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
//ctrl+h 可以查看实现类
public interface UserService {
    public User getUserInfo(@Param("name")  String name);
}