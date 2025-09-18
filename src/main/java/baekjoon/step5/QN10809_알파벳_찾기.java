package baekjoon.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;

public class QN10809_알파벳_찾기 {
    public static void main(String[] args){
        //예제가 단 1개라 이렇게 진행해봄
        //Scanner sc = new Scanner(System.in); < 쓰지마세요 성능차이가 많이 심합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Character[] ch = new Character[26];
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        try{
            String text = br.readLine();

            //모든 알파벳을 HashSet 에 넣는 로직
            for(int i = 0 ; i < 26 ; i++){
                ch[i] = (char)(i+97);
            }

            //검증을 위한 데이터 구성
            for(int i = 0 ; i < text.length() ; i++){
                set.add(text.charAt(i));
            }

            //검증 진행
            for(int i = 0 ; i < ch.length ; i++){
                sb.append(text.indexOf(ch[i]));
                if(i != ch.length-1){
                    sb.append(" ");
                }
            }

            bw.write(sb.toString());
            bw.flush();
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
