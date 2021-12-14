package ru.moskpash.strategy.strategies;

public class WalkNavigatorStrategy implements NavigatorStrategy {
    @Override
    public String execute() {
        return "Пеший маршрут";
    }
}
