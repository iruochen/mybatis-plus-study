package com.ruochen.mp.simple.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruochen.mp.simple.pojo.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> findAll();
}
