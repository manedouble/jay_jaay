package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 필요 이유

        //2의2승 구하기
        System.out.println(getPower(2,2)); // 2*2

        //3의3승
        System.out.println(getPower(3,3)); // 3^3

        //4의2승
        System.out.println(getPower(4,2)); // 4^2
    }
}
