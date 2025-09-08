package baekjoon.step2;

import java.util.Scanner;

public class QN2884_알람_시계 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int tempMinute = 0;

        String answer = "";
        // 분이 시에 영향을 끼칠경우
        if(minute < 45) {
            if (hour == 0) {
                hour = 23;
                tempMinute = minute - 45;
                minute = 60 - Math.abs(tempMinute);
            } else {
                hour = hour - 1;
                tempMinute = minute - 45;
                minute = 60 - Math.abs(tempMinute);
            }
        } else {
            minute = minute - 45;
        }

        System.out.println(hour + " " + minute);
    }
}
