public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        byte applesCount =1;
        System.out.println("Значение переменной applesCount с типом byte равно " + applesCount);
        short orangesCount =2;
        System.out.println("Значение переменной orangesCount с типом short равно " + orangesCount);
        int catsCount =3;
        System.out.println("Значение переменной catsCount с типом int равно " + catsCount);
        long peopleCount =7_500_000_000L;
        System.out.println("Значение переменной peopleCount с типом long равно " + peopleCount);
        float pi = 3.141592F;
        System.out.println("Значение переменной pi с типом float равно " + pi);
        double e = 2.8; // основание натурального логарифма
        System.out.println("Значение переменной e с типом double равно " + e);

        // Task 2
        System.out.println("Task 2");
        float variable1 = 27.12F;
        long variable2 = 987_678_965_549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;

        // Task 3
        System.out.println("Task 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int papersCount = 480;
        int papersPerPupil = papersCount/(pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + papersPerPupil + " листов бумаги");

        // Task 4
        System.out.println("Task 4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минуту машина произвела бутылок " + productivityPerMinute*twentyMinutes + " штук ");
        int minutesInDay = 24 * 60;
        System.out.println("За " + minutesInDay + " минуту машина произвела бутылок " + productivityPerMinute*minutesInDay + " штук ");
        int minutesInTheesDays = 3 * minutesInDay;
        System.out.println("За " + minutesInTheesDays + " минуту машина произвела бутылок " + productivityPerMinute*minutesInTheesDays + " штук ");
        int minutesInMonth = 10 * minutesInTheesDays; // В месяце 30 дней
        System.out.println("За " + minutesInMonth + " минуту машина произвела бутылок " + productivityPerMinute*minutesInMonth + " штук ");

        // Task 5
        System.out.println("Task 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass =4;
        int totalClasses = totalCans / (whiteCansPerClass+brownCansPerClass);
        int totalWhiteCans = totalClasses*whiteCansPerClass;
        int totalBrownCans = totalClasses*brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно "+totalWhiteCans+" банок белой краски и "+totalBrownCans+" банок коричневой краски");

        // Task 6
        System.out.println("Task 6");











    }
}