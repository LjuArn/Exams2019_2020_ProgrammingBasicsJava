import java.util.Scanner;

public class CatFood {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberCat = Integer.parseInt(scanner.nextLine());

        int countFirstGrup = 0;
        int countSecondGrup = 0;
        int countThirdGrup = 0;
        double allFood = 0;

        for (int i = 1; i <= numberCat; i++) {
            double grFood = Double.parseDouble(scanner.nextLine());
            if (grFood >=100 && grFood < 200) {
                countFirstGrup++;
            } else if (grFood >= 200 && grFood < 300) {
                countSecondGrup++;
            } else if (grFood >= 300 && grFood < 400) {
                countThirdGrup++;
            }
            allFood = allFood + grFood;

        }
            double priceFood = allFood / 1000 * 12.45;

        //•	Ако котката изяжда от 100 (вкл.)  до 200 грама, то тя попада в група 1: малки котки.
        //•	Ако котката изяжда от 200 (вкл.)  до 300 грама, то тя попада в група 2: големи котки.
        //•	Ако котката изяжда от 300 (вкл.)  до 400 грама, то тя попада в група 3: огромни котки.


        System.out.printf("Group 1: %d cats.%n", countFirstGrup);
        System.out.printf("Group 2: %d cats.%n", countSecondGrup);
        System.out.printf("Group 3: %d cats.%n", countThirdGrup);
        System.out.printf("Price for food per day: %.2f lv.", priceFood);









    }
}
