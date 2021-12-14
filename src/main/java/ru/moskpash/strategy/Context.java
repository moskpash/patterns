package ru.moskpash.strategy;

import ru.moskpash.strategy.strategies.NavigatorStrategy;

public class Context {
    private NavigatorStrategy strategy;

    public void setStrategy(NavigatorStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate() {
        if (strategy != null)
            System.out.println(strategy.execute() + " построен.");
    }
}
