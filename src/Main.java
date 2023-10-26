public class Main {
    //Задачи на методы
    public static void checkYear(int year) {
        //Метод к задаче 1
        if (year % 4 == 0) {
            System.out.println(year + " - Високосный год");
        } else {
            System.out.println(year + " - Невисокосный год");
        }
    }
    public static void checkVersion (int clientDeviceYear, int clientOS) {
        //Метод к задаче 2
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректное название");
        }
    }
    public static int checkDistance(int distance) {
        int days = 0;
        if (distance <= 20) {
            days = 1;
        } else if (distance > 20 && distance <= 60) {
            days = 2;
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        } else if (distance > 100) {
            System.out.println("Не доставляем");
        }
        return days;
    }
    public static void main(String[] args) {
        System.out.println("Задача1");
        int year = 2000;
        checkYear(year);
        System.out.println();

        System.out.println("Задача2");
        // 0 — iOS или 1 — Android
        /*
        Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
        Для iOS: «Установите облегченную версию приложения для iOS по ссылке».
        Для Android: «Установите облегченную версию приложения для Android по ссылке».
        */
        int operatingSystem = 1;
        int releaseYear = 2005;
        checkVersion(releaseYear, operatingSystem);
        System.out.println();
        
        System.out.println("Задача3");
        int distanceDelivery = 65;
        System.out.println(checkDistance(distanceDelivery) + "дн. - срок доставки");
    }
}