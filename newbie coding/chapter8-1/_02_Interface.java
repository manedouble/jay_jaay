package chap_08;

import chap_08.camera.FactoryCamera;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.VideoReporter;


public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("--------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-----------");

        FactoryCamera factoryCamera = new FactoryCamera();
        factoryCamera.setDetector(advancedFireDetector);
        factoryCamera.setReporter(videoReporter);

        factoryCamera.detect();
        factoryCamera.report();


    }
}
