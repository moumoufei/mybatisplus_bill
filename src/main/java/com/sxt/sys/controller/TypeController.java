package com.sxt.sys.controller;


import com.sxt.sys.domain.Type;
import com.sxt.sys.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 某某飞
 * @since 2019-04-25
 */
@RestController
@RequestMapping("/sys/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @RequestMapping("loadAllType")
    public List<Type> loadAllType(Type type){
        return this.typeService.list();
    }


}

