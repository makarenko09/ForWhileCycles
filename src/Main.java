import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
//task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("End task 1");
//task 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("End task 2");
        //task 3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("End task 3");
//task 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("End task 4");
        //task 5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
//task 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);


        }
//task 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);


        }
//task 8
        int money = 29000;
        int mySaveMoney = 0;
        for (int i = 1; i <= 12; i++) {
            mySaveMoney += money;

            System.out.println("Месяц номер:" + i + ", - сумма накоплений = " + mySaveMoney + " рублей");

        }
//task 9
        int upMoney = 29000;
        int totalSavings = 0;
        double monthlyInterestRate = 0.01; // 1% от суммы каждый месяц
        for (int i = 1; i <= 12; i++) {
            totalSavings += upMoney;
            double interest = totalSavings * monthlyInterestRate; // вычисляем проценты
            totalSavings += interest;

            System.out.println("Месяц номер:" + i + ", - сумма накоплений = " + totalSavings + " рублей");

        }
//task 10
        for (int i = 1; i <= 10; i++) {
            int riseTwoOn = (byte) 2 * i;
            System.out.println("2*" + i + "=" + riseTwoOn);
        }
//task 1 lesson 2
        int zp = 0;
        int mounthers = 0;
        int zpUp = 15_000;
        while (zp <= 2_459_000) {
            zp += zpUp;
            mounthers++;
            System.out.println("Месяц номер: " + mounthers + ", - сумма накоплений = " + zp + " рублей");
        }
        System.out.println("Потребуется месяцев: " + mounthers);
//variant 2
        int zpTwo = 0;
        mounthers = 0;
        int zpUpTwo = 15_000;
        double monthlyInterestRateTwo = 0.01; // 1% от суммы каждый месяц
        while (zpTwo <= 2_459_000) {
            zpTwo += zpUpTwo;
            mounthers++;

            double interest = zpTwo * monthlyInterestRateTwo; // вычисляем проценты
            zpTwo += interest;

            System.out.println("Месяц номер: " + mounthers + ", - сумма накоплений = " + zpTwo + " рублей");
        }
        System.out.println("Потребуется месяцев: " + mounthers);
//task 2 lesson 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
// task 3 lesson 2
        long millionPerople = (long) Math.pow(10, 6);
        long piople = 12 * millionPerople;
        long deadlyPiople = 8;
        long bornPeople = 18;
        int yearsPiople = 1;
        long anyPersontPioplte = 0;

        while (yearsPiople < 11) {
            anyPersontPioplte = piople / 1000;
            long deadlyValue = (deadlyPiople * anyPersontPioplte);
            long bornValue = (bornPeople * anyPersontPioplte);
            piople = piople + (bornValue - deadlyValue);
            System.out.println("Год: " + yearsPiople + " - " + piople + " человек");
            yearsPiople++;
        }
//task 4 lesson 2
//variant 2
        zpTwo = 0;
        mounthers = 0;
        zpUpTwo = 15_000;
        monthlyInterestRateTwo = 0.07; // 1% от суммы каждый месяц
        while (zpTwo <= 12_000_000) {
            zpTwo += zpUpTwo;
            mounthers++;

            double interest = zpTwo * monthlyInterestRateTwo; // вычисляем проценты
            zpTwo += interest;

            System.out.println("Месяц номер: " + mounthers + ", - сумма накоплений = " + zpTwo + " рублей");
        }
        System.out.println("Потребуется месяцев: " + mounthers);
//task 5 lesson 2
        zpTwo = 0;
        mounthers = 0;
        zpUpTwo = 15_000;
        monthlyInterestRateTwo = 0.07; // 1% от суммы каждый месяц
        while (zpTwo <= 12_000_000) {
            zpTwo += zpUpTwo;
            mounthers++;

            double interest = zpTwo * monthlyInterestRateTwo; // вычисляем проценты
            zpTwo += interest;

            if (mounthers % 6 == 0) {
                System.out.println(mounthers + "-й месяц, - сумма накоплений = " + zpTwo + " рублей");
            }
        }
//task 6 lesson 2
        zpTwo = 0;
        yearsPiople = 0;
        mounthers = 0;
        zpUpTwo = 15_000;
        monthlyInterestRateTwo = 0.07; // 1% от суммы каждый месяц
        while (yearsPiople <= 9) {
            zpTwo += zpUpTwo;
            mounthers++;

            double interest = zpTwo * monthlyInterestRateTwo; // вычисляем проценты
            zpTwo += interest;
            if (mounthers % 12 == 0) {
                yearsPiople++;
            }
            if (mounthers % 6 == 0) {
                System.out.println(mounthers + "-й месяц, " + yearsPiople + "-й г. - сумма накоплений = " + zpTwo + " рублей");
            }

        }
//task 7 lesson 2
        int monthNumber = 5;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, monthNumber - 1); // месяцы считаются с 0
        calendar.set(Calendar.DAY_OF_MONTH, 1); // первое число месяца
        int maxDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int checkError = 0;
        if (monthNumber > 1 && monthNumber <= 12) {
            checkError++;
        } else {
            System.out.println("Номер месяца должен быть от 1 до 12");
        }
        if (maxDaysInMonth == 31) {
            System.out.println("В этом месяце 31 день.");
            checkError++;
        } else {
            System.out.println("В этом месяце не 31 день.");
        }

        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.FRIDAY) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        int fr = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Первая пятница в " + monthNumber + "-ом месяце: " + fr + "-e число \n # " + calendar.getTime());

        for (; checkError == 2 && fr <= maxDaysInMonth; fr += 7) {
            System.out.println("Сегодня пятница, " + fr + "-е число. Необходимо подготовить отчёт");
        }
//task 8 lesson 2
        int startYear = 0;
        int comet = 79;
        int nowYear = 2024;
        int pastYearss = (nowYear - 200);
        int futerYearss = (nowYear + 100);
        System.out.println(pastYearss + "\n" + futerYearss);
        while (startYear < futerYearss) {

            if (startYear > pastYearss) System.out.println(startYear + " - год, когда пролетела комета");
            startYear += comet;
        }


    }
}