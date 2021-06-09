package nianyang.mny.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sikou
 * @date 2021/02/07
 */
@RestController
@RequestMapping("/hello")
public class HelloDemo {

    @RequestMapping("/index")
    public String index() {
        return "helloworld!";
    }

}
