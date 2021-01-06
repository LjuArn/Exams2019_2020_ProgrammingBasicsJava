package Exam9an10March2019;

import java.util.Scanner;

public class FitnessCenter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int people = Integer.parseInt(scanner.nextLine());
    int countBack = 0;
    int countChest = 0;
    int countLegs = 0;
    int countAbs = 0;
    int countProteinShake = 0;
    int countProteinBar = 0;

    //•	За всеки един посетител на отделен ред – дейността във фитнеса
        // – текст ("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")

        for (int i = 1; i <=people ; i++) {
            String whatDo = scanner.nextLine();
            if ("Back".equals(whatDo)){
                countBack ++;
            }else if ("Chest".equals(whatDo)){
                countChest ++;
            }else if ("Legs".equals(whatDo)) {
                countLegs ++;
            }else if ("Abs".equals(whatDo)){
                countAbs ++;
            }else if("Protein shake".equals(whatDo)){
                countProteinShake ++;
            }else if("Protein bar".equals(whatDo)){
                countProteinBar ++;
            }

        }

        System.out.printf("%d - back%n", countBack);
        System.out.printf("%d - chest%n", countChest);
        System.out.printf("%d - legs%n", countLegs);
        System.out.printf("%d - abs%n", countAbs);
        System.out.printf("%d - protein shake%n", countProteinShake);
        System.out.printf("%d - protein bar%n", countProteinBar);

        int allPeople = countBack + countAbs + countChest + countLegs + countProteinShake + countProteinBar;
        double percentTrainPeople = (countBack + countAbs + countChest + countLegs) * 1.0 / allPeople * 100;
        int allDrinkPeople = countProteinBar + countProteinShake;
        double percentDrinkPeople = allDrinkPeople * 1.0 / allPeople * 100;

        System.out.printf("%.2f%% - work out%n", percentTrainPeople);
        System.out.printf("%.2f%% - protein", percentDrinkPeople);



    }
}
