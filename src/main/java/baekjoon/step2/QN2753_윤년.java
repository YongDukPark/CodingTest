package baekjoon.step2;

import java.util.Scanner;

//2753 윤년
public class QN2753_윤년 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int year = sc.nextInt();

        // 데이터 삽입
        if(year % 4 == 0){
            // 100 이상
            if (year >= 100) {
                // 100의 배수일 경우
                if(year % 100 == 0 ){
                    // 400의 배수일경우 1 아닐경우 0
                    answer = year % 400 == 0 ?  1 : 0;
                } else {
                    answer = 1;
                }
            } else {
                answer = 1;
            }
        } else {
            answer = 0;
        }

        // 출력 영역
        System.out.println(answer);
    }
}

