public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он несовершеннолетний");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 8;
        if (temp <= 5) {
            System.out.printf("«На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.printf("«На улице " + temp + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.printf("Если скорость " + speed + " то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 54;
        boolean kinderGarten = age >= 2 && age <= 6;
        boolean school = age >= 7 && age <= 18;
        boolean college = age > 18 && age < 24;
        boolean work = age > 24;
        if (kinderGarten) {
            System.out.printf("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        if (school) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if (college) {
            System.out.printf("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }
        if (work) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 35;
        if (age <5) {
            System.out.printf("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int passengers = 110;
        int allCapacity = 102;
        int sitCapacity = 60;
        if (passengers < 102 && passengers > 60) {
            System.out.printf("В вагоне есть стоячее место");
        } else {
            if (passengers < 60) {
                System.out.println("В вагоне есть сидячее место");
            } else {
                System.out.println("В вагоне нет мест");
            }
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 15;
        int two = 1;
        int three = 67;
        if (one > two && one > three) {
            System.out.println(one + " самое большое число");
        } else {
            if (two > one && two > three) {
                System.out.println(two + " самое большое число");
            } else {
                System.out.println(three + " самое большое число");
            }
        }
    }
}