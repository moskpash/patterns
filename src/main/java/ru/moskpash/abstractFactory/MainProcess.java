package ru.moskpash.abstractFactory;

import ru.moskpash.abstractFactory.elements.Button;
import ru.moskpash.abstractFactory.elements.Checkbox;
import ru.moskpash.abstractFactory.factories.AbstractFactory;
import ru.moskpash.abstractFactory.factories.MacFactory;
import ru.moskpash.abstractFactory.factories.WindowsFactory;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flg = true;
        while (flg) {
            System.out.println("Выберите операционную систему:\n1)Windows\n2)Macintosh\n\n0)Завершить");
            int type = scan.nextInt();
            AbstractFactory factory = null;
            switch (type) {
                case (0) -> flg = false;
                case (1) -> factory = new WindowsFactory();
                case (2) -> factory = new MacFactory();
            }

            if (factory != null) {
                Button button = factory.createButton();
                Checkbox checkbox = factory.createCheckbox();
                System.out.println(button.printButton());
                System.out.println(checkbox.printCheckbox());
            }
        }
    }
}
