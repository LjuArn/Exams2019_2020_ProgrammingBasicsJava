package Exam9an10March2019;

import java.util.Scanner;

public class Sceleton {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ред 1.	Минути на контролата – цяло число в интервала [0…59]
        //Ред 2.	Секунди на контролата – цяло число в интервала [0…59]
        //Ред 3.	Дължината на улея в метри – реално число в интервала [0.00…50000]
        //Ред 4.	Секунди за изминаване на 100 метра – цяло число в интервала [0…1000]


        int allMinutes = Integer.parseInt(scanner.nextLine());
        int allSeconds = Integer.parseInt(scanner.nextLine());
        double beehive = Double.parseDouble(scanner.nextLine());
        int secunbsPerHundridMeters = Integer.parseInt(scanner.nextLine());

        int allQuotaTime = allMinutes * 60 + allSeconds;

        double timeDecreese = (beehive / 120) * 2.5;
        double allTime = (beehive / 100 * secunbsPerHundridMeters) - timeDecreese;

        if (allTime <= allQuotaTime) {
            System.out.printf("Marin Bangiev won an Olympic quota!%n");
            System.out.printf("His time is %.3f.", allTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", allTime - allQuotaTime);

        }
    }
}
