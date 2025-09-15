package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class QN10810_공_넣기 {
    public static void main(String[] args){
        //1. 바구니 N개 각각 바구니에 1~N번까지 번호가 있음
        //2. 1번부타 N번까지 번호가 적혀있는 공이 많음
        //3. 가장 처음 바구니에는 공이 들어있지 않고 바구니에는 공을 1개만 넣을 수 있음 > 정수 배열로 진행하면 됨
        // 앞으로 M번공을 넣으려고 하고 > 첫째 line의 두번째 횟수만큼 진행한다는 뜻이었음
        // 공을 넣을 때 공을 넣을 바구니 범위를 정하고 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
        // 만약 공이 있는 경우에는 들어있는 공을 빼고 새로 공을 넣고 공을 넣은 바구니는 연속되어 있어야 한다.
        // 둘째줄부터 1 2 3 이와같이 값이 오는데 이건 1번째부터 2번째까지 3번공을 넣는다는 의미 {3,3,0,0,0} 이런식으로

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int size = 0;
        int count = 0;
        int[] basket = null;

        try{
            st = new StringTokenizer(br.readLine());
            size = Integer.valueOf(st.nextToken());
            count = Integer.valueOf(st.nextToken());
            //문제상에선 N값을 배열의 길이로 설정
            basket = new int[size];

            for(int i = 0 ; i < count ; i++){
                int[] change = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                //시작 지점을 배열의 0번째 값으로 하고 1번째 값까지 2번의 값을 대입
                //새로 넣는다고 하여 덮어쓰는 형식을 채용
                for(int j = change[0] ; j <= change[1] ; j++){
                    basket[j-1] = change[2];
                }
            }

            //요구사항에 맞춰 데이터 조합
            for(int i = 0 ; i < basket.length ; i++){
                sb.append(basket[i]);
                if(!(i == basket.length-1)){
                    sb.append(" ");
                }
            }

            bw.write(sb.toString());
            bw.flush();

        } catch(IOException ex){
            System.err.println(ex);
        }
    }
}