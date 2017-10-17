package com.cjw.demo.springboot.dubbo;

import com.cjw.demo.springboot.domain.City;

/**
 * Created by 828471 on 2017/10/10.
 */
public interface CityDubboService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
