package com.example.demo.service.Impl;

import com.example.demo.Dao.Impl.UserDaoImpl;
import com.example.demo.Dao.UserDao;
import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HP
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Result list(){
        List<User> users = userDao.listAll();

        for (User user : users) {
            if ("REVERTED".equalsIgnoreCase(user.getStatus())){
                user.setStatus("回滚成功");
            } else if ("MIGRATING".equalsIgnoreCase(user.getStatus())){
                user.setStatus("迁移中");
            }
        }
        return new Result(true, users);
    }

}
