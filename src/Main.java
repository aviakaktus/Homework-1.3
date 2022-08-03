import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        //Домашка 1.3 Условные операторы
        // Задача 1
        byte clientOS = 1;
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        int clientDeviceYear = 2012;
        byte clientOS_2 = 0;
        if (clientOS_2==0){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");}
        }
        else if (clientOS_2==1){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");}
        }

        //Задача 3
        int year = 2021;
        if (year%4 != 0) {
            System.out.println(year + " год не является високосным");
        }
        else{
            if (year%400 ==0){
                System.out.println(year + " год является високосным");}
            else if (year%100 ==0){
                System.out.println(year + " год не является високосным");}
            else {
                System.out.println(year + " год является високосным");}
        }

        //Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance<20){
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance<60){
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance<100){
            System.out.println("Потребуется дней: 3");
        }

        //Задача 5
        int monthNumber = 12;

        switch (monthNumber){
            case 1: System.out.println("Месяц 1 - январь принадлежит к зиме"); break;
            case 2: System.out.println("Месяц 2 - февраль принадлежит к зиме"); break;
            case 3: System.out.println("Месяц 3 - март принадлежит к весне"); break;
            case 4: System.out.println("Месяц 4 - апрель принадлежит к весне"); break;
            case 5: System.out.println("Месяц 5 - май принадлежит к весне"); break;
            case 6: System.out.println("Месяц 6 - июнь принадлежит к лету"); break;
            case 7: System.out.println("Месяц 7 - июль принадлежит к лету"); break;
            case 8: System.out.println("Месяц 8 - август принадлежит к лету"); break;
            case 9: System.out.println("Месяц 9 - сентябрь принадлежит к осени"); break;
            case 10: System.out.println("Месяц 10 - октябрь принадлежит к осени"); break;
            case 11: System.out.println("Месяц 11 - ноябрь принадлежит к осени"); break;
            case 12: System.out.println("Месяц 12 - декабрь принадлежит к зиме"); break;
            default: System.out.println("Вы ввели неправильный месяц");
        }

        //Задача 6
        int age = 19;
        double salary = 58_000;
        double limit = 0;

        if (age >= 23) {
            limit = salary *3;}
        else { limit = salary * 2;}

        if (salary >= 80_000) {
            limit = limit * 1.5;
        } else if (salary >=50_000) {
            limit = limit * 1.2;}
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей!");

        //Задача 7
        int age7 = 25;
        double salary7 = 60_000;
        double wantedSum = 330_000;
        double basStavka = 10;
        double platezCredit = 0;
        double maxPlatez = 0;
        if (salary7 > 80_000) {
            basStavka = basStavka - 0.7;
        }
        if (age7 < 23) {
            basStavka = basStavka + 1;
        }
        else if (age7 < 30){
            basStavka = basStavka + 0.5;
        }
        platezCredit = (wantedSum * (1+ basStavka/100))/12;
        maxPlatez = salary7 / 2;
        if (maxPlatez > platezCredit) {
            System.out.println("Максимальный платеж при ЗП "+ salary7 + " равен " + maxPlatez + " рублей. Платеж по кредиту " + platezCredit+ " рублей. Одобрено.");
        }
        else {
            System.out.println("Максимальный платеж при ЗП "+ salary7 + " равен " + maxPlatez + " рублей. Платеж по кредиту " + platezCredit+ " рублей. Отказано.");
        }
    }
}