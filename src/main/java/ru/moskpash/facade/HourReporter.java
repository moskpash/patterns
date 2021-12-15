package ru.moskpash.facade;

import java.util.Random;

public class HourReporter {
    void reportHours() {
        System.out.println("Часы добавлены в базу");
    }

    Double getHours() {
        System.out.println("Часы загружены из базы");
        return new Random().nextDouble() * 40.0;
    }
}
