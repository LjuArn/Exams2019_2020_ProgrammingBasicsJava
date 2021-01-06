package Exam9an10March2019;

import java.util.Scanner;

public class Darts {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String field = scanner.nextLine();
        int restPoints = 301;
        int countSuccessful = 0;
        int unsuccessfulCount = 0;
        boolean win = false;


        //След това до получаване на команда "Retire" се четат многократно по два реда:
        //1.	Поле – текст ("Single", "Double" или "Triple")
        //2.	Точки – цяло число в интервала [0… 100]

        while (!"Retire".equals(field)) {
            int points = Integer.parseInt(scanner.nextLine());

            if ("Single".equals(field)) {
                points = points;
            } else if ("Double".equals(field)) {
                points *= 2;
            } else if ("Triple".equals(field)) {
                points *= 3;
            }

            if (points <= restPoints) {
                restPoints = restPoints - points;
                countSuccessful++;

                if (restPoints==0) {
                    win = true;
                    break;
                }
            } else {
                unsuccessfulCount++;
            }

            field = scanner.nextLine();

        }


        if (win) {
            System.out.printf("%s won the leg with %d shots.", name, countSuccessful);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", name, unsuccessfulCount);
        }

    }
}
