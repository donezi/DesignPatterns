package com.jakub.factory;

/**
 * Created by Jakub on 02.06.2017.
 */
public class Application {
    public static void main(String[] args) {

        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        Car car = abstractCarFactory.buildAudiCar("a3");
        Car car2 = abstractCarFactory.buildBMWCar("x5");
        Car car3 = abstractCarFactory.buildMercedesCar("cls-500");

//        Engine audiEngine = new Engine(200, 3000, "diesel");
//        Wheels audiWheels = new Wheels(18, "summer");
//        Audi audi = new Audi("S3", audiEngine, audiWheels);
//
//        audi.drive();
//
//        Engine mercedesEngine = new Engine(300, 3000, "gas");
//        Wheels mercedesWheels = new Wheels(17, "winter");
//        Mercedes mercedes = new Mercedes("S600", mercedesEngine, mercedesWheels);
//
//        mercedes.drive();
//
//        Engine bMWEngine = new Engine(300, 3000, "gas");
//        Wheels bMWWheels = new Wheels(17, "winter");
//        BMW bMW = new BMW("X5", bMWEngine, bMWWheels);
//
//        mercedes.drive();

//        AudiCarFactory audiCarFactory = new AudiCarFactory();
//        Car car = audiCarFactory.buildCar("a3");

    }
}
