package Exam28and29March2020;

import java.util.Scanner;

public class SuppliesforSchool {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//•	Първи ред - брой пакети химикали. Цяло число в интервала [0...100]
//•	Втори ред - брой пакети маркери. Цяло число в интервала [0...100]
//•	Трети ред - литър препарат за почистване на дъска. Реално число в интервала [0.00…50.00]
//•	Четвърти ред - процентът намаление. Цяло число в интервала [0...100]

        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        double literCleaning = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());


        double money = (pen * 5.80 + marker * 7.20 + literCleaning * 1.20);

        double spend = money * ( 1 - percentDiscount * 1.0 / 100);

        System.out.printf("%.3f", spend);

    }
}
