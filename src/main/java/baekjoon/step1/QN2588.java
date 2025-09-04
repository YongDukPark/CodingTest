package baekjoon.step1;

import java.util.*;

//2588 곱셈
public class QN2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstnum = sc.nextInt();
        int lastnum = sc.nextInt();
        String laststrnum = String.valueOf(lastnum);

        String[] strArr = laststrnum.split("");
        Integer[] num2 = Arrays.stream(strArr).map(Integer::valueOf).toArray(Integer[]::new);

        int[] number = {num2[2], num2[1], num2[0]};

        System.out.println(firstnum * number[0]);
        System.out.println(firstnum * number[1]);
        System.out.println(firstnum * number[2]);
        System.out.println(firstnum * lastnum);
    }
}
