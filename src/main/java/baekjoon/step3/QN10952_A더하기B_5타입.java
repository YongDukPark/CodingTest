package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class QN10952_A더하기B_5타입{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        try{
            while(true){
                st = new StringTokenizer(br.readLine());
                int A = Integer.valueOf(st.nextToken());
                int B = Integer.valueOf(st.nextToken());

                if (A == 0) {
                    break;
                } else {
                    sb.append(A+B).append("\n");
                }
            }
            bw.write(sb.toString());
            bw.flush();
        } catch (IOException ex){
            System.err.println(ex);
        }
    }
}