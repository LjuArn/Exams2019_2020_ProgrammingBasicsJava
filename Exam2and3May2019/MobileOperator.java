package Exam2and3May2019;

import java.util.Scanner;

public class MobileOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1.	Срок на договор – текст – "one", или "two"
        //2.	Тип на договор – текст – "Small",  "Middle", "Large"или "ExtraLarge"
        //3.	Добавен мобилен интернет – текст – "yes" или "no"
        //4.	Брой месеци за плащане - цяло число в интервала [1 … 24]

        String period = scanner.nextLine();
        String pact = scanner.nextLine();
        String mobailINet = scanner.nextLine();
        int numberMonth = Integer.parseInt(scanner.nextLine());
        double prece = 0.0;
        boolean flag = false;

        if ("one".equals(period)) {
            switch (pact) {
                case "Small":
                    prece = 9.98;
                    break;
                case "Middle":
                    prece = 18.99;
                    break;
                case "Large":
                    prece = 25.98;
                    break;
                case "ExtraLarge":
                    prece = 35.99;
                    break;
            }
        } else if ("two".equals(period)) {

            switch (pact) {
                case "Small":
                    prece = 8.58;
                    break;
                case "Middle":
                    prece = 17.09;
                    break;
                case "Large":
                    prece = 23.59;
                    break;
                case "ExtraLarge":
                    prece = 31.79;
                    break;
            }
        flag = true;
        }

        if ("yes".equals(mobailINet)) {
            if (prece <= 10) {
                prece += 5.50;
            } else if (prece <= 30) {
                prece += 4.35;
            } else {
                prece += 3.85;
            }
        }
        if (flag){
            prece = prece * (1 - 0.0375);
        }

        System.out.printf("%.2f lv.", prece * numberMonth);
    }
}
