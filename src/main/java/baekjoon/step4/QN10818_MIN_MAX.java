package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class QN10818_MIN_MAX {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int min = 0;
        int max = 0;

        try{
            int N = Integer.valueOf(br.readLine());

            Integer[] list = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

            min = list[0];
            max = list[0];
            for(int i = 1 ; i < N ; i++){
                if(list[i] < min){
                    min = list[i];
                }
                if(list[i] > max){
                    max = list[i];
                }
            }
            sb.append(min).append(" ").append(max);
            bw.write(sb.toString());
            bw.flush();
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
