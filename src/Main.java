       public class Main {
       public static void main(String[] args) {
       //task1
       System.out.println("задание 1");
       byte frog = 123;
       System.out.println("Значение переменной frog с типом byte равно " + frog);
       short cat = 1111;
       System.out.println("Значение переменной cat с типом short равно " + cat);
       int dog = 2145454545;
       System.out.println("Значение переменной dog с типом int равно " + dog);
       long pig = -3453453453453L;
       System.out.println("Значение переменной pig с типом long равно " + pig);
       float moose = 0.345f;
       System.out.println("Значение переменной moose с типом float равно " + moose);
       double fish = 3.5;
       System.out.println("Значение переменной fish с типом double равно " + fish);

        //task2
        double g = 27.12;
        byte a = 67;
        short b = -159;
        short c = 569;
        long d = 987678965549L;
        float e = 2.786F;
        int f = 27897;

        //task3
        System.out.println("задание 3");
        int ludmila = 23;
        int anna = 27;
        int ekaterina = 30;
        int totalStudents = ludmila + anna + ekaterina;
        System.out.println("Всего студентов " + totalStudents);
        int totalPaper = 480;
        int sheets = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");

        //task4
        System.out.println("задание 4");
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

        //task5
        System.out.println("задание 5");
        int potWhite1class = 2;
        int potBrown1class = 4;
        int totalPot = 120;
        int totalPot1class = potWhite1class + potBrown1class;
        int totalClass = totalPot / totalPot1class;
        System.out.println("всего " + totalClass + " классов в школе");
        int totalPotWhite = totalClass * potWhite1class;
        int totalPotBrown = totalClass * potBrown1class;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalPotWhite +
             " банок белой краски и " + totalPotBrown + " банок коричневой краски");

        //task6
        System.out.println("задание 6");
        int banans = 5;
        int weight1banan = 80;
        int totalWeightBanans = banans * weight1banan;
        int milks = 2;
        int weightMilk = 105;
        int totalWeightMilks = weightMilk * milks;
        int ice = 2;
        int weightIce = 100;
        int totalWeightIce = ice * weightIce;
        int eggs = 4;
        int weightEgg = 70;
        int totalWeightEggs = eggs * weightEgg;
        int brekfast = totalWeightBanans + totalWeightMilks + totalWeightIce + totalWeightEggs;
        System.out.println("Общий вес завтрака " + brekfast + " граммов");
        float brekfastKG = brekfast / 1000f;
        System.out.println("Общий вес завтрака " + brekfastKG + " кг");

        //task7
        System.out.println("задание 7");
        float loseWeightDay = 0.25f;
        int totalWeight = 7;
        float totalDay = totalWeight / loseWeightDay;
        System.out.println("Спортсмен будет худеть " + totalDay + " дней");
        float loseWeightDay2 = 0.5f;
        float totalDay2 = totalWeight / loseWeightDay2;
        System.out.println("Спортсмен будет худеть " + totalDay2 + " дней");
        float loseWeightDay3 = (0.5f + 0.25f) / 2;
        double totalDay3 = totalWeight / loseWeightDay3;
        System.out.println("Спортсмен будет худеть " + totalDay3 + " дней");

        //task8
        System.out.println("задание 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float indexSalaryInsrease = 1.1f;
        int salaryMashaPerYear = salaryMasha * 12;
        int salaryDenisPerYear = salaryDenis * 12;
        int salaryKristinaPerYear = salaryKristina * 12;
        float newSalaryMasha = salaryMasha * indexSalaryInsrease;
        float newSalaryDenis = salaryDenis * indexSalaryInsrease;
        float newSalaryKristina = salaryKristina * indexSalaryInsrease;
        float annualProfitMasha = (newSalaryMasha - salaryMasha) * 12;
        float annualProfitDenis = (newSalaryDenis - salaryDenis) * 12;
        float annualProfitKristina = (newSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " +newSalaryMasha +
                " рублей. Годовой доход вырос на " +annualProfitMasha+ " рублей");
        System.out.println("Денис теперь получает " +newSalaryDenis +
                " рублей. Годовой доход вырос на " +annualProfitDenis+ " рублей");
        System.out.println("Кристина теперь получает " +newSalaryKristina +
                " рублей. Годовой доход вырос на " +annualProfitKristina+ " рублей");





       }
}