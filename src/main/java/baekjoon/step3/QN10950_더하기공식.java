package baekjoon.step3;

import java.util.ArrayList;
import java.util.Scanner;

public class QN10950_더하기공식 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> list = new ArrayList<String[]>();
        // 입력받을때 nextInt로 할경우 숫자만 입력받고 \n은 버퍼에 남겨놓음 그러하여 버퍼를 비워줘야함
        int t = Integer.valueOf(sc.nextLine());

        for (int i = 0 ; i < t ; i++) {
            list.add(sc.nextLine().split(" "));
        }

        for (int i = 0 ; i < list.size() ; i++) {
            System.out.printf("%s\n",
                    Integer.valueOf(list.get(i)[0]) + Integer.valueOf(list.get(i)[1]));
        }
    }
}
