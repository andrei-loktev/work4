public class Main {
    public static void main(String[] args) {
       //task1
       byte frog = 123;
        System.out.println("Значение переменной frog с типом byte равно " + frog);
       short cat = 1111;
        System.out.println("Значение переменной cat с типом short равно " + cat);
       int dog = 2145454545;
        System.out.println("Значение переменной dog с типом int равно " + dog);
       long pig = -3453453453453L;
        System.out.println("Значение переменной pig с типом long равно " + pig);
       float moose = 0.345F;
        System.out.println("Значение переменной moose с типом float равно " + moose);
       double fish = 3.5;
        System.out.println("Значение переменной fish с типом double равно " + fish);

        //task2
        byte a = 67;
        short b = -159;
        short c = 569;
        long d = 987678965549L;
        float e = 2.786F;
        int f = 27897;

        //task3
        int ludmila = 23;
        int anna = 27;
        int ekaterina = 30;
        int totalStudents = ludmila + anna + ekaterina;
        System.out.println("Всего студентов " + totalStudents);
        int totalPaper = 480;
        int sheets = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");

        //task4
        int time = 2;
        int factoryBottle = 16;
        System.out.println("За " + time + " минуты машина произвела " + factoryBottle + " бутылок");
        int factoryBottleMin = factoryBottle/time;
        int time2 = 20;
        int factoryBottle2 = factoryBottleMin * time2;
        System.out.println("За " + time2 + " минут машина произвела " + factoryBottle2 + " бутылок");
        int time3 = 1440;
        int factoryBottle3 = factoryBottleMin * time3;
        System.out.println("За " + time3 + " минут машина произвела " + factoryBottle3 + " бутылок");
        int time4 = time3 * 3;
        int factoryBottle4 = factoryBottleMin * time4;
        System.out.println("За " + time4 + " минут машина произвела " + factoryBottle4 + " бутылок");
        int time5 = time3 * 30;
        int factoryBottle5 = factoryBottleMin * time5;
        System.out.println("За " + time5 + " минут машина произвела " + factoryBottle5 + " бутылок");
    }
}