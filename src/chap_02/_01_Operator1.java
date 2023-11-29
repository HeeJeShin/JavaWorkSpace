package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술연산자

        //일반연산자
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); //2.5?  정수로인식시 소수점 출력안됨. 답은 2
        System.out.println(2 / 4);  // 0
        System.out.println(4 % 2); // 나머지값 나옴 0

        //우선 순위 연산
        System.out.println(2 + 2 * 2);  // 6 상식적인 수학연산처럼 계산한다.
        System.out.println((2 + 2) * 2); //8
        System.out.println(2 + (2 * 2)); // 6
    }
}

