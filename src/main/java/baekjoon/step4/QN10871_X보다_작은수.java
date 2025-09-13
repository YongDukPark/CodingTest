package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class QN10871_X보다_작은수 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        try{
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arraySize = Integer.valueOf(st.nextToken());
            int diffNumber = Integer.valueOf(st.nextToken());

            Integer[] array = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
            for(int i = 0 ; i < arraySize ; i++){
                if(array[i] < diffNumber){
                    sb.append(array[i]).append(" ");
                }
            }
            //마지막 공백 제거
            sb.delete(sb.length()-1, sb.length());

            bw.write(sb.toString());
            bw.flush();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}