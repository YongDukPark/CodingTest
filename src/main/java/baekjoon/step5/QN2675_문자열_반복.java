package baekjoon.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class QN2675_문자열_반복 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        try{
            // 문제중 S 열의 갯수
            int count = Integer.valueOf(br.readLine());

            // 테스트 케이스 개수만큼 반복
            for(int i = 0 ; i < count ; i++){
                st = new StringTokenizer(br.readLine());
                int loop = Integer.valueOf(st.nextToken());
                String text = st.nextToken();

                // 문자의 각각 Character를 loop 수만큼 반복하는 로직
                for(int j = 0 ; j < text.length() ; j++){
                    for(int k = 0 ; k < loop ; k++){
                        sb.append(text.charAt(j));
                    }
                }
                sb.append("\n");
            }
            bw.write(sb.toString());
            bw.flush();
        } catch(IOException ex){
            System.err.println(ex);
        }

    }
}
