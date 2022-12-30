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
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний ");
        }

        if (age < 18) {
            System.out.println("Если возраст человека < 18, то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов,  нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }

        if (speed < 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int ageOld = 23;
        if (ageOld >= 2 && ageOld <= 6) {
            System.out.println("Если возраст человека равен " + ageOld + " то ему нужно ходить в детский сад");
        }
        if (ageOld >= 7 && ageOld <= 18) {
            System.out.println("Если возраст человека равен " + ageOld + " то ему нужно ходить в школу");
        }
        if (ageOld > 18 && ageOld <= 24) {
            System.out.println("Если возраст человека равен " + ageOld + " то его место в университете");
        }
        if (ageOld > 24) {
            System.out.println("Если возраст человека равен " + ageOld + " то ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int yearsOld = 10;
        if (yearsOld < 5) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " то он не может кататься на аттракционе");
        }
        if (yearsOld > 5 && yearsOld <= 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " то он может кататься только в сопровождении взрослого");
        }
        if (yearsOld > 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " то он может кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 102;
        int landingPlace = 60;
        int standingPlaces = total - landingPlace;
        System.out.println(standingPlaces);

        int seats = 61;
        int otherPlaces = 30;
        if (seats > landingPlace) {
            System.out.println("В вагоне нет сидячих мест");
        } else {
            System.out.println("В вагоне еще " + (landingPlace - seats) + " сидячих мест");
        }
        if (otherPlaces > standingPlaces) {
            System.out.println("В вагоне нет стоячих мест");
        } else {
            System.out.println("В вагоне еще " + (standingPlaces - otherPlaces) + " стоячих мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 100;
        int two = 124;
        int three = 205;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}



