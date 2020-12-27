package Exam2and3May2019;

import java.util.Scanner;

public class DivisionWithoutRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int countTwo = 0;
        int countThree = 0;
        int countFour = 0;

        for (int i = 1; i <= number; i++) {

            int digit = Integer.parseInt(scanner.nextLine());
            if (digit % 2 == 0) {
                countTwo++;
            }

            if (digit % 3 == 0) {
                countThree++;
            }

            if (digit % 4 == 0) {
                countFour++;
            }

        }

        double p2 = countTwo * 1.0/ number * 100;
        double p3 = countThree * 1.0/ number * 100;
        double p4 = countFour * 1.0/ number * 100;

        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);

    }


}
