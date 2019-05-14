package cn.fcwr.aw.controller;

import cn.fcwr.aw.bean.Roles;
import cn.fcwr.aw.bean.User;
import cn.fcwr.aw.repository.RolesRepository;
import cn.fcwr.aw.service.RolesService;
import cn.fcwr.aw.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {

    @Resource
    UserService userService;

    @Resource
    RolesService rolesService;

    @RequestMapping("index")
    public String text1(){
        return "index";
    }

    @RequestMapping("test/{name}")
    @ResponseBody
    public List<Roles> findByName(@PathVariable String name){
        return rolesService.findByName(name);
    }

    @RequestMapping("tests/{name}")
    @ResponseBody
    public List<User> findByName2(@PathVariable String name){
        return userService.findByName(name);
    }

}
