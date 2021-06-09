package nianyang.mny.controller;

import java.util.List;

import nianyang.mny.dao.UserDAOEs;
import nianyang.mny.entity.UserDO;
import nianyang.mny.entity.UserDOEs;
import nianyang.mny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ElasticSearch查询
 * @author sikou
 * @date 2021/01/30
 */
@RestController
@RequestMapping("/userES")
public class UserESController {

    @Autowired
    UserService userService;

    @Autowired
    UserDAOEs userDAOEs;

    @GetMapping("/getUserById/id={id}")
    @ResponseBody
    public UserDO getUserById(@PathVariable long id){
        UserDO userDO=userService.getUserById(id);
        return userDO;
    }

    @ResponseBody
    @GetMapping("/search/name={name}")
    public List<UserDOEs> search(@PathVariable String name){
        List<UserDOEs> userDOEsList= userDAOEs.getByUserName(name);
        return userDOEsList;

    }

}
