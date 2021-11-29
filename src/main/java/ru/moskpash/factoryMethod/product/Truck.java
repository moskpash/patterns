package ru.moskpash.factoryMethod.product;

/**
 * Конкретные продукты содержат код различных продуктов.
 * Продукты будут отличаться реализацией, но интерфейс у них будет общий.
 */
public class Truck implements Transport {
    static {
        System.out.println("Загружаем грузовик");
    }

    @Override
    public void deliver() {
        System.out.println("Отправили по суше");
    }
}
