package chap_08;

import chap_07.Camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화
        // abstract
        // 추상 클래스 (미완성 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한 껍데기만 있는 메소드)

        // Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
