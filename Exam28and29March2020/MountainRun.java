package Exam28and29March2020;

import java.util.Scanner;

public class MountainRun {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //1.	Рекордът в секунди – реално число в интервала [0.00 … 100000.00]
        //2.	Разстоянието в метри – реално число в интервала [0.00 … 100000.00]
        //3.	Времето в секунди, за което изкачва 1 м. – реално число в интервала [0.00 … 1000.00]

        double record = Double.parseDouble(scanner.nextLine());
        double metersDestination = Double.parseDouble(scanner.nextLine());
        double timePerSecond = Double.parseDouble(scanner.nextLine());



        double timeClimb = metersDestination * timePerSecond;
        double allTime = timeClimb + Math.floor(metersDestination / 50) * 30;





        if (allTime < record){
            System.out.printf("Yes! The new record is %.2f seconds.", allTime);
        } else {
            System.out.printf("No! He was %.2f seconds slower.",  allTime - record);
        }






        //•	Ако Георги е подобрил рекорда отпечатваме:
        //o	" "
        //•	Ако НЕ е подобрил рекорда отпечатваме:
        //o	""
    }
}
