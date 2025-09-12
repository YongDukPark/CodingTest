package baekjoon.step3;

import java.io.*;

public class QN2438_별찍기 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        try{
            int count = Integer.valueOf(br.readLine());

            for(int i = 0 ; i < count ; i++){
                for(int j = 0 ; j <= i ; j++) {
                    sb.append("*");
                }
                if(i == count-1){
                    break;
                } else {
                    sb.append("\n");
                }
            }

            bw.write(sb.toString());
            bw.flush();
        } catch(IOException ex) {
            System.err.println(ex);
        }
    }
}
