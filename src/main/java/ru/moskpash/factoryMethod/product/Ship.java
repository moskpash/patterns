package ru.moskpash.factoryMethod.product;

/**
 * Конкретные продукты содержат код различных продуктов.
 * Продукты будут отличаться реализацией, но интерфейс у них будет общий.
 */
public class Ship implements Transport {
    static {
        System.out.println("Загружаем судно");
    }

    @Override
    public void deliver() {
        System.out.println("Отправили морем");
    }
}
