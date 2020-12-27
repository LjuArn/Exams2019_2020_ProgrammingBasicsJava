package Exam28and29March2020;

import java.util.Scanner;

public class TournamentOfChristmas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
        //До получаване на командата "Finish" се чете:
        //•	Спорт  – текст
        //За всеки спорт се прочита:
        //o	Резултат  – текст с възможности: "win" или "lose"


        int sportDay = Integer.parseInt(scanner.nextLine());
        double dayMoney = 0.0;
        int countWinGames = 0;
        int countLoseGames = 0;
        int allDayWinGames = 0;
        int allDayLoseGames = 0;
        double allMoney = 0.0;


        for (int i = 1; i <= sportDay; i++) {

            String sport = scanner.nextLine();
            while (!"Finish".equals(sport)) {
                String endGame = scanner.nextLine();
                if ("win".equals(endGame)) {
                    dayMoney += 20;
                    countWinGames++;
                } else {
                    countLoseGames++;
                }

                sport = scanner.nextLine();
            }
            if (countWinGames > countLoseGames) {
                dayMoney = dayMoney * 1.1;
                allDayWinGames++;
            } else {
                allDayLoseGames++;
            }

            allMoney += dayMoney;
            dayMoney = 0;
            countWinGames = 0;
            countLoseGames = 0;
        }

        String output = "";
        if (allDayWinGames > allDayLoseGames) {
            allMoney = allMoney * 1.2;
            output = String.format("You won the tournament! Total raised money: %.2f", allMoney);
        } else{
            output = String.format("You lost the tournament! Total raised money: %.2f", allMoney);
        }

        System.out.println(output);

        //•	Ако сте спечелили турнира:
        //     	"You won the tournament! Total raised money: {спечелените пари}"
        //•	Ако сте загубили на турнира:
        //"You lost the tournament! Total raised money: {спечелените пари}"
    }
}
