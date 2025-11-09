package baekjoon.step6;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class QN2941_크로아티아_알파벳2 {
    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        Set<String> set = new HashSet<>();
        hash.put(0, "c=");
        hash.put(1, "c-");
        hash.put(2, "dz=");
        hash.put(3, "d-");
        hash.put(4, "lj");
        hash.put(5, "nj");
        hash.put(6, "s=");
        hash.put(7, "z=");

        try{
            String text = br.readLine();
            int count = 0;
            int mnum = 0;
            // 텍스트에서 크로티아 알파벳이 있을경우 크로티아 알파벳 길이만큼 i값을 +시켜야함
            //


            for(int i = 0 ; i < 8 ; i++){
                //특정 문자가 있을경우
                if(text.contains(hash.get(i))){
                    //첫번째와 마지막이 같으면
                    if(text.indexOf(hash.get(i)) != text.lastIndexOf(hash.get(i))){
                        for(int j = 0 ; j < text.length() ; j++){ // j가 5일때 문제 발생
                            if(text.substring(j , j + hash.get(i).length() - 1).equals(hash.get(i))){
                                count = count + 1;
                            }
                        }
                        text = text.replaceAll(hash.get(i), "");
                    } else {    //
                        text = text.replaceAll(hash.get(i), "");
                        count = count + 1;
                    }
                }
            }
            String[] textarr = text.split("");

            for(int i = 0 ; i < textarr.length ; i++){
                set.add(textarr[i]);
            }

            bw.write("count : " + String.valueOf(set.size() + count));
            bw.flush();
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
