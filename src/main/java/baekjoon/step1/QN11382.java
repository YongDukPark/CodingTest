package baekjoon.step1;

import java.util.Scanner;

public class QN11382 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        //77 77 7777 3개를 입력받음
        //주어지는 값이 10의 12제곱 이니 백억단위로 들어오는데
        //Int 자료형의 최대 수는 21억이므로 Long을 사용
        Long long1 = sc.nextLong();
        Long long2 = sc.nextLong();
        Long long3 = sc.nextLong();

        System.out.println(long1 + long2 + long3);
    }
}
