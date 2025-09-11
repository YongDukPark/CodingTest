package baekjoon.step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class QN11021_A더하기B_7타입{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        try{
            int count = Integer.valueOf(br.readLine());

            for(int i = 0 ; i < count ; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.valueOf(st.nextToken());
                int b = Integer.valueOf(st.nextToken());
                sb.append("Case #").append(i+1).append(": ").append(a+b).append("\n");
            }

            bw.write(sb.toString());
            bw.flush();
        } catch(IOException io){
            System.err.println(io);
        }
    }
}