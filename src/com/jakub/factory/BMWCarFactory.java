package com.jakub.factory;


public class BMWCarFactory implements CarFactory {

    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("X5")) {
            Engine bMWEngine = new Engine(200, 3000, "diesel");
            Wheels bMWWheels = new Wheels(18, "summer");
            car = new Audi("X5", bMWEngine, bMWWheels);
        } else if (model.equals("M3")) {
            Engine bMWEngine = new Engine(200, 3000, "diesel");
            Wheels bMWWheels = new Wheels(18, "summer");
            car = new Audi("M3", bMWEngine, bMWWheels);
        } else if (model.equals("X3")) {
            Engine bMWEngine = new Engine(200, 3000, "diesel");
            Wheels bMWWheels = new Wheels(18, "summer");
            car = new Audi("X3", bMWEngine, bMWWheels);
        }
        return car;
    }
}
