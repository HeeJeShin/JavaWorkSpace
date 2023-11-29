package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number) {
        // 메소드내에서 메소드 호출.
        return getPower(number, 2);
    }
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result); // 2 * 2

        //3의 3승
        result = 3;
        for (int i = 0; i < 2; i++) {
            result *= 3;
        }
        System.out.println(result); // 3 * 3 = 27
        //4의 4승
        result = 4;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result); // 4 * 4 = 16

        // 아래방법을 사용하면 여러번의 반복되는 코드들 메소드를 이용하면 줄일 수 있다.
        System.out.println(getPower(2,2));
        System.out.println(getPower(3,2));
        System.out.println(getPower(4,2));
    }
}
