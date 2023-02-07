package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        System.out.println(s.replace(" and", ",")); //and를 ,로 변환
        System.out.println(s.substring(7)); //인덱스 기준 7부터 시작, 이전 내용은 지워짐
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작 위치부터 끝 위치 직전까지

        //공백 제거

        String snake = "     I love Java.    ";
        System.out.println(snake);
        System.out.println(snake.trim());

        //문자열 결합

        String snake1 = "Java";
        String snake2 = "Python";
        System.out.println(snake1 + snake2);//javapython
        System.out.println(snake1 + ", " + snake2);//java,python
        System.out.println(snake1.concat(", ").concat(snake2));

    }
}
