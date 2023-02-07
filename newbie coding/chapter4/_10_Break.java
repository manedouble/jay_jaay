package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 20마리 한정판매, 1인 1닭
        // 손님 50명 대기
        // for문


        int max = 20;
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 치킨 나왔어요.");
            if (i == max) {
                System.out.println("재료가 소진되었습니다.");
                break;
            }

        }
        System.out.println("영업 종료");

        System.out.println("----------------");

        //while문
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님, 치킨 나왔어요.");
            if (index == max) {
                System.out.println("재료가 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
