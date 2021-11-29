package ru.moskpash.factoryMethod;

import ru.moskpash.factoryMethod.creator.AbstractLogistics;
import ru.moskpash.factoryMethod.creator.RoadLogistics;
import ru.moskpash.factoryMethod.creator.SeaLogistic;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flg = true;
        while (flg) {
            System.out.println("\nГотовы к новому отправлению!\n");
            System.out.println("Выберите тип отправления:\n1)Сушей\n2)Морем\n\n0)Завершить");
            int type = scan.nextInt();
            AbstractLogistics logistics = null;
            switch (type) {
                case (0) -> flg = false;
                case (1) -> logistics = new RoadLogistics();
                case (2) -> logistics = new SeaLogistic();
            }

            if (logistics != null) {
                logistics.planDelivery();
            }
        }
    }
}
