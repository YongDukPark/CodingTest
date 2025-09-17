package baekjoon.step5;

import java.util.Scanner;
import java.util.Arrays;

public class QN11720_숫자의_합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = Integer.valueOf(sc.nextLine());
        Integer[] list = Arrays.stream(sc.nextLine().split("")).map(Integer::valueOf).toArray(Integer[]::new);
        int answer = 0;

        for(int i = 0 ; i < count ; i++){
            answer = answer + list[i];
        }

        System.out.println(answer);
    }
}