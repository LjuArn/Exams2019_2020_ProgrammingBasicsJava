package Exam9an10March2019;

import java.util.Scanner;

public class WorldSnookerChampionship2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//1.	Етап на първенството – текст - “Quarter final ”, “Semi final” или “Final”
//2.	Вид на билета – текст - “Standard”, “Premium” или “VIP”
//3.	Брой билети – цяло число в интервала [1 … 30]
//4.	Снимка с трофея – символ – 'Y' (да) или 'N' (не)

        String championshipStage = scanner.nextLine();
        String tipeTicket = scanner.nextLine();
        int numberOfTicket = Integer.parseInt(scanner.nextLine());
        boolean photo = ("Y").equals(scanner.nextLine());

        double price = 0.0;



        if ("Quarter final".equals(championshipStage)) {

            switch (tipeTicket) {
                case "Standard":
                    price = 55.50;
                    break;
                case "Premium":
                    price = 105.20;
                    break;
                case "VIP":
                    price = 118.90;
                    break;
                default:
                    break;
            }


        } else if ("Semi final".equals(championshipStage)) {

            switch (tipeTicket) {
                case "Standard":
                    price = 75.88;
                    break;
                case "Premium":
                    price = 125.22;
                    break;
                case "VIP":
                    price = 300.40;
                    break;
                default:
                    break;
            }


        } else if ("Final".equals(championshipStage)) {

            switch (tipeTicket) {
                case "Standard":
                    price = 110.10;
                    break;
                case "Premium":
                    price = 160.66;
                    break;
                case "VIP":
                    price = 400;
                    break;
                default:
                    break;
            }


        }

        double spend = numberOfTicket * price;
        if (spend > 4000) {
            spend = spend * (1 - 0.25);
          photo = false;

        } else if (spend > 2500) {
            spend = spend * (1 - 0.1);
        }

        if(photo){
            spend = spend + numberOfTicket * 40;
        }

        System.out.printf("%.2f", spend);
    }
}



