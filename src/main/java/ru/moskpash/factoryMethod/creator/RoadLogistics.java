package ru.moskpash.factoryMethod.creator;

import ru.moskpash.factoryMethod.product.Transport;
import ru.moskpash.factoryMethod.product.Truck;

public class RoadLogistics extends AbstractLogistics {
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
