package io.sunc.ss.examples.quickstart.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by suncheng on 2015/6/13.
 */
@Controller
public class IndexController{
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "index";
    }
}
