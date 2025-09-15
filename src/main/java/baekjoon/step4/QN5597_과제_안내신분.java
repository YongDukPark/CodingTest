package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class QN5597_과제_안내신분 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String strtemp = null;
        int temp = 0;
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        try{
            //데이터 조합
            while(true){
                strtemp = br.readLine();
                if(strtemp == null){
                    break;
                }
                //list.add(Integer.valueOf(temp));
                set.add(Integer.valueOf(strtemp));
            }

            //데이터 검증
            for(int i = 0 ; i < 30 ; i++){
                if(!(set.contains(i+1))){
                    list.add(i+1);
                }
            }

            //데이터 정렬
            Collections.sort(list);

            //데이터 주입
            for(int i = 0 ; i < list.size() ; i++){
                sb.append(list.get(i));
                if(!(i == list.size() - 1)){
                    sb.append("\n");
                }
            }
            bw.write(sb.toString());
            bw.flush();
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
