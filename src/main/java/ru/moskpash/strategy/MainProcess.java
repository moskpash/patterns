package ru.moskpash.strategy;

import ru.moskpash.strategy.strategies.CarNavigatorStrategy;
import ru.moskpash.strategy.strategies.NavigatorStrategy;
import ru.moskpash.strategy.strategies.WalkNavigatorStrategy;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        Context context = new Context();
        NavigatorStrategy strategy = null;
        Scanner scan = new Scanner(System.in);
        boolean flg = true;
        while (flg) {
            System.out.println("\nГотовы строить новый маршрут!\n");
            System.out.println("Выберите тип маршрута:\n1)Пеший\n2)Автомобильный\n\n0)Завершить");
            int type = scan.nextInt();
            switch (type) {
                case (0) -> flg = false;
                case (1) -> strategy = new WalkNavigatorStrategy();
                case (2) -> strategy = new CarNavigatorStrategy();
            }

            if (strategy != null) {
                context.setStrategy(strategy);
                context.navigate();
            }
        }
    }
}
