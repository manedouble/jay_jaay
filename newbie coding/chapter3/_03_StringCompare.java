package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String camel = "Java";
        String snake = "Python";

        System.out.println(camel.equals(snake));
        System.out.println(snake.equals("Python"));

        //대소문자 구분 없이 비교
        System.out.println(camel.equalsIgnoreCase("java"));

        //문자열 비교 심화
        camel = "1234"; // 메모에 있는 정보, 하나의 메모를 같이 공유 (참조)
        snake = "1234";
        System.out.println(camel.equals(snake)); //(내용)
        System.out.println(camel == snake); //(참조)

        camel = new String("1234"); // new를 쓰면 서로 다른 메모에 같은 내용이라 가정하면 됨, 그래서 같은 내용이지만 다른 메모이기에 ==는 성립하지 않음
        snake = new String("1234");
        System.out.println(camel.equals(snake));
        System.out.println(camel == snake);

    }
}
