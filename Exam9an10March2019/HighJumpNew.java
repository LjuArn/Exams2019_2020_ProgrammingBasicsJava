package Exam9an10March2019;

import java.util.Scanner;

public class HighJumpNew {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int dezirteHihgJump = Integer.parseInt(scanner.nextLine());
        int jump = Integer.parseInt(scanner.nextLine());
        int beginHighJump = dezirteHihgJump - 30;
        int countAllJumps = 1;
        int countNotJump = 0;
        boolean notSucess = false;

        while (jump <= dezirteHihgJump) {

            if (jump > beginHighJump) {
                beginHighJump = beginHighJump + 5;
                countNotJump = 0;
            } else {
                countNotJump++;
                if (countNotJump == 3) {
                    notSucess = true;
                    break;
                }
            }

            jump = Integer.parseInt(scanner.nextLine());
            countAllJumps++;

        }

        if (notSucess) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.", beginHighJump, countAllJumps);
        }
        else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", beginHighJump, countAllJumps);
        }
    }
}
