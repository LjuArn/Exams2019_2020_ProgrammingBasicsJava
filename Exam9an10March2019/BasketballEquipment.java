package Exam9an10March2019;

import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
//•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
//•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
//•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int taxForYear = Integer.parseInt(scanner.nextLine());

        double priceBoot = taxForYear * (1 - 0.4);
        double priceClothes = priceBoot * (1 - 0.2);
        double priceBall = priceClothes / 4 ;
        double priceAsesoary = priceBall /5;

        double spend = taxForYear + priceBoot + priceClothes + priceBall + priceAsesoary;

        System.out.printf("%.2f", spend);

    }
}
