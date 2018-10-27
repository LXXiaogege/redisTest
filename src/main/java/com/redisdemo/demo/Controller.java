package com.redisdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lvxin
 */
@RestController
public class Controller {

    @Autowired
    UserDao userDao;

    @Autowired
    RedisTemplate redisTemplate;

    //添加一个User
    @PostMapping(value = "/addUser")
    public void addUser(){
        User user=new User("addtest",20,"4");
        userDao.save(user);
    }
    //查找一个string
    @GetMapping(value = "/getStr")
    public String getStr(){
        return userDao.getStr();
    }
    //删除一个User
    @DeleteMapping(value = "/deleteUser")
    public void getUser(){
        userDao.deleteUser();
    }

    @PutMapping("/modifyUser")
    public void modifyUser(){
        User user =new User("超人",22,"10");
        userDao.modifyUser(user);
    }
    }
