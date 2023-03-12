package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.speedCam;

public class _12_Inheritance { //상속
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        speedCam speedCam = new speedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();

    }
}
