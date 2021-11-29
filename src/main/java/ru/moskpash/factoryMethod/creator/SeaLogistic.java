package ru.moskpash.factoryMethod.creator;

import ru.moskpash.factoryMethod.product.Ship;
import ru.moskpash.factoryMethod.product.Transport;

public class SeaLogistic extends AbstractLogistics {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
