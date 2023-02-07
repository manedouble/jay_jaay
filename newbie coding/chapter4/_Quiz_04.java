package chap_04;

// 주차 요금 시간 당 4천원
// 경차, 장애인 차량 50% 할인

// 일반 차량 5시간 주차 20000원
// 경차 5시간 주차 10000원
// 장애인 차량 10시간 주차 15000원

// 실행 결과 : 주차 요금은 ?? 원입니다.

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5; // 주차 시간
        boolean smallCar = true; // 경차 여부
        boolean disabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 시간 당 4천원

        // 일일 최대 요금은 3만원
        if (fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량이면 50% 할인
        if (smallCar || disabledPerson){
            fee /= 2; // 50% 할인 적용

        }
        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원입니다.");
    }
}
