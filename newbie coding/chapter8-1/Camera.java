package chap_08.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진 촬영");
    }
    public void recordVideo() {
        System.out.println("동영상 녹화");
    }

    public abstract void showMainFeature(); // 구현해야 하는 메소드

}
