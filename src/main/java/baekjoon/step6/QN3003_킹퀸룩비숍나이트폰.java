package baekjoon.step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class QN3003_킹퀸룩비숍나이트폰 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Integer[] list1 = {1, 1, 2, 2, 2, 8};
        Integer[] list2 = null;

        try{
            list2 = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

            for(int i = 0 ; i < 6 ; i++){
                sb.append(list1[i] - list2[i]);
                if((i < 5)){
                    sb.append(" ");
                }
            }

            bw.write(sb.toString());
            bw.flush();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}