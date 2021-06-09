package nianyang.mny.controller;

import nianyang.mny.entity.UserDO;
import nianyang.mny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sikou
 * @date 2021/01/17
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value="/getUserById",method = RequestMethod.GET)
    public UserDO getUserById(@RequestParam Long id){
        return userService.getUserById(id);
    }

    @ResponseBody
    @RequestMapping(value="/getUser",method = RequestMethod.GET)
    public UserDO getUser(){
        return userService.getUserById(1L);
    }

    @GetMapping(value = "/getUser2")
    public UserDO getUser2(){
        return userService.getUserById(1L);
    }

    @RequestMapping("/index")
    public String index() {
        return "helloworld!";
    }

    @RequestMapping("/index2")
    public String index2() {
        return "helloworld2!";
    }
}
