package com.jakub.factory;


public class AudiCarFactory implements CarFactory {


    @Override
    public Car buildCar(String model) {
        Car car = null;
        if (model.equals("S3")) {
            Engine audiEngine = new Engine(200, 3000, "diesel");
            Wheels audiWheels = new Wheels(18, "summer");
            car = new Audi("S3", audiEngine, audiWheels);
        } else if (model.equals("TT")) {
            Engine audiEngine = new Engine(200, 3000, "diesel");
            Wheels audiWheels = new Wheels(18, "summer");
            car = new Audi("TT", audiEngine, audiWheels);
        } else if (model.equals("A3")) {
            Engine audiEngine = new Engine(200, 3000, "diesel");
            Wheels audiWheels = new Wheels(18, "summer");
            car = new Audi("A3", audiEngine, audiWheels);
        }
        return car;
    }
}
