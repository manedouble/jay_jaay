package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요");

        //해물파전         9천원
        //김치전           8천원
        //부추전           8천원
        System.out.println("해물파전\t9천원");
        System.out.println("김치전\t8천원");
        System.out.println("부추전\t8천원");

        System.out.println("C:\\program files\\java");

        System.out.println("공원이는 \"냥\" 했다.");
        System.out.println("공원이는 \'뭘 보냥!\' 하는 눈치였다.");
        System.out.println("공원이는 '뭘 보냥!' 하는 눈치였다."); // 위와 같은 출력값 나옴

        char camel = 'A';
        camel = '\'';
        System.out.println(camel);
    }
}