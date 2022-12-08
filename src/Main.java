import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        leapYear();
        checkOperationSystem();
        delivery();
    }

    public static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год для проверки");
        int year = scanner.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год: " + year + " является високосным");
        } else {
            System.out.println("Год: " + year + " не является високосным");
        }
        scanner.close();
    }

    public static void checkOperationSystem() {
        Scanner scanner = new Scanner(System.in);
        int clientDeviceYea = 2015;
        System.out.println("Введите год изготовления вашего устройства");
        int yearDevice = scanner.nextInt();
        System.out.println("Выберите операционную систему");
        System.out.println("1. Android");
        System.out.println("2. IOS");
        int clientOS = scanner.nextInt();
        if (clientDeviceYea >= yearDevice && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYea >= yearDevice && clientOS == 2) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYea <= yearDevice && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYea <= yearDevice && clientOS == 2) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Данные введены некоректно");
        }
        scanner.close();

    }
    public static void delivery () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние");
        int deliveryDistance = scanner.nextInt();
        int day = 0;

        if (deliveryDistance <= 20) {
            day += 1;
            System.out.println("На доставку уйдет " + day + " день");
        } else if (deliveryDistance <= 60) {
            day += 2;
            System.out.println("На доставку уйдет " + day + " дня");
        } else if (deliveryDistance <= 100) {
            day += 3;
            System.out.println("На доставку уйдет " + day + " дня");
        } else {
            System.out.println("Доставки на расстояние свыше 100 км. нет");
        }
        scanner.close();
    }

}