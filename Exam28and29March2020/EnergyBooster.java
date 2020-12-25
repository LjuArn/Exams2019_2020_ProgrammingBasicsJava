package Exam28and29March2020;

import java.util.Scanner;

public class EnergyBooster {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1.	Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
        //2.	Размерът на сета - текст с възможности: "small" или "big"
        //3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]


        String food = scanner.nextLine();
        String set = scanner.nextLine();
        int numberSet = Integer.parseInt(scanner.nextLine());
        double pay = 0.0;
        double allPay = 0.0;

        if ("Watermelon".equals(food)) {
            if ("small".equals(set)) {
                pay = numberSet * 56 * 2;
            } else {
                pay = numberSet * 28.70 * 5;
            }
        } else if ("Mango".equals(food)) {
            if ("small".equals(set)) {
                pay = numberSet * 36.66 * 2;
            } else {
                pay = numberSet * 19.60 * 5;
            }
        } else if ("Pineapple".equals(food)) {
            if ("small".equals(set)) {
                pay = numberSet * 42.1 * 2;
            } else {
                pay = numberSet * 24.80 * 5;
            }
        } else if ("Raspberry".equals(food)) {
            if ("small".equals(set)) {
                pay = numberSet * 20 * 2;
            } else {
                pay = numberSet * 15.20 * 5;
            }
        }

        if (pay < 400){
            allPay = pay;
        }else if ( pay <= 1000) {
            allPay = pay * (1 - 0.15);
        }else if (pay > 1000) {
            allPay = pay * (1 - 0.5);
        }

        //При поръчки:
        //•	от 400 лв. до 1000 лв. включително има 15% отстъпка
        //•	над 1000 лв. има 50% отстъпка

        System.out.printf("%.2f lv.",allPay);
    }
}
