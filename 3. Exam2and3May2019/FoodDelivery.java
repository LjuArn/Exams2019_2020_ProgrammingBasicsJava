package Exam2and3May2019;

import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//•	Брой пилешки менюта – цяло число в интервала [0… 99]
//•	Брой менюта с риба - цяло число в интервала [0… 99]
//•	Брой вегетариански менюта - цяло число в интервала [0… 99]

        int chiken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

        double spend = chiken * 10.35 + fish * 12.40 + vegan * 8.15;
        double allSpendFood = (spend * 1.2) + 2.50;

        System.out.printf("Total: %.2f", allSpendFood);



    }
}
