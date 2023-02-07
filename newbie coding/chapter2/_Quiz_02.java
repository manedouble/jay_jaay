package chap_02;

// 어린이 키에 따른 놀이 기구 탑승 여부 확인 프로그램 작성
// 키는 120cm 이상이어야 함
// 삼항 연산자 활용
// 키가 ??cm이므로 탑승 ?가능합니다 115 130

public class _Quiz_02 {
    public static void main(String[] args) {
        int 키 = 115;
        String 탑승여부 = (키 >= 120) ? "가능" : "불가";
        System.out.println("키가 " + 키 + "cm이므로 " + 탑승여부);
    }
    }

