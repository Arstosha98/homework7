public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int savings = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + savings;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int start;
        start = 1;
        while (start <= 10) {
            System.out.print (start + " " );
            start = start + 1;
        }
        System.out.println();
        start = 10;
        for (; start >= 1; start = start - 1) {
            System.out.print (start + " " );
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание 3");
        int total = 12_000_000;
        int birthRateOfThousand = 17;
        int mortalityOfThousand = 8;
        int year = 1;
        int oneYear = (birthRateOfThousand - mortalityOfThousand) * (total/1000);
        for (year = 1; year <= 10; year++) {
            total =  total + oneYear;
            System.out.println("Год " + year + ", численность населения составляет " + total);
        }
    }
    public static void task4() {
        System.out.println("Задание 4");
        int total = 15_000;
        int i = 0;
        while (total <= 12_000_000) {
            total = total + total*7/100;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задание 5");
        int total = 15_000;
        int i = 0;
        while (total <= 12_000_000) {
            total = total + total * 7 / 100;
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задание 6");
        int total = 15_000;
        int i = 0;
        while (i <= 108) {
            total = total + total*7/100;
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задание 7");
        int friday = 3; // например месяц март
        for (;friday <= 31;friday = friday + 7) {
            if (friday >= 3) {
            }
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задание 8");
        int start = 0;
        int end = 2100;
        for (;start < end;){
            start = start + 79;
            if (start >= 1896 && start <= 2100) {
                System.out.println(start);
            }
            System.out.print("");
        }
    }
}