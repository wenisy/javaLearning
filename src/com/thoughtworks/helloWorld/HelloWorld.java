package com.thoughtworks.helloWorld;

import java.util.Optional;
import java.util.function.Supplier;

public class HelloWorld {
    public static void main(String[] args) {
        //建立一个为空的数据
        Optional<Integer> op = Optional.ofNullable(null);
        //如果为空，自动赋值为2
        System.out.println(op.orElse(2));
        //判断是否为空，输出boolean值，false为空
        System.out.println(op.isPresent());
        //functional的接口可以使用 ::
        Supplier<Car> supCar = Car::new;
        Car car = supCar.get();
        car.setCount(5);
        System.out.println(Shop.getCarCount(car));
    }
}

class Shop {
    public static Integer getCarCount(Car car) {
        return car.getCount() * 2;
    }
    public static  Integer getCarCount(Supplier<Integer> carCount){
        return carCount.get() * 2;
    }
}

class Car {
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}