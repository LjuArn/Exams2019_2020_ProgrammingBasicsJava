package Exam2and3May2019;

import java.util.Scanner;

public class Safari {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//От конзолата се четат 3 реда:
//•	Бюджет – реално число в интервала [0.00… 10000.00]
//•	Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
//•	Ден от седмицата – текст с възможности "Saturday" и "Sunday"

       double budget = Double.parseDouble(scanner.nextLine());
       double literOil = Double.parseDouble(scanner.nextLine());
       String day = scanner.nextLine();

        double spend = literOil * 2.1 + 100;
        if ("Saturday".equals(day)){
            spend *= (1-0.1);
        } else if ("Sunday".equals(day)){
            spend *= (1-0.2);
        }

        String output = "";
        if (budget >= spend){
            output = String.format("Safari time! Money left: %.2f lv.", budget - spend);
        }else {
            output = String.format("Not enough money! Money needed: %.2f lv.", spend - budget);
        }

        System.out.println(output);
    }
}
