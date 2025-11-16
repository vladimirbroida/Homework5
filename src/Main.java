//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой операционной системы нет");
        }

        System.out.println("задача 2");
        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("задача 3");

        int year = 1400;
        if (year < 1584) {
            System.out.println("Год должен быть больше чем 1584");

        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " Год является високосным");
            } else {
                System.out.println(year + " Год не является високосным");

        }
        System.out.println("задача 4");
        int deliveryDistance = 60;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            deliveryDays = 1;

        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays += 2;
        } else {
            System.out.println("Доставки нет");
            return;
        }
        System.out.println("Потребуется " + deliveryDays + " дней");

        System.out.println("задача 5");
        int monthNumber = 19;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
                System.out.println("Нет такого месяца");
        }

    }
}


