package ru.moskpash.builder.builders;

import ru.moskpash.builder.cars.CarType;
import ru.moskpash.builder.components.Engine;
import ru.moskpash.builder.components.GPSNavigator;
import ru.moskpash.builder.components.Transmission;
import ru.moskpash.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
