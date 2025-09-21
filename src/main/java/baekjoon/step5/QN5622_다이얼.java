package baekjoon.step5;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;

public class QN5622_다이얼 {
    public static void main(String[] args){
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();
        int num = 65;
        int answer = 0;

        try{
            //알파벳의 시간을 적재하는 작업
            for(int i = 65 ; i < 65 + 26 ; i++){
                if(i >= 65 && i <= 67){
                    map.put((char)(i), 3);
                } else if (i >= 68 && i <= 70) {
                    map.put((char)(i), 4);
                } else if (i >= 71 && i <= 73) {
                    map.put((char)(i), 5);
                } else if (i >= 74 && i <= 76) {
                    map.put((char)(i), 6);
                } else if (i >= 77 && i <= 79) {
                    map.put((char)(i), 7);
                } else if (i >= 80 && i <= 83) {
                    map.put((char)(i), 8);
                } else if (i >= 84 && i <= 86) {
                    map.put((char)(i), 9);
                } else if (i >= 87 && i <= 90) {
                    map.put((char)(i), 10);
                } else if (i >= 91){
                    map.put((char)(i), 11);
                }
            }

            //읽어온 text를 배열에 담는 작업
            //String[] list = br.readLine().split("");
            char[] list = br.readLine().toCharArray();

            //시간을 계산하는 작업
            for(int i = 0 ; i < list.length ; i++){
                answer = answer + map.get(list[i]);
            }

            bw.write(String.valueOf(answer));
            bw.flush();
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}