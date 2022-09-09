public class Main {
    public static void main(String[] args) {
        // Задание 1

        int a = 1;
        System.out.println(a);
        byte b = 2;
        System.out.println(b);
        short c = 3;
        System.out.println(c);
        long d = 4;
        System.out.println(d);
        float e = 5.5F;
        System.out.println(e);
        double f = 6.5;
        System.out.println(f);

        // задача 2


        double v = 27.21;
        System.out.println(v);
        long n = 987678965;
        System.out.println(n);
        double k = 2.786;
        System.out.println(k);
        boolean x = false;
        System.out.println(x);
        int j = 569;
        System.out.println(j);
        short r = -169;
        System.out.println(r);
        int g = 27897;
        System.out.println(g);
        byte z = 67;
        System.out.println(z);
       // Задача 3
            int lyudmilyPavlovny = 23;
            int annySergeyevny = 27;
            int yekaterinyAndreyevny = 30;
            int sheets = 480;
            int oneStudent = sheets/(lyudmilyPavlovny+annySergeyevny+yekaterinyAndreyevny);
            System.out.println( "\"На каждого ученика рассчитано " + oneStudent + " листов бумаги.\"");
        //Задача 4

        int bottles = 16;
        int minutes = 20;
        int minutes1 = 60;
        int bottles2 = (bottles/2) * minutes;
        System.out.println(" “За " +minutes+  " минут машины произвела бутылок " +bottles2+ " штук“");
        int hour = 24;
        int bottles3 = (bottles/2)*minutes1*hour;
        System.out.println(" “За " +hour+  " часа машины произвела бутылок " +bottles3+ " штук“");
        int day = 3;
        int bottles4 = (bottles/2)*minutes1*(day*hour);
        System.out.println(" “За " +day+  " дня машины произвела бутылок " +bottles4+ " штук“");
        int month = 30;
        int bottles5 = (bottles/2)*month*hour*minutes1;
        System.out.println(" “За " +month+  " месяц машины произвела бутылок " +bottles5+ " штук“");
        // Задача 5
                 int totalCans = 120;
                int whiteJar = 2;
                int blackJar = 4;
                int numberClasses = totalCans/(whiteJar+blackJar);
                int whiteJar1 = numberClasses*whiteJar;
                int blackJar1 = numberClasses*blackJar;
                System.out.println("В школе,где " + numberClasses + " классов, нужно " + whiteJar1 + " банок белой краски и " + blackJar1 + " коричневой краски." );
        // Задача 6
                int babany = 5;
                int milk = 200;
                int iceSundae = 2;
                int rawEggs = 4;
                int weightBreak = (babany * 80) + ((milk * 105)/100) + (iceSundae * 100) + (rawEggs * 70);
                double weightKg = weightBreak/1000;
                System.out.println(weightKg);
        // Задача 7
            int loseWeight = 7000;
            int gram1 = 250;
            int gram2 = 500;
            int loseDays1 = loseWeight/gram1;
            System.out.println(loseDays1);
            int loseDays2 = loseWeight/gram2;
            System.out.println(loseDays2);
            int averageDays = (loseDays1+loseDays2)/2;
            System.out.println(averageDays);
        // Задача 8
            int masha = 67760;
            int denis = 83690;
            int kristina =76230;
            double masha1 = masha * 0.1;
            double masha2 = masha + masha1;
            double masha3 = masha1 * 12;
            System.out.println("“Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + masha3 +" рублей”.");
            double denis1 = denis * 0.1;
            double denis2 = denis + denis1;
            double denis3 = denis1 * 12;
            System.out.println("“Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + denis3 +" рублей”.");
            double kristina1 = kristina * 0.1;
            double kristina2 = kristina + kristina1;
            double kristina3 = kristina1 * 12;
            System.out.println("“Денис теперь получает " + kristina2 + " рублей. Годовой доход вырос на " + kristina3 +" рублей”.");
    }
}