package ru.moskpash.builder.director;

import ru.moskpash.builder.builders.Builder;
import ru.moskpash.builder.cars.CarType;
import ru.moskpash.builder.components.Engine;
import ru.moskpash.builder.components.GPSNavigator;
import ru.moskpash.builder.components.Transmission;
import ru.moskpash.builder.components.TripComputer;

/**
 * Директор знает в какой последовательности заставлять работать строителя.
 * Он работает с ним через общий интерфейс Строителя.
 * По этому, он может не знать какой конкретно продукт сейчас строится.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
