package com.carfix.service.inter;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import com.carfix.entity.User; 

@Service
public interface UserInter {
 @Select("select * from where t.id = #{id}")
 
 public User findById(long Id);
 @Select("select * from x")
 public List<User> findAll();
}
