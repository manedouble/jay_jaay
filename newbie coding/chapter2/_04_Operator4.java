package chap_02;

public class _04_Operator4 {
    // 논리 연산자
    public static void main(String[] args) {

        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;


        System.out.println(김치찌개 || 계란말이 || 제육볶음); //하나라도 true이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //모두 true이면 true

        //and 연산
        System.out.println((5 > 3) && (3 > 1)); // 두 수식이 모두 참이면 true
        System.out.println((5 > 3) && (3 < 1));

        //or 연산
        System.out.println((5 > 3) || (3 > 1));
        System.out.println((5 > 3) || (3 < 1)); // T
        System.out.println((5 < 3) || (3 < 1)); // F

        //논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(5 == 5);//T
        System.out.println(!(5 == 5));//F
    }


}
