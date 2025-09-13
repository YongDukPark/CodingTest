package baekjoon.step4;


import java.io.*;
import java.util.Arrays;

public class QN10807_개수_세기 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;

        try {
            int N = Integer.valueOf(br.readLine());
            Integer[] numlist= Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
            int checkValue = Integer.valueOf(br.readLine());

            for(int num : numlist){
                if (checkValue == num) {
                    count++;
                }
            }

            bw.write(String.valueOf(count));
            bw.flush();
        } catch(IOException ex) {
            System.err.println(ex);
        }
    }
}
