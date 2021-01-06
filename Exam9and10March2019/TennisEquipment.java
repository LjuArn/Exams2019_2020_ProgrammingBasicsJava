package Exam9an10March2019;

import java.util.Scanner;

public class TennisEquipment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Цена на една тенис ракета – реално число в интервала [0.00…100000.00]
        //•	Брой тенис ракети - цяло число в интервала [0…100]
        //•	Брой чифтове маратонки - цяло число в интервала [0…100]

        double priceRacket = Double.parseDouble(scanner.nextLine());
        int numberRacket = Integer.parseInt(scanner.nextLine());
        int numberTranners = Integer.parseInt(scanner.nextLine());

        double oneSpend = numberRacket * priceRacket;
        double twoSpend = (numberTranners * priceRacket)/6;
        double otherStuffPrice = (oneSpend + twoSpend) * 0.2;

        double allSpend = oneSpend + twoSpend + otherStuffPrice;


        double priceDjok = Math.floor(allSpend /8);
        double priceSposors = Math.ceil(allSpend * 7/8);

        System.out.printf("Price to be paid by Djokovic %.0f%n", priceDjok);
        System.out.printf("Price to be paid by sponsors %.0f", priceSposors );


        //•	"Price to be paid by Djokovic {1/8 от общата цена, закръглена към по-малкото цяло число}"
        //•	"Price to be paid by sponsors {7/8 от общата цена, закръглена към по-голямото цяло число}"


    }
}
