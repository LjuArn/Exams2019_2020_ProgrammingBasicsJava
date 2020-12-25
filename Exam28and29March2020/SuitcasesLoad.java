package Exam28and29March2020;

import java.util.Scanner;

public class SuitcasesLoad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//Първоначално се чете един ред:
//•	Капацитетът на багажника – реално число в диапазона [100.0…6000.0]
//След това до получаване на команда "End" или до запълване на багажника, се чете по един ред:
//o	Обем на куфар – реално число в диапазона [100.0…6000.0]

        double volume = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double allVolumeCase = 0.0;
        int countsuitCase = 0;
        int countBagajeSuitcase = 0;
        boolean suitcase = false;


        while (!"End".equals(input)) {
            double volumeCase = Double.parseDouble(input);
            countsuitCase++;
            if (countsuitCase % 3 == 0) {
                volumeCase = volumeCase * 1.1;
            }
            allVolumeCase = allVolumeCase + volumeCase;

            if (volume - allVolumeCase < 0) {
                suitcase = true;
                break;
            }
            countBagajeSuitcase++;
            input = scanner.nextLine();
        }

        String output ="";

        if (suitcase) {
            output = String.format("No more space!");
        } else {
            output = String.format("Congratulations! All suitcases are loaded!");
        }

        System.out.println(output);
        System.out.printf("Statistic: %d suitcases loaded.", countBagajeSuitcase);
        //•	При получаване на командата "End" се печата:
        //"Congratulations! All suitcases are loaded!"
        //•	Ако обемът на куфара е по-голям от оставащото пространство в багажника:
        //"No more space!"
        //•	Накрая винаги се отпечатва статистика – колко багажа са натоварени:
        //"Statistic: {брой натоварени багажи} suitcases loaded."


    }
}
