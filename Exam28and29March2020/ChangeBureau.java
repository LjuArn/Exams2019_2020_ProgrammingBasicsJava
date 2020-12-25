package Exam28and29March2020;

import java.util.Scanner;

public class ChangeBureau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // •	На първия ред – броят биткойни. Цяло число в интервала [0…20]
        //•	На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
        //•	На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinaJuana = Double.parseDouble(scanner.nextLine());
        double comision = Double.parseDouble(scanner.nextLine());

        double money = (bitcoin * 1168 + chinaJuana * 0.15 * 1.76) / 1.95;

        double income = money * ( 1 - comision / 100);

        System.out.printf("%.2f",income);
    }
}
