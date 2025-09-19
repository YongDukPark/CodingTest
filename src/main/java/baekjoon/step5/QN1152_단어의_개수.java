package baekjoon.step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class QN1152_단어의_개수 {
    public static void main(String[] args){
        //이게 랭크가 정상적으로 책정된게 맞나..?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            // 앞이나 뒤에 공백으로 시작할경우 " "가 1로 카운팅 될수 있기에 앞뒤 공백 제거
            // 변수가 발생 가능해서 제거
            String text = br.readLine().trim();
            if(!text.isEmpty()){
                bw.write(String.valueOf(text.split(" ").length));
            } else {
                bw.write("0");
            }
            bw.flush();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}