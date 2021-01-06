package Exam9an10March2019;

import java.util.Scanner;

public class FootballResults2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int weWon = 0;
        int theyWon = 0;
        int equal = 0;


        for (int i = 1; i <= 3; i++) {
            String game = scanner.nextLine();
            char ourResult = game.charAt(0);
            char hisResult = game.charAt(2);



            if (ourResult > hisResult){
                weWon++;
            }else if (ourResult < hisResult){
                theyWon++;
            } else {
                equal++;
            }


        }


        System.out.printf("Team won %d games.%n", weWon);
        System.out.printf("Team lost %d games.%n", theyWon);
        System.out.printf("Drawn games: %d", equal);


    }
}
