package baekjoon.step6;

public class test {
    public static void main(String[] args) {
        String text = "abcd";

        // 1부터 2전까지
        System.out.println(text.substring(1, 2));
        // 1부터 4전까지
        System.out.println(text.substring(1, 4));
        //1에 있음
        System.out.println(text.indexOf("bc"));
        text = text.replaceAll("bc", "");

        System.out.println(text);


    }
}
