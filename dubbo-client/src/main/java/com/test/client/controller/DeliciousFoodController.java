package com.test.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.text.api.entity.Process;
import com.text.api.service.FoodProcess;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class DeliciousFoodController {

    @Reference(version = "1.0.0")
    FoodProcess foodProcess;

    @RequestMapping("/getDeliciousFood")
    public Process getDeliciousFood(){
        return foodProcess.foodProcess();
    }
}
