package baekjoon.step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class QN10988_팰린드롬인지_확인하기 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        try{
            String text = br.readLine();

            // 짝수일경우 절반만 비교
            if(text.length()%2 == 0){
                //텍스트 뒤에 절반 가져오기
                sb.append(text.substring(text.length() / 2,  text.length()));
                //텍스트 뒤집기
                sb.reverse();

                //예를 들어 text가 noon 일경우 index 0~1 과 index 2~3 을 reverse한 값을 비교
                //같을경우 1 아닐경우 0
                if(text.substring(0, text.length() / 2).equals(sb.toString())){
                    bw.write("1");
                } else {
                    bw.write("0");
                }
            } else {
                //텍스트 뒤에 절반 가져오는데 길이가 3일경우 index 2부터 가져오기
                sb.append(text.substring((text.length() / 2) + 1,  text.length()));
                //텍스트 뒤집기
                sb.reverse();

                //예를 들어 text가 nooon 일경우 index 0~2 과 index 2~3 을 reverse한 값을 비교
                //한마디로 텍스트가 홀수일경우 index 중앙의 값은 필요가없음
                //같을경우 1 아닐경우 0
                if(text.substring(0, text.length() / 2).equals(sb.toString())){
                    bw.write("1");
                } else {
                    bw.write("0");
                }
            }
            bw.flush();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}