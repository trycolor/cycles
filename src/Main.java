public class Main {

    public static void main(String[] args) {
        //задание 1
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
        }
        System.out.println("задание 2");
        //задание 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

        }
        System.out.println("задание 3");
        //задание 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("задание 4");
        for (int i = 10; i >= (-10); i--) {
            System.out.println(i);
        }
        System.out.println("Високосный год");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " Год является високосным");
        }
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Сумма накомплений = " + total);
        };
        System.out.println("Таблица умнжения");
        System.out.println(total);
        int a = 2;
        int result = 0;
        for (int i = 1; i <=10; i++) {
            result = i * a;
            System.out.println(a + "*" + i  + "=" +  result);

        }







    }
}