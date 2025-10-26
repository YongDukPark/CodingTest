package baekjoon.step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOExpcetion;

public class QN2941_크로아티아_알파벳{
    public static void main(String[] args){

        Hash<> hash = new HashMap(Integer, String);

        try{
            Stirng text = br.readLine();
            int count = 0;

            for(int i = 0 ; i < 9 ; i++){
                if(text.indexOf(hash.get(i))){
                    //첫번째와 마지막이 같으면
                    if(text.indexOf(hash.get(i)) != text.lastIndexOf(hash.get(i))){
                        for(int j = 0 ; j < text.length ; j++){
                            if(text.subString(j , j + 2).eqauls(hash.get(i))){
                                count = count + 1;
                                //연산횟수 단축
                                j = j +1;
                            }

                        }
                    } else {    //
                        count = count + 1;
                    }
                }
            }
        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}
