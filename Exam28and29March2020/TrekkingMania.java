package Exam28and29March2020;

import java.util.Scanner;

public class TrekkingMania {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInGrup = Integer.parseInt(scanner.nextLine());
        int peopleForMusala = 0;
        int peopleForMonblan = 0;
        int peopleForKilimandjaro = 0;
        int peopleForK2 = 0;
        int peopleForEverest = 0;
        int allPeople = 0;

        for (int i = 1; i <= numberInGrup; i++) {
            int peopleInGrup = Integer.parseInt(scanner.nextLine());
            if (peopleInGrup <= 5) {
                peopleForMusala = peopleForMusala + peopleInGrup;
            } else if (peopleInGrup <= 12) {
                peopleForMonblan = peopleForMonblan + peopleInGrup;
            } else if (peopleInGrup <= 25) {
                peopleForKilimandjaro = peopleForKilimandjaro + peopleInGrup;
            } else if (peopleInGrup <= 40) {
                peopleForK2 = peopleForK2 + peopleInGrup;
            } else if (peopleInGrup >= 41) {
                peopleForEverest = peopleForEverest + peopleInGrup;
            }
            allPeople = allPeople + peopleInGrup;
        }

        double percentForMusala = peopleForMusala * 1.0/ allPeople * 100;
        double percentForMonblan = peopleForMonblan * 1.0/ allPeople * 100;
        double percentForKilimanjaro = peopleForKilimandjaro * 1.0/ allPeople * 100;
        double percentForK2 = peopleForK2 * 1.0/ allPeople * 100;
        double percentForEverest = peopleForEverest * 1.0/ allPeople * 100;

        System.out.printf("%.2f%%%n", percentForMusala);
        System.out.printf("%.2f%%%n", percentForMonblan);
        System.out.printf("%.2f%%%n", percentForKilimanjaro);
        System.out.printf("%.2f%%%n", percentForK2);
        System.out.printf("%.2f%%%n", percentForEverest);

    }
}
