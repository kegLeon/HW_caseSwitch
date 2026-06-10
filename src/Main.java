
public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOs = 3;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Что-то пошло не так, АЛАРМО");
        }
//task 2
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для Яблока по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Яблока по ссылке");
        }
        //task 3
        int year = 1584;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("год високосен");
        } else if (year % 400 == 0) {
            System.out.println("год високосен");
        } else if (year < 1584) {
            System.out.println("Не можем по календарю судить");
        } else {
            System.out.println("Год не високосен");
        }


        //task 4
        int delivDistance = 100;
        if (delivDistance <= 20) {
            System.out.println("потребуются сутки");
        } else if (20 <= delivDistance && delivDistance <= 60) {
            System.out.println("Ну двое суток подождите пожалуйста");
        } else if (61 <= delivDistance && delivDistance <= 100) {
            System.out.println("3 суток ожидайте");
        } else {
            System.out.println("Доставки на такие расстояния нет");
        }
        //task 5

        int monthNumber = 12;
        if (monthNumber <= 12) {
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
            }
        }
    }
}