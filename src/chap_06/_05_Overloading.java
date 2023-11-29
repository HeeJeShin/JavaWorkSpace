package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }
    public static int getPower(String strNumber){
         int number = Integer.parseInt(strNumber);
         return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        return result;
    };
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러번선언
        // 조건 1. 인식할 수 있도록 타입이 달라야한다. 같을경우 인식이 안된다.
        // 조건 2. 인자값 갯수가 달라야한다.
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
    }
}
