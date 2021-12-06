package ru.moskpash.singleton;

public class MainProcess {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.sameWith(singleton2);
    }
}
