package Exam2and3May2019;

import java.util.Scanner;

public class VetParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberDays = Integer.parseInt(scanner.nextLine());
        int numberHours = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double priceDay = 0;
        double allPrice = 0;

        for (int i = 1; i <= numberDays; i++) {
            priceDay = 0;
            for (int j = 1; j <= numberHours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    price = 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    price = 1.25;
                } else {
                    price = 1.00;
                }
                priceDay += price;
            }

            System.out.printf("Day: %d - %.2f leva%n", i, priceDay);

            allPrice += priceDay;

        }

        System.out.printf("Total: %.2f leva", allPrice);


    }
}
