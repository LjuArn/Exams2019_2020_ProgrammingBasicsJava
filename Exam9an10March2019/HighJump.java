package Exam9an10March2019;

import java.util.Scanner;

public class HighJump {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int highJump = Integer.parseInt(scanner.nextLine());
        int unsucessfulJumpCount1 = 0;
        int unsucessfulJumpCount2 = 0;
        int unsucessfulJumpCount3 = 0;
        int unsucessfulJumpCount4 = 0;


        for (int i = 1; i <= 3; i++) {

            int jump = Integer.parseInt(scanner.nextLine());

            if (jump > highJump - 30) {

                for (int j = 1; j <= 3; j++) {

                    jump = Integer.parseInt(scanner.nextLine());

                    if (jump > highJump - 25) {

                        for (int k = 1; k <= 3; k++) {
                            jump = Integer.parseInt(scanner.nextLine());

                            if (jump > highJump - 20) {


                                for (int l = 1; l <= 3; l++) {
                                    jump = Integer.parseInt(scanner.nextLine());

                                    if (jump > highJump - 15) {

                                        for (int m = 1; m <=3; m++) {

                                        }
                                    }

                                    unsucessfulJumpCount4++;
                                    if (unsucessfulJumpCount4 == 3) {
                                        break;
                                    }


                                }
                            }

                            unsucessfulJumpCount3++;
                            if (unsucessfulJumpCount3 == 3) {
                                break;
                            }


                        }


                    }
                    unsucessfulJumpCount2++;
                    if (unsucessfulJumpCount2 == 3) {
                        break;

                    }


                }

                unsucessfulJumpCount1++;
                if (unsucessfulJumpCount1 == 3) {
                    break;
                }
            }


        }

    }
}