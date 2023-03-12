package chap_07;

import chap_07.Camera.FactoryCam;
import chap_07.Camera.speedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        FactoryCam factoryCam = new FactoryCam();
        speedCam speedCam = new speedCam();

        factoryCam.recordVideo();
        System.out.println("-------");
        speedCam.takePicture();
    }
}
