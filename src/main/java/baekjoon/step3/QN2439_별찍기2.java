package baekjoon.step3;

import java.io.*;

public class QN2439_별찍기2 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        try{
            int count = Integer.valueOf(br.readLine());

            for(int i = 1 ; i <= count ; i++){
                for (int j = count ; j > 0 ; j--) {
                    if(j <= i){
                        sb.append("*");
                    } else {
                        sb.append(" ");
                    }
                }
                if(i == count){
                    break;
                } else {
                    sb.append("\n");
                }
            }
            bw.write(sb.toString());
            bw.flush();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
