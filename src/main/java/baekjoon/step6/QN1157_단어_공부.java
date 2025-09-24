package baekjoon.step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;

public class QN1157_단어_공부 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char answer = ' ';
        int max = 0;
        boolean checkDuplicate = false;
        HashMap<Character, Integer> map = new HashMap<>();

        try{
            //대소문자 구분 안한다 했으니 어차피 출력 문자인 대문자로
            String text = br.readLine().toUpperCase();

            //기존에 있는 알파벳은 +1 시키고 알파벳당 갯수 추가
            for(int i = 0 ; i < text.length() ; i++){
                if(map.containsKey(text.charAt(i))){
                    map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
                } else {
                    map.put(text.charAt(i), 1);
                }
            }

            for(char key : map.keySet()){
                //max값이 기존꺼보다 더 높을경우
                //중복 상태 false, answer에 알파벳 넣고, 이후 max값 비교를 위해 max값 적재
                if(map.get(key) > max){
                    checkDuplicate = false;
                    answer = key;
                    max = map.get(key);
                } else if (map.get(key) == max) {
                    checkDuplicate = true;
                }
            }

            //중복일경우 ? 출력
            if(checkDuplicate){
                bw.write("?");
            } else {
                bw.write(answer);
            }
            bw.flush();

        }catch(IOException ex){
            System.err.println(ex);
        }

    }
}