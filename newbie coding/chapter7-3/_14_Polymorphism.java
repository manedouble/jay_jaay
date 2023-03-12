package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.speedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        speedCam speedCam = new speedCam();


        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-------");


        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new speedCam();
        for (Camera cam: cameras) {
            cam.showMainFeature();
        }

        System.out.println("-------");

      if (camera instanceof Camera){
          System.out.println("카메라입니다.");
      }
      if (factoryCam instanceof FactoryCam){
          ((FactoryCam)factoryCam).detectFire();
      }
      if (speedCam instanceof speedCam){
          ((speedCam) speedCam).checkSpeed();
          ((speedCam) speedCam).recognizeLicensePlate();
      }

      Object[] objs = new Object[3];
      objs[0] = new Camera();
      objs[1] = new FactoryCam();
      objs[2] = new speedCam();
    }
}
