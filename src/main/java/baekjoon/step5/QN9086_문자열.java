package baekjoon.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class QN9086_문자열 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String text = null;

        try{
            int count = Integer.valueOf(br.readLine());

            for (int i = 0 ; i < count ; i++) {
                text = br.readLine();
                sb.append(text.charAt(0)).append(text.charAt(text.length()-1));

                if(i != count-1){
                    sb.append("\n");
                }
            }

            bw.write(sb.toString());
            bw.flush();
        }catch(IOException ex){
            System.err.println(ex);
        }

    }
}