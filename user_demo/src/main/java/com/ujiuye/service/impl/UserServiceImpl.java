package com.ujiuye.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ujiuye.mapper.UserMapper;
import com.ujiuye.pojo.User;
import com.ujiuye.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
