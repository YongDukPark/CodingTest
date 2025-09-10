package baekjoon.step3;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class QN15552_빠른_A더하기B {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        try {
            int cnt = Integer.valueOf(br.readLine());
            for (int i = 1; i <= cnt; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.valueOf(st.nextToken());
                int b = Integer.valueOf(st.nextToken());
                sb.append(a + b).append("\n");
            }
            bw.write(sb.toString());
            bw.flush();
        } catch(IOException io){
            System.err.print(io);
        }
    }
}
