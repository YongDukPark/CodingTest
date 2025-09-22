package baekjoon.step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class QN2444_별_찍기7 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        try{
            int count = Integer.valueOf(br.readLine());

            //최초 count 만큼 돌리기
            for(int i = 1, k = 1 ; i <= count ; i++, k = k + 2){
                for(int j = 0 ; j < count-i ; j++){
                    sb.append(" ");
                }
                for(int s = 0 ; s < k ; s++ ){
                    sb.append("*");
                }
                sb.append("\n");
            }

            //이후 아래 count-1 만큼 돌리기
            //-3을 넣은 이유는 상단에서 1로 시작한거랑 비슷한 개념으로 보면됨
            // 반복 횟수가 count-1이므로 한줄이 넘어간거와 같음 고로
            // 상단의 k가 1 + 2로 된거와 같으며 > 여기서 -1 -2 계산식이 적용되 -3으로 적용시킨거다
            for(int i = 0, k = count*2-3 ; i < count-1 ; i++, k = k - 2){
                for(int j = 0 ; j < i + 1 ; j++){
                    sb.append(" ");
                }
                for(int s = 0 ; s < k ; s++ ){
                    sb.append("*");
                }
                sb.append("\n");
            }

            bw.write(sb.toString());
            bw.flush();

        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}