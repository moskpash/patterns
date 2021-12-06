package ru.moskpash.decorator;

import ru.moskpash.decorator.component.Component;
import ru.moskpash.decorator.component.ConcreteComponent;
import ru.moskpash.decorator.decoration.FirstDecorator;
import ru.moskpash.decorator.decoration.SecondDecorator;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        System.out.println("Какие оболочки вывести:");
        Scanner scan = new Scanner(System.in);
        boolean f = scan.nextBoolean();
        boolean s = scan.nextBoolean();

        if (f) {
            component = new FirstDecorator(component);
        }
        if (s) {
            component = new SecondDecorator(component);
        }

        System.out.println(component.execute());
    }
}
