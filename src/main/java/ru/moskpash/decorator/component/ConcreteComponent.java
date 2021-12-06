package ru.moskpash.decorator.component;

public class ConcreteComponent implements Component {
    @Override
    public String execute() {
        return "Главный компонент";
    }
}
