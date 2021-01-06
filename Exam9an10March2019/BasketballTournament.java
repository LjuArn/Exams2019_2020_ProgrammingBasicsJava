package Exam9an10March2019;

import java.util.Scanner;

public class BasketballTournament {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String game = scanner.nextLine();
    int countgames = 0;
    int countWin = 0;
    int countLost = 0;

        while (!"End of tournaments".equals(game)){

            int numberGames = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= numberGames; i++) {

                int pointsDesi = Integer.parseInt(scanner.nextLine());
                int pointsNotDesi = Integer.parseInt(scanner.nextLine());

                if (pointsDesi > pointsNotDesi){
                    countWin++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, game, pointsDesi - pointsNotDesi);
                }else {
                    countLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, game, pointsNotDesi - pointsDesi);
                }
                countgames++;
            }

            game = scanner.nextLine();
        }

        //o	{процент спечелени мачове от всички турнири}% matches win
        //o	{процент загубени мачове от всички турнири}% matches lost

        double winPercent = countWin * 1.0 / countgames * 100;
        double lostPercent = countLost * 1.0 / countgames * 100;

        System.out.printf("%.2f%% matches win%n", winPercent);
        System.out.printf("%.2f%% matches lost%n", lostPercent);

    }
}
