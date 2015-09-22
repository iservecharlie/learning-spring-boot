package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by japshvincent on 9/22/2015.
 */
@Controller
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    public String testController(){
        return "Hello World";
    }
}
