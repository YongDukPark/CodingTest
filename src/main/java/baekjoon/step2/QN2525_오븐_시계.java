package baekjoon.step2;

import java.util.Scanner;
import java.util.Arrays;

//2525 오븐시계
public class QN2525_오븐_시계 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        int minute = sc.nextInt();

        Integer[] numarr = Arrays.stream(time.split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
        numarr[1] = numarr[1] + minute;
        if(numarr[1] > 59){
            //초과 시간 재설정
            numarr[0] = numarr[0] + (numarr[1] / 60);
            //분 재설정
            numarr[1] = numarr[1] % 60;
        }
        if(numarr[0] > 23){
            numarr[0] = numarr[0] % 24;
        }

        System.out.println(numarr[0] + " " + numarr[1]);
    }
}
