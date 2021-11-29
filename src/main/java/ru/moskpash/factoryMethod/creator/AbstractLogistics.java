package ru.moskpash.factoryMethod.creator;

import ru.moskpash.factoryMethod.product.Transport;

/**
 * Создатель объявляет фабричный метод, который должен возвращать новые объекты продуктов.
 * Важно, чтобы тип результата совпадал с общим интерфейсом продуктов.
 * <p>
 * Зачастую фабричный метод объявляют абстрактным, чтобы заставить все подклассы реализовать его по-своему.
 * Но он может возвращать и некий стандартный продукт.
 * <p>
 * Несмотря на название, важно понимать, что создание продуктов не является единственной функцией создателя.
 * Обычно он содержит и другой полезный код работы с продуктом.
 */
public abstract class AbstractLogistics {

    public void planDelivery() {
        System.out.println("Готовим транспорт...");
        Transport transport = createTransport();
        System.out.println("Отправляем...");
        transport.deliver();
        System.out.println("Отправлено.");
    }

    protected abstract Transport createTransport();
}
