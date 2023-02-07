package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // continue
        // 노쇼 손님으로 인해 다른 손님에게
        // for
        int max = 20; // 하루 최대 판매량
        int sold = 0; // 현 시점 판매량
        int noShow = 17; // 17번 손님 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            //노쇼 처리
            if (i == noShow){
                System.out.println(i + "번 손님이 없어서 다음으로 넘어가요.");
                continue;
            }


            sold++;// 판매 처리
            if (sold == max) {
                System.out.println("금일 재료 소진");
                break;
            }
            System.out.println("영업 끝");

            System.out.println("---------");

            //while문
            sold = 0;
            int index = 0;
            //while (index < 50) {
            while (true){
                index++;
                System.out.println(index + "번 손님, 치킨 나왔어요.");

                // 17번 노쇼
                if (index == noShow) {
                    System.out.println(index + "번 손님, 다음 손님에게 넘어가요.");
                    continue;
                }
                sold++;// 판매 완료
                if (sold == max) {
                    System.out.println("재료 소진");
                    break;
                }
            }
            System.out.println("영업 종료");
        }
    }
}
