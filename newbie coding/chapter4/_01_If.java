package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 if
        int hour = 15; // 10am

        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");// if문 하나의 명령

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");// if문 n개 이상의 명령 실행 시 중괄호 필수
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료");

        //오후 2시 이전, 아침에 커피 아직
        hour = 15;
        boolean morningCoffee = false; // 아침커피
        //if (hour < 14 && morningCoffee == false)
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        //오후 2시 이후 또는 아침 커피를 마신 후
        hour = 15;
        morningCoffee = true;
        //if (hour >= 14 || morningCoffee == true) {
        if (hour >= 14 || morningCoffee) {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료");

    }

}
