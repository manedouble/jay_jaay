package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
                System.out.println(s);

        System.out.println(s.length()); //문자열 길이

        //대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java"));//포함되면 t
        System.out.println(s.contains("C#"));//안되면 f
        System.out.println(s.indexOf("Java"));//위치확인
        System.out.println(s.indexOf("C#"));//위치확인
        System.out.println(s.indexOf("and"));//첫 위치
        System.out.println(s.lastIndexOf("and"));//마지막 위치
        System.out.println(s.startsWith("I like"));//이 문자열로 시작하면 true, 아니면 f
        System.out.println(s.endsWith("."));//이 문자열로 끝나면 t, 아니면 f

    }
}
