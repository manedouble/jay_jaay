package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index); // 마네마네 -> 마
        //for (int i = index; i < data.length(); i++)
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*"; // 마***
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "마네마네"; //이름
        String id = "000101-1234567";//주민번호
        String phone = "010-1234-5678";//전화번호

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("이름 : " + getHiddenData(phone, 9));

    }
}
