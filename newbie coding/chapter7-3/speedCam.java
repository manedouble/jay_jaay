package chap_07.Camera;

public class speedCam extends Camera { // 자식 클래스

    public speedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도 측정");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호 인식");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
