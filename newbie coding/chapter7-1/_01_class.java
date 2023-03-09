package chap_07;

public class _01_class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍
        // 유지보수 쉬움
        // 재사용성 높음

        // 블랙박스
        // 모델명 해상도 가격 색
        String modelName = "까망";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 신상
        String modelName2 = "하양";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 그 외 제품
        BlackBox bbox = new BlackBox();
        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스

        BlackBox bbox2 = new BlackBox();

    }
}
