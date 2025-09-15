package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class QN10813_공_바꾸기 {
    public static void main(String[] args){
        // 바구니 1~N까지 있고 각 바구니에 1~N까지 적혀있다고 한다.
        // ex)N = 5 -> 1, 2, 3, 4, 5 이렇게
        // 이제 M번 만큼 바꾸기를 할거고 예를들어 2,4 면
        // 1, 2, 3, 4, 5 -> 1, 4, 3, 2, 5 와 같이 변경이 된다.
        // 이제 풀어보자

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int N = 0;
        int M = 0;
        int num1 = 0;
        int num2 = 0;
        int temp = 0;
        StringBuilder sb = new StringBuilder();

        try{
            st = new StringTokenizer(br.readLine());
            N = Integer.valueOf(st.nextToken());
            M = Integer.valueOf(st.nextToken());
            int[] basket = new int[N];

            //바구니 번호 세기기
            for(int i = 0 ; i < N ; i++){
                basket[i] = i+1;
            }

            for(int i = 0 ; i < M ; i++){
                st = new StringTokenizer(br.readLine());
                num1 = Integer.valueOf(st.nextToken());
                num2 = Integer.valueOf(st.nextToken());

                //공 변경작업
                temp = basket[num1-1];
                basket[num1-1] = basket[num2-1];
                basket[num2-1] = temp;
            }

            for(int i = 0 ; i < N ; i++){
                sb.append(basket[i]);
                if(!(i == N-1)){
                    sb.append(" ");
                }
            }

            bw.write(sb.toString());
            bw.flush();
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}
