package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static  String getHotelNumber() {
        String hotelNumber = "02-123-4567";
        return hotelNumber;
    }
    // 호텔 주소
    public static String getAddress() {
        return "서울 시내";
    }
    // 호텔 부대서비스
    public static String getActivities(){
        return "볼링, 탁구, 수영";
    }

    public static void main(String[] args) {
        //반환값, return
        String hotelNumber = getHotelNumber();
        System.out.println("호텔 전화 번호 : " + hotelNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        String activities = getActivities();
        System.out.println("호텔 액티비티 : " + getActivities());
    }
}
