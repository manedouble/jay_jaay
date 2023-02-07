package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //Switch Case
        //1등 : 전액
        //2등 : 반액
        //3등 : 반액
        //그 외 : 해당 없음

        int ranking = 3;
        if (ranking == 1) {
            System.out.println("전액");
        } else if (ranking == 2) {
            System.out.println("반액");
        } else if (ranking == 3) {
            System.out.println("반액");
        } else {
            System.out.println("해당 없음");
        }
        System.out.println("조회 완료 #1");

        //switch case문
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액");
                break;
            case 2:
                System.out.println("반액");
                break;
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("해당 없음");

        }
        System.out.println("조회 완료 #2");

        //2~3등 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액");
                break;
            case 2:
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("해당 없음");

        }
        System.out.println("조회 완료 #3");


        // 중고 상품 등급 (1 최상, 4 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;

        }
        System.out.println((grade + "등급 제품의 가격 : " + price + "원"));



    }
}
