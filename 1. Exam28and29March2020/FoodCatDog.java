package Exam28and29March2020;

import java.util.Scanner;

public class FoodCatDog {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        //Първоначално се чете един ред:
        //•	Брой дни – цяло число в диапазона [1…30]
        //•	Общо количество храна – реално число в диапазона [0.00…10000.00]
        //След това за всеки ден се чете:
        //o	Количество изядена храна от кучето – цяло число в диапазона [10…500]
        //o	Количество изядена храна от котката – цяло число в диапазона [10…500]

        int days = Integer.parseInt(scanner.nextLine());
        double allMyFood = Double.parseDouble(scanner.nextLine());
        int dayCount = 0;
        double biscuit = 0.0;
        double allBiscuit = 0.0;
        int allDogFood = 0;
        int allCatFood = 0;
        int allFood = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            int allFoodDay = dogFood + catFood;
            dayCount++;
            if (dayCount % 3 == 0) {
                biscuit = allFoodDay * 0.1;
                allBiscuit = allBiscuit + biscuit;
            }

            allDogFood = allDogFood + dogFood;
            allCatFood = allCatFood + catFood;
            allFood = allFood + allFoodDay;

        }
        double percentEatenFood = allFood * 1.0 / allMyFood * 100;
        double percentEatenDog = allDogFood * 1.0/ allFood * 100;
        double percentEatenCat = allCatFood * 1.0/ allFood * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", allBiscuit);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentEatenCat);

        //•	"Total eaten biscuits: {количество изядени бисквитки}gr."
        //•	"{процент изядена храна}% of the food has been eaten."
        //•	"{процент изядена храна от кучето}% eaten from the dog."
        //•	"{процент изядена храна от котката}% eaten from the cat."
        //Количеството изядени бисквитки трябва да бъде закръглено до най – близкото цяло число,
        // а процентът храна
        // трябва да бъде форматиран до втората цифра след десетичния знак.



    }
}
