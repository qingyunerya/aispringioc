package com.erya.factory;

import com.erya.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

    private static Map<Long, Car> carMap;

    static {
        carMap = new HashMap<Long, Car>();
        carMap.put(1L,new Car(1L,"奔驰"));
        carMap.put(1L,new Car(1L,"宝马"));

    }

    public static Car getCar(Long id ){
        return carMap.get(id);
    }
}
