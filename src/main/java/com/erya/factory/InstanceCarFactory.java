package com.erya.factory;

import com.erya.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {

    private Map<Long, Car> carMap;

    public InstanceCarFactory(){

        carMap = new HashMap<Long, Car>();
        carMap.put(1L,new Car(1L,"宝马"));
        carMap.put(1L,new Car(1L,"奔驰"));

    }

    public Car getCar(Long id){
        return carMap.get(id);
    }
}
