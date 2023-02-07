package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIf
        //한라봉 에이드 +1
        //또는 망고 주스 +1
        //또는 아이스 아메리카노 +1

        boolean ade = true;
        boolean juice = true;

        if (ade) {
            System.out.println("한라봉 에이드 +1");
        } else if (juice) {
            System.out.println("망고 주스 +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        //else if는 반복 가능
        ade = false;
        juice = false;
        boolean orange = true;

        if (ade) {
            System.out.println("한라봉 에이드 +1");
        } else if (juice) {
            System.out.println("망고 주스 +1");
        } else if(orange){
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

        //else는 없어도 됨

        ade = false;
        juice = false;
        orange = false;

        if (ade) {
            System.out.println("한라봉 에이드 +1");
        } else if (juice) {
            System.out.println("망고 주스 +1");
        } else if(orange){
            System.out.println("오렌지 주스 +1");
        }
            System.out.println("아이스 아메리카노 +1");

        System.out.println("커피 주문 완료 #3");

    }
}
