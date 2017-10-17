package com.cjw.demo.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cjw.demo.springboot.domain.City;
import org.springframework.stereotype.Component;

/**
 * Created by 828471 on 2017/10/10.
 */
@Component
public class CityDubboConsumerService {
    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        String cityName="温岭";
        City city = cityDubboService.findCityByName(cityName);
        System.out.println(city.toString());
    }
}
