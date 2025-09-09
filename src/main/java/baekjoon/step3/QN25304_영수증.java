package baekjoon.step3;

import java.util.Scanner;

public class QN25304_영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();
        int confirm = 0;

        for (int i = 0; i < count; i++) {
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            confirm = confirm + (price * cnt);
        }

        if (total == confirm) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}