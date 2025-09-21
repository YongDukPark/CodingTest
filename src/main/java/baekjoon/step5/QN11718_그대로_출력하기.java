package baekjoon.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class QN11718_그대로_출력하기 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        try{
            for(int i = 0 ; i < 3 ; i++){
                String text = br.readLine();
                if(text == null){
                    break;
                }

                sb.append(text).append("\n");
            }
            // \n을 1개로 인식함
            sb.deleteCharAt(sb.length() - 1);
 
            bw.write(sb.toString());
            bw.flush();
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
