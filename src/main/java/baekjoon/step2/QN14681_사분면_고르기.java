package baekjoon.step2;

import java.util.Scanner;

//14681 사분면 고르기
public class QN14681_사분면_고르기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int answer = 0;

        //x 양수
        if (x > 0) {
            //y 양수
            if (y > 0) {
                answer = 1;
            } else {    //y는 음수
                answer = 4;
            }
        } else if (x < 0) {    //x 음수
            //y 양수
            if (y > 0) {
                answer = 2;
            } else {    //y는 음수
                answer = 3;
            }
        }
        //출력
        System.out.println(answer);
    }
}
