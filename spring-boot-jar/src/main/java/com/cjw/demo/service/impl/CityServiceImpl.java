package com.cjw.demo.service.impl;

import com.cjw.demo.dao.CityDao;
import com.cjw.demo.domain.City;
import com.cjw.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 828471 on 2017/7/21.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private CityDao cityDao;

    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityDao.deleteCity(id);
    }


    private Map<String, City> cityMap = new HashMap<String, City>();


    @Cacheable(value = "baseCityInfo")
    public City getCityByName(String cityName) {
        // 模拟数据库查询并返回
        return cityMap.get(cityName);
    }

    @CachePut(value = "baseCityInfo")
    public void updateCityDescription(String cityName, String description) {
        City city = cityMap.get(cityName);
        city.setDescription(description);
        // 模拟更新数据库
        cityMap.put(cityName, city);
    }

}