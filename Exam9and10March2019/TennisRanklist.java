package Exam9an10March2019;

import java.util.Scanner;

public class TennisRanklist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//•	Брой турнири, в които е участвал – цяло число в интервала [1…20]
//•	Начален брой точки в ранглистата - цяло число в интервала [1...4000]

        int numberGames = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int countWin = 0;
        int points = 0;

        for (int i = 1; i <= numberGames; i++) {

            String partOfGame = scanner.nextLine();

            //•	Достигнат етап от турнира – текст – "W", "F" или "SF"
            if ("W".equals(partOfGame)) {
                points  += 2000;
                countWin ++;

            } else if ("F".equals(partOfGame)) {
                points += 1200;
            } else if ("SF".equals(partOfGame)) {
                points += 720;
            }

        }

        //•	"Final points: {брой точки след изиграните турнири}"
        //•	"Average points: {средно колко точки печели за турнир}"
        //•	"{процент спечелени турнири}%"
        int allPoints = startPoints + points;
        double averagePoints = Math.floor(points / numberGames);
        double percentWin = (countWin * 1.0 / numberGames) * 100;

        System.out.printf("Final points: %d%n", allPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", percentWin);
    }
}
