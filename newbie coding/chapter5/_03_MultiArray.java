package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열
        // 극장
        // A1 ~ A5
        // B1 ~ B5
        // C1 ~ C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};


        // 3 X 5 크기 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        //B2에 접근하기
        System.out.println(seats[1][1]);
        //C2에
        System.out.println(seats[2][4]);
        //첫 줄부터 3, 4, 5칸씩
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        //A3 접근
        System.out.println(seats2[0][2]);
        //A5 접근
        //System.out.println(seats2[0][4]);

        // 3차원 배열

//         {
//                { {}, {}, {} },
//                { {}, {}, {} },
//                { {}, {}, {} }
//
//        };
//        또는 String[][][] newarray = new String[3][3][3];
//
    }
}
