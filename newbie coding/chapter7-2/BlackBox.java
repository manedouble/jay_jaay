package chap_07;

public class BlackBox {
    // 설계도의 역할이라 이해하면 됨
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 넘버
    static int counter = 0; // 시리얼 번호 생성해줌 (0에서 오름차순 증가)
    static boolean canAutoReport = false; // 자동 신고 기능


    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버 발급 : " + this.serialNumber);
    }
    BlackBox(String modelName, String resolution, int price, String color){
//        this(); // 기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌 감지 후 자동 신고");
        }
        else {
            System.out.println("자동 신고 기능 지원 불가");
        }

    }
        void insertMemoryCard(int capacity){
            System.out.println("메모리 카드 삽입");
            System.out.println("용량은 " + capacity + "GB");
        }

        int getVideoFileCount(int type){
        if (type == 1){
            return 9;
        }
        else if (type == 2) {
            return 1;
        }
        return 10;
        }
        void record(boolean showDateTime, boolean showSpeed, int min){
            System.out.println("녹화 시작");
            if (showDateTime) {
                System.out.println("영상에 날씨 정보 표시");
            }
            if (showSpeed) {
                System.out.println("영상에 속도 정보 표시");
            }
            System.out.println("영상은 " + min + "분 단위로 기록");
        }
        void record() {
            record(true, true, 5);
        }

        static void callServiceCenter() {
            System.out.println("서비스 센터 (1234-5678)로 연결");

        }

    public void appendModelName(String modelName) {
        this.modelName += modelName;
    }

        // getter & setter
        String getModelName() {
            return modelName;
        }
        void setModelName(String modelName) {
            this.modelName = modelName;
        }
        String getResolution() {
            if (resolution == null || resolution.isEmpty()) {
                return "판매자 문의";
            }
            return resolution;
        }

        void setResolution(String resolution) {
            this.resolution = resolution;
        }
        int getPrice() {
           return price;
        }
        void setPrice(int price) {
            if (price < 100000) {
                this.price = 100000;
            }
            else {
                this.price = price;
            }
        }
        String getColor() {
            return color;
        }
        void setColor(String color) {
            this.color = color;
        }
}