package baekjoon.step3;

import java.util.Scanner;

public class QN2739_구구단 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1 ; i <= 9 ; i++) {
            System.out.printf("%s * %s = %s\n", String.valueOf(number), String.valueOf(i), String.valueOf(number*i));
        }
    }
}
