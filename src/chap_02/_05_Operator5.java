package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항연산자
        // 결과 = 조건 ? 참의 경우 : 거짓의 경우
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);
    }
}
