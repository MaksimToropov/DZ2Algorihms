package com.company;

public class Main {

    public static void main(String[] args) {
	// 1 задача
        int clientOS = 0;
        if (clientOS ==0) {
            System.out.println("Установите версию приложения для IOS");
        }
        int clientAndroid = 1;
        if (clientAndroid == 1) {
            System.out.println("Усиновите версию приложения для Android ");
        }
    // 2 задача
        int IOS = 0;
        int clientDeviceYaer = 2015;
        if (IOS == 0 && clientDeviceYaer >= 2014) {
            System.out.println("Установите облегченную версию для IOS");
        } else {
            System.out.println("Установите приложение для IOS  по ссылке");
        }
        int Android = 1;
        int clientDeviceYear1 = 2015;
        if (Android == 1 && clientDeviceYear1 >= 2014) {
            System.out.println("Установите облегченную версию для Android");
        } else {
            System.out.println("Установите приложение для Android по ссылке");
        }

        // Задача 3

        int year = 2021;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "год является високостным");
        } else {
            System.out.println(year + "год не является високостным");
        }
        // Задача 4

        int deliveryDistances = 21;
        int deliveryDays = 1;
        if (deliveryDistances <= 20) {
            System.out.println("Доставка займет " + deliveryDays);
        } else if (deliveryDistances >20 && deliveryDistances <60) {
            System.out.println("Доставка займет " + (deliveryDays + 1));
        } else if (deliveryDistances >=60 && deliveryDistances <100) {
            System.out.println("Доставка займет " + (deliveryDays + 2));
        } else {
            System.out.println("На такое расстояние не доставляем");

        }
        // Задача 5

        int monthNumder = 6;
        switch (monthNumder) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого днят не существует");
        }

    }
}
