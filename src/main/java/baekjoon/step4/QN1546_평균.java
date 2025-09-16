package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class QN1546_평균 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double Max = 0;
        double answer = 0;
        int N = 0;

        try{
            //과목 개수
            N = Integer.valueOf(br.readLine());
            ArrayList<Double> list = new ArrayList<>();

            //과목별 점수
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < N ; i++){
                list.add(Double.valueOf(st.nextToken()));
            }

            //점수 오름차순 정렬
            Collections.sort(list);
            //과목 최대값
            Max = list.get(list.size()-1);

            //점수 합하기
            for(int i = 0 ; i < N ; i++){
                answer = answer + (list.get(i)/Max*100);
            }

            //평균값 데이터 출력
            bw.write(String.valueOf(answer/N));
            bw.flush();
        } catch(IOException ex) {
            System.err.println(ex);
        }
    }
}