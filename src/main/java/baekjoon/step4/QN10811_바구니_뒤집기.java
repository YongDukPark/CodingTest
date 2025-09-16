package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.List;

public class QN10811_바구니_뒤집기{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = 0;
        int M = 0;
        int start = 0;
        int end = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = null;

        try{
            st = new StringTokenizer(br.readLine());
            N = Integer.valueOf(st.nextToken());
            M = Integer.valueOf(st.nextToken());

            //바구니 생성
            for(int i = 1 ; i <= N ; i++){
                list.add(i);
            }

            //입력받은값 실행
            while (true){
                String readLine = br.readLine();
                if(readLine == null){
                    break;
                }
                st = new StringTokenizer(readLine);
                start = Integer.valueOf(st.nextToken());
                end = Integer.valueOf(st.nextToken());

                //데이터 교체
                //ex 1~3 는 list[0] ~ list[2] 데이터를 역순으로 교체
                List<Integer> subList = list.subList(start-1, end);
                Collections.reverse(subList);
            }

            for(int i = 0 ; i < list.size() ; i++){
                sb.append(list.get(i));
                if(i != list.size()-1){
                    sb.append(" ");
                }
            }

            bw.write(sb.toString());
            bw.flush();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}