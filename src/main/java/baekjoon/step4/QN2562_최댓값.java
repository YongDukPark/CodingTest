package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;

public class QN2562_최댓값 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String checkValue = null;

        ArrayList<Integer> list = new ArrayList();
        int index = 0;
        //자연수도 음수가 아닌 숫자
        int max = 0;

        // 결국엔 순환탐색을 통해 큰값과 index를 구해야함
        // 별도 list넣는 과정 필요없이 가능하긴함

        try{
            while(true){
                checkValue = br.readLine();
                if(checkValue != null){
                    list.add(Integer.valueOf(checkValue.trim()));
                } else {
                    break;
                }
            }
            for(int i = 0 ; i < list.size() ; i++){
                if(list.get(i) > max){
                    max = list.get(i);
                    index = i+1;
                }
            }
            sb.append(max).append("\n").append(index);

            bw.write(sb.toString());
            bw.flush();
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
