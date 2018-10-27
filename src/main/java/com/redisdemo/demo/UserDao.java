package com.redisdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by lvxin
 */

//@repository用来标注数据访问组件，即Dao组件
@Repository
public class UserDao {

    //spring boot 已经配置RedisTemplate，StringRedisTemplate ，在此可以直接注入
    @Autowired
    StringRedisTemplate stringRedisTemplate;

//    @Resource(name = "stringRedisTemplate")
//    ValueOperations<String,String> valOpsStr;

    @Autowired
    RedisTemplate redisTemplate;

//    @Resource(name ="redisTemplate")
//    ValueOperations<Object,Object>  valOps;

    //通过set方法，储存字符串类型
    public void setStringRedisTemplateDemo(){
        stringRedisTemplate.opsForValue().set("xx","yy");
    }

    //通过set方法，存储对象类型
    public void save(User user){
        redisTemplate.opsForValue().set(user.getUsername(),user);
    }
    //查找一个String
    public String getStr(){
        return stringRedisTemplate.opsForValue().get("aaa");
    }
    //查找一个User
    public void deleteUser(){
        redisTemplate.delete("蝙蝠侠");
    }
    //修改一个User
    public void modifyUser(User user){
        redisTemplate.opsForValue().set(user.getUsername(),user);
    }
}

