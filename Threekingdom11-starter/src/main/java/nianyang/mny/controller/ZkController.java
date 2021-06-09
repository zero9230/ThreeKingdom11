package nianyang.mny.controller;

import nianyang.mny.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sikou
 * @date 2021/02/09
 */
@RestController
@RequestMapping("/zk")
public class ZkController {


    @Autowired
    private OrderService orderService;

    @GetMapping("/get")
    public String get(){
        return  "";
    }


    @GetMapping("/watch")
    public String watch(){


        return "";
    }

    @GetMapping("/makeOrderType/type={type}")
    public void makeOrderType(@PathVariable String type){
        orderService.makeOrderType(type);
    }


}
