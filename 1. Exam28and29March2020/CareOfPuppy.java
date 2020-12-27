package Exam28and29March2020;

import java.util.Scanner;

public class CareOfPuppy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



//•	Закупеното количество храна за кученцето в килограми – цяло число в интервала [1 …100]
//•	На всеки следващ ред до получаване на команда Adopted ще получавате колко грама изяжда
// кученцето на всяко хранене - цяло число в интервала [10 …1000]
        int allKgFood = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int allEatenFood = 0;

        while (!"Adopted".equals(input)){
        int grFood = Integer.parseInt(input);
        allEatenFood += grFood;
            input = scanner.nextLine();
        }
        int allGrFood = allKgFood * 1000;
        if (allGrFood >= allEatenFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", allGrFood - allEatenFood);
        }else if(allEatenFood > allGrFood){
            System.out.printf("Food is not enough. You need %d grams more.", allEatenFood - allGrFood);

        }



        //•	Ако количеството храна е достатъчно да се отпечата:
        // 	"Food is enough! Leftovers: {останала храна} grams."
        //•	Ако количеството храна не е достатъчно да се отпечата:
        // 	"Food is not enough. You need {нужно количество храна} grams more."
    }
}
