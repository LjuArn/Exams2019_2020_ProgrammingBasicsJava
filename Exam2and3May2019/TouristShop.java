package Exam2and3May2019;

import java.util.Scanner;

public class TouristShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//•	На първи ред – бюджетът - реално число в интервала [1.00… 100000.00]
//•	След това поредица от два реда (до получаване на команда "Stop" или при заявка за купуване на продукт, чиято стойност е по-висока от наличния бюджет) :
//o	Име на продукта – текст
//o	Цена на продукта – реално число в интервала [1.00… 5000.00]

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double spend = 0.0;
        boolean noToBuy = false;
        int countProduct = 0;

        while (!"Stop".equals(input)) {
            double priceProduct = Double.parseDouble(scanner.nextLine());

            countProduct++;
            if (countProduct % 3 == 0) {
                priceProduct = priceProduct * 0.5;
            }

            spend = spend + priceProduct;
            if (budget < spend) {
                countProduct--;
                noToBuy = true;
                break;
            }

            input = scanner.nextLine();
        }

//•	При получаване на командата "Stop", на един ред:
//o	"You bought {брой на закупените продукти} products for {цена на покупките} leva."
//•	При заявка за покупка на продукт, чиято цена е по-висока от останалите пари, на два реда:
//o	"You don't have enough money!"
//o	"You need {недостигащи пари} leva!"

        if (noToBuy) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", spend - budget);
        } else {

            System.out.printf("You bought %d products for %.2f leva.", countProduct, spend);

        }


    }
}
