package helloWorldTest;

import java.util.Optional;
import java.util.function.Supplier;

public class HelloWorld {
    public static void main(String[] args) {
        Optional<Integer> op = Optional.ofNullable(null);
        System.out.println(op.orElse(2));
        System.out.println(op.isPresent());
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

    public static Integer getCarCount(Supplier<Integer> carCount) {
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