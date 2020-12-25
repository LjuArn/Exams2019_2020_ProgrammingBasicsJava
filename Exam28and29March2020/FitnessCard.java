package Exam28and29March2020;

import java.util.Scanner;

public class FitnessCard {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	Сумата, с която разполагаме - реално число в интервала [10.00…1000.00]
        //•	Пол - символ ('m' за мъж и 'f' за жена)
        //•	Възраст - цяло число в интервала [5…105]
        //•	Спорт - текст (една от възможностите в таблицата)


        double myMoney = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int ages = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double tax = 0.0;


        //Пол	Gym	Boxing	Yoga	Zumba	Dances	Pilates
        //мъж	$42	$41	$45	$34	$51	$39
        //жена	$35	$37	$42	$31	$53	$37


        if ("Gym".equals(sport)) {
            if ('m' == gender) {
                tax = 42;
            } else {
                tax = 35;
            }
        } else if ("Boxing".equals(sport)) {
            if ('m' == gender) {
                tax = 41;
            } else {
                tax = 37;
            }
        } else if ("Yoga".equals(sport)) {
            if ('m' == gender) {
                tax = 45;
            } else {
                tax = 42;
            }
        } else if ("Zumba".equals(sport)) {
            if ('m' == gender) {
                tax = 34;
            } else {
                tax = 31;
            }
        } else if ("Dances".equals(sport)) {
            if ('m' == gender) {
                tax = 51;
            } else {
                tax = 53;
            }
        } else if ("Pilates".equals(sport)) {
            if ('m' == gender) {
                tax = 39;
            } else {
                tax = 37;
            }
        }

        if (ages <= 19){
            tax = tax * 0.8;
        }else {
            tax = tax;
        }

    if (myMoney > tax){
        System.out.printf("You purchased a 1 month pass for %s.", sport);
    } else {
        System.out.printf("You don't have enough money! You need $%.2f more.", tax - myMoney);
    }



    }
}
