package baekjoon.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class QN2908_상수 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        String strA = null;
        String strB = null;
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();
        int numA = 0;
        int numB = 0;

        try{
            st = new StringTokenizer(br.readLine());
            strA = st.nextToken();
            sbA.append(strA.charAt(2)).append(strA.charAt(1)).append(strA.charAt(0));
            numA = Integer.valueOf(sbA.toString());

            strB = st.nextToken();
            sbB.append(strB.charAt(2)).append(strB.charAt(1)).append(strB.charAt(0));
            numB = Integer.valueOf(sbB.toString());

            if(numA > numB){
                bw.write(String.valueOf(numA));
            } else {
                bw.write(String.valueOf(numB));
            }
            bw.flush();

        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}