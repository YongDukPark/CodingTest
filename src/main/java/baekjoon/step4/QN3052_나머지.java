package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class QN3052_나머지 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> set = new HashSet<>();
        int count = 0;

        try{
            while(true){
                String temp = br.readLine();
                //입력받는 값이 없을경우 break
                if(temp == null){
                    break;
                }
                //나머지값이 중복이 되면 안되기에 Set 자료구조 사용
                set.add(Integer.valueOf(temp) % 42);
            }

            //나머지값 개수 count
            for(int num : set){
                count++;
            }
            bw.write(String.valueOf(count));
            bw.flush();
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
