package com.sxt.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:moumoufei
 * @Date:2019/4/20 21:50
 */
@Controller
@RequestMapping("login")
public class SysController {

    //跳转
    @RequestMapping("toLogin")
    public String toBillManager(){
        return "billRightManager";
    }
}
