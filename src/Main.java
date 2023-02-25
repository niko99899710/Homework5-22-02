public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выбирите программу");
        }

        int clientDeviceYear = 2014;
        int clientOs = 0;
        if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (clientOs == 1 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android или iOS");
            }
        } else {
            if (clientOs == 0 && clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOs == 1 && clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Выбирите программу");
            }
        }

        int year = 2021;

        if ((year%4 == 0 && year%100 !=0) || (year%400 == 0)) {
            System.out.println( year + " год является високосным ");
        } else {
            System.out.println( year + "год не является високосным");
        }

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println(deliveryDistance + " - Доставка в пределах 20 км занимает сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance <60 ){
            System.out.println(deliveryDistance + " - Доставка в пределах от 20 км до 60 км занимает  2 суток");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println(deliveryDistance + " - Доставка в пределах от 60 км до 100 км занимет 3 сутки");
        } else {
            System.out.println (deliveryDistance + " - Свыше 100 км доставки нет.");
        }

        int monthNumber = 13;
        switch (monthNumber = 12) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " - Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " - Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " - Летний месяц");
                    break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " - Осенний месяц");
                break;
            default:
                System.out.println("Не может быть больше 12 месяцев");
        }
    }
}
