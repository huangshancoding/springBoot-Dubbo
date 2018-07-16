package com.test.provider2.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.text.api.entity.Food;
import com.text.api.service.FoodService;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0.0",interfaceClass = FoodService.class)
public class FoodPrroviderImpl implements FoodService {

    @Override
    public Food getFood() {
        System.out.println("提供食物咯!");
        Food food = new Food();
        food.setName("臭鳜鱼");
        food.setPrice(35.00);
        return food;
    }
}
