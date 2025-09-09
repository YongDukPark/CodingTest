package baekjoon.step3;

import java.util.Scanner;

public class QN8393_합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int num = sc.nextInt();

        for (int i = 1 ; i <= num ; i++) {
            answer = answer + i;
        }

        System.out.println(answer);
    }
}
