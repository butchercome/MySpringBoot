package com.cjw.demo.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cjw.demo.springboot.domain.City;
import com.cjw.demo.springboot.dubbo.CityDubboService;

/**
 * Created by 828471 on 2017/10/11.
 */
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    public City findCityByName(String cityName) {
        return new City(1L,2L,"温岭","是我的故乡");
    }
}
