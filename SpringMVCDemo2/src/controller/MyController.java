package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller   //声明这个类是一个controller
@RequestMapping("/welcome")   //说明这个类所处理的请求
public class MyController {
    @RequestMapping(method = RequestMethod.GET)    //声明请求的方法

    public String print(ModelMap model){
        model.addAttribute("message","Hello,Spring World!") ;
        return "hello" ;   //返回的是一个视图名
    }
}
