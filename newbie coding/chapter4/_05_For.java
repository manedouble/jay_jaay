package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        // 매장
        System.out.println("안녕하세요. 마네입니다.");
        // 여러 손님 들어옴
        System.out.println("안녕하세요. 마네입니다.");
        System.out.println("안녕하세요. 마네입니다.");
        System.out.println("안녕하세요. 마네입니다.");
        System.out.println("안녕하세요. 마네입니다.");
        System.out.println("안녕하세요. 마네입니다.");
        System.out.println("안녕하세요. 마네입니다.");
        System.out.println("안녕하세요. 마네입니다.");
        //인사법 바뀜
        System.out.println("환영합니다. 마네입니다.");
        System.out.println("환영합니다. 마네입니다.");
        System.out.println("환영합니다. 마네입니다.");
        System.out.println("환영합니다. 마네입니다.");
        System.out.println("환영합니다. 마네입니다.");
        //매장 이름 변경 네마로
        System.out.println("환영합니다. 네마입니다.");
        System.out.println("환영합니다. 네마입니다.");
        System.out.println("환영합니다. 네마입니다.");

        //반복문 사용 for
        for (int i = 0 ; i < 10 ; i++ ){ //i가 10보다 작을 동안 반복
            //System.out.println("어서오세요. 마네입니다. " + i);
            //System.out.println("환영합니다. 마네입니다. " + i);
            System.out.println("어서오세요. 마네입니다. " + i);

        }
        //짝수만 출력 (fori 만 적으면 자동 완성)
        for (int i = 0; i < 10 ; i += 2) {
            System.out.print(i);
        }

        System.out.println();
        //홀수만 출력
        for (int i = 1; i < 10 ; i += 2) {
            System.out.print(i);
        }
        System.out.println();
        //역순 5 4 3 2 1
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }

        System.out.println();

        // 1~10까지 총합
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 합은 " + sum + "입니다.");
    }
}
