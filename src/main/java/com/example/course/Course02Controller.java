package com.example.course;

import com.example.course.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Spring Boot返回JSON数据及数据封装
@RestController
@RequestMapping("/json")
public class Course02Controller {


    /**
    * http://localhost:8080/json/user
    * {"id":1,"username":"香蕉","password":"123456"}
    * */
    @RequestMapping("/user")
    public User getUser() {
        return new User((long) 1, "香蕉", "123456");

    }

    /**
    * http://localhost:8080/json/list
    * [{"id":1,"username":"香蕉","password":"123456"},{"id":2,"username":"橘子","password":"123456"}]
    * */
    @RequestMapping("/list")
    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User((long) 1, "香蕉", "123456");
        User user2 = new User((long) 2, "橘子", "123456");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }
    /**
     * localhost:8080/json/map
     *{"水果信息":{"id":1,"username":"香蕉","password":"123456"},"水果颜色":"黄色",
     * "水果价格":"100RMB/kg","水果库存":4396}
     *
    * */
    @RequestMapping("/map")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User((long)1, "香蕉", "123456");
        map.put("水果信息", user);
        map.put("水果颜色", "黄色");
        map.put("水果价格", "100RMB/kg");
        map.put("水果库存", 4396);
        return map;
    }
    /**
     * localhost:8080/json/map2
    * {"水果信息":{"id":1,"username":"香蕉","password":"123456"},"水果颜色":"","水果价格":"","水果库存":4396}
    * */
    @RequestMapping("/map2")
    public Map<String, Object> getMap2() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User((long)1, "香蕉", "123456");
        map.put("水果信息", user);
        map.put("水果颜色", null);
        map.put("水果价格", null);
        map.put("水果库存", 4396);
        return map;
    }

    /**
    * http://localhost:8080/json/list2
    *{"code":"0","data":[{"id":1,"password":"123456","username":"香蕉"},
    * {"id":2,"password":"123456","username":"橘子"}],"msg":"获取用户列表成功"}
    * */
    @RequestMapping("/list2")
    public JsonResult<List> getUserList2() {
        List<User> userList = new ArrayList<>();
        User user1 = new User((long) 1, "香蕉", "123456");
        User user2 = new User((long) 2, "橘子", "123456");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList, "获取用户列表成功");
    }
}
