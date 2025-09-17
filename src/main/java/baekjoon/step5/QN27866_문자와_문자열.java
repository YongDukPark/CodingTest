package baekjoon.step5;



import java.util.Scanner;

public class QN27866_문자와_문자열 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int index = sc.nextInt();

        System.out.println(text.charAt(index-1));
    }
}
