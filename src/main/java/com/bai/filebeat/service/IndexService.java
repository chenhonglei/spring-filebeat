package com.bai.filebeat.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService extends BaseService {

    public String index(){

        logger.info("IndexService-->index 进入了这个方法，记录一下");
        return "index";
    }
}
