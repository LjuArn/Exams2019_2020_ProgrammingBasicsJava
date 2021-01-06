package Exam9an10March2019;

import java.util.Scanner;

public class GameNumberWars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Първоначално се четат два реда:
        //•	Име на първия играч - текст
        //•	Име на втория играч - текст
        //След това, до получаване на команда "End of game", се четат многократно по два реда:
        //1.	Карта, която дава първият играч- цяло число в интервала [2…9]
        //2.	Карта, която дава вторият играч -  цяло число в интервала [2…9]
        //При еднакви карти на двамата играчи се прочитат нови два реда (карта, която дава първият
        // и карта, която дава вторият.)

        String nameFirst = scanner.nextLine();
        String nameSecond = scanner.nextLine();
        String input = scanner.nextLine();
        int firstWinpoints = 0;
        int secondWinPoints = 0;
        int allFirstpoints = 0;
        int allSecondtpoints = 0;
        String gameWin = "";
        int pointWin = 0;
        boolean equal = false;

        while (!"End of game".equals(input)) {
            int firstCard = Integer.parseInt(input);
            int secondCard = Integer.parseInt(scanner.nextLine());

            if (firstCard > secondCard) {
                firstWinpoints = firstCard - secondCard;
                allFirstpoints += firstWinpoints;
            } else if (firstCard < secondCard) {
                secondWinPoints = secondCard - firstCard;
                allSecondtpoints += secondWinPoints;
            } else {

                firstCard = Integer.parseInt(scanner.nextLine());
                secondCard = Integer.parseInt(scanner.nextLine());

                if (firstCard > secondCard) {
                    gameWin = nameFirst;
                    pointWin = allFirstpoints;
                } else {
                    gameWin = nameSecond;
                    pointWin = allSecondtpoints;
                }
                equal = true;
                break;

            }
            input = scanner.nextLine();

        }

        if (equal) {
            System.out.printf("Number wars!%n");
            System.out.printf("%s is winner with %d points", gameWin, pointWin);
        } else {
            System.out.printf("%s has %d points%n", nameFirst, allFirstpoints);
            System.out.printf("%s has %d points", nameSecond, allSecondtpoints);
        }


    }
}
