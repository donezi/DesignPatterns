package com.jakub.factory;


public class MercedesCarFactory implements CarFactory {
    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("S600")) {
            Engine bMWEngine = new Engine(200, 3000, "diesel");
            Wheels bMWWheels = new Wheels(18, "summer");
            car = new Mercedes("S600", bMWEngine, bMWWheels);
        } else if (model.equals("C3")) {
            Engine bMWEngine = new Engine(200, 3000, "diesel");
            Wheels bMWWheels = new Wheels(18, "summer");
            car = new Mercedes("C3", bMWEngine, bMWWheels);
        } else if (model.equals("A1")) {
            Engine bMWEngine = new Engine(200, 3000, "diesel");
            Wheels bMWWheels = new Wheels(18, "summer");
            car = new Mercedes("A1", bMWEngine, bMWWheels);
        }
        return car;
    }
}
