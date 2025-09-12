package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class QN10951_A더하기B_4타입 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        String checkValue = null;

        try{
            while(true){
                checkValue = br.readLine();
                if(checkValue != null) {
                    st = new StringTokenizer(checkValue);
                    int A = Integer.valueOf(st.nextToken());
                    int B = Integer.valueOf(st.nextToken());
                    sb.append(A+B).append("\n");
                } else {
                    break;
                }
            }
            bw.write(sb.toString());
            bw.flush();
        } catch (IOException ex){
            System.err.println(ex);
        }
    }
}
