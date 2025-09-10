package baekjoon.step3;

import java.util.Scanner;

public class QN25314_코딩은_체육과목_입니다 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ncnt = 0;
        StringBuffer answer = new StringBuffer();

        ncnt = N / 4;

        for (int i = 0 ; i < ncnt ; i++) {
            answer.append("long ");
        }
        answer.append("int");

        System.out.println(answer.toString());
    }
}