package ru.moskpash.singleton;

public class Singleton {
    static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            //тут должна быть синхронизация при многопоточном выполнении
            instance = new Singleton();
        }
        return instance;
    }

    public void sameWith(Singleton singleton) {
        if (this == singleton) {
            System.out.println("Same object");
        } else {
            System.out.println("Different objects");
        }
    }
}
