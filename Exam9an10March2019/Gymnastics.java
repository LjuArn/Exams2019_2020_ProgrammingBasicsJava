package Exam9an10March2019;

import java.util.Scanner;

public class Gymnastics {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//•	Първи ред – държава – текст ("Russia", "Bulgaria" или "Italy")
//•	Втори ред – уред - текст ("ribbon", "hoop" или "rope")

        String goverment = scanner.nextLine();
        String device = scanner.nextLine();
        double difficulty = 0.0;
        double performance = 0.0;

        if ("Russia".equals(goverment)) {

            switch (device) {
                case "ribbon":
                    difficulty = 9.100;
                    performance = 9.400;
                    break;
                case "hoop":
                    difficulty = 9.300;
                    performance = 9.800;
                    break;
                case "rope":
                    difficulty = 9.600;
                    performance = 9.000;
                    break;
                default:
                    break;
            }


        } else if ("Bulgaria".equals(goverment)) {

            switch (device) {
                case "ribbon":
                    difficulty = 9.600;
                    performance = 9.400;
                    break;
                case "hoop":
                    difficulty = 9.550;
                    performance = 9.750;
                    break;
                case "rope":
                    difficulty = 9.500;
                    performance = 9.400;
                    break;
                default:
                    break;
            }


        } else if ("Italy".equals(goverment)) {

            switch (device) {
                case "ribbon":
                    difficulty = 9.200;
                    performance = 9.500;
                    break;
                case "hoop":
                    difficulty = 9.450;
                    performance = 9.350;
                    break;
                case "rope":
                    difficulty = 9.700;
                    performance = 9.150;
                    break;
                default:
                    break;
            }


        }

        double allPoints = difficulty + performance;

        double needPointPercent = (20 - allPoints) / 20 * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", goverment, allPoints, device);
        System.out.printf("%.2f%%", needPointPercent);


    }
}
