package com.bai.filebeat.controller;

import com.bai.filebeat.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "index")
public class InedxController extends BaseController{
    @Autowired
    private IndexService indexService;

    @GetMapping(value = "")
    public String index(ModelMap model){
        for(int i=0;i<10000;i++){
            if(logger.isDebugEnabled()){
                logger.debug("InedxController-->index 调用首页方法");
            }
        }

        logger.info("InedxController-->index 调用首页方法");
        model.addAttribute("body","这个是小小的界面,测试日志信息");
        return indexService.index();
    }
}
