package baekjoon.step2;

import java.util.Scanner;

public class QN2480_주사위_세개 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int max = 0;

        //3개다 다를경우
        if (dice1 != dice2 && dice1 != dice3 && dice2 != dice3) {
            // 1번 > 2번일 경우
            if (dice1 > dice2) {
                if (dice1 > dice3) {    // 1번 > 3번 즉 1번이 가장 클 경우
                    max = dice1;
                } else {    // 3번 > 1번 즉 3번이 가장 클 경우
                    max = dice3;
                }
            } else {    // 2번 > 1번일 경우
                if (dice2 < dice3) {    // 2번 < 3번일 경우
                    max = dice3;
                } else {    // 3번 < 2번일 경우
                    max = dice2;
                }
            }
            System.out.println(max * 100);
        } else {    // 2개 이상이 같을 경우
            // 3개가 모두 같을 경우
            if (dice1 == dice2 && dice1 == dice3) {
                System.out.println(10000 + (dice1 * 1000));
            } else {    // 2개 이상이 같은경우
                // 1번과 2번이 같거나 1번과 3번이 같을경우
                if (dice1 == dice2 || dice1 == dice3) {
                    System.out.println(1000 + (dice1 * 100));
                } else {    // 2번과 3번이 같은 경우
                    System.out.println(1000 + (dice2 * 100));
                }
            }
        }
    }
}
