package ru.moskpash.proxy;

import java.util.Scanner;

public class MainProcess {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        Data cacheData = new ProxyData("test_10mb.jpg");
        Data origData = new OriginalData("test_10mb.jpg");
        Data data = null;
        boolean flg = true;

        while (flg) {
            System.out.println("Включить профилирование:\n1)нет\n2)да (Прокси)\n\n0)Завершить");
            int type = scan.nextInt();
            switch (type) {
                case (1) -> data = origData;
                case (2) -> data = cacheData;
                default -> flg = false;
            }
            if (data != null) {
                data.requestData();
            }
        }
    }
}
