package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        //생년월일 및 성별까지만 출력되는 프로그램을 만들 것
        String snake = "901231-1234567";
        System.out.println(snake.substring(0,6)+ "-" + snake.substring(7,8));
        System.out.println(snake.substring(0,8));
        snake = "030708-4567890";
        System.out.println(snake.substring(0,snake.indexOf("-")+2));




    }
}
