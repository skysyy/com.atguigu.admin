package admin.service.impl;

import admin.bean.User;
import admin.mapper.UserMapper;
import admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Autowired
    public UserMapper userMapper;
    @Override
    public String select(String a) {
        return userMapper.select(a);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public String insertToData(String username, String password) {
        return userMapper.insertToData(username,password);
    }
}
