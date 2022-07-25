package com.ycj.user.mapper;

import com.ycj.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User queryById(Long userId);
}
