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
            if (i % 2 == 0) {
                System.out.println("2*" + i + "=" + riseTwoOn);
            }
        }
    }
}

