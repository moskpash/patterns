package ru.moskpash.builder;

import ru.moskpash.builder.builders.CarBuilder;
import ru.moskpash.builder.builders.CarManualBuilder;
import ru.moskpash.builder.cars.Car;
import ru.moskpash.builder.cars.Manual;
import ru.moskpash.builder.director.Director;

import java.util.Scanner;

public class MainProcess {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        Scanner scan = new Scanner(System.in);
        boolean flg = true;

        while (flg) {
            System.out.println("Выберите тип автомобиля:\n1)SPORTS_CAR\n2)CITY_CAR\n3)SUV\n\n0)Завершить");
            int type = scan.nextInt();
            switch (type) {
                case (1) -> {
                    director.constructSportsCar(builder);
                    director.constructSportsCar(manualBuilder);
                }
                case (2) -> {
                    director.constructCityCar(builder);
                    director.constructCityCar(manualBuilder);
                }
                case (3) -> {
                    director.constructSUV(builder);
                    director.constructSUV(manualBuilder);
                }
                default -> flg = false;
            }
            if (flg) {
                // Директор получает объект конкретного строителя от клиента
                // (приложения). Приложение само знает какой строитель использовать,
                // чтобы получить нужный продукт.
                // Готовый продукт возвращает строитель, так как Директор чаще всего не
                // знает и не зависит от конкретных классов строителей и продуктов.
                Car car = builder.getResult();
                System.out.println("Car built:\n" + car.getCarType());
                // Директор может знать больше одного рецепта строительства.
                Manual carManual = manualBuilder.getResult();
                System.out.println("\nCar manual built:\n" + carManual.print());
            }
        }
    }
}
