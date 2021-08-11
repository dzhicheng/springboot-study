package com.dongzhic.controller;

import com.dongzhic.bean.ConsultConfigArea;
import com.dongzhic.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * @Author dongzhic
 * @Date 2021/7/27 14:57
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private AreaService areaService;

    @RequestMapping("/hello")
    @ResponseBody
    public String test () {
        return "hello!";
    }

    @RequestMapping("/queryArea")
    @ResponseBody
    public String queryArea(String param) {
        List<ConsultConfigArea> areas = areaService.qryArea(new HashMap());
        for (ConsultConfigArea area : areas) {
            logger.info(area.getAreaCode() + "   " + area.getAreaName() + "   "
                    + area.getState());
        }
        return "OK";
    }
}
