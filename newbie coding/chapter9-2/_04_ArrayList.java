package chap_09;

import java.util.ArrayList;

import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 - list set map
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("클롭");
        list.add("마네");
        list.add("살라");
        list.add("버질");
        list.add("밀너");

        // 데이터 조회 (index)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("-------");

        // 삭제 - 마네가 떠남
        System.out.println("신청 학생 수 (이사 전) : " + list.size()); // 5
        list.remove("마네");
        System.out.println("신청 학생 수 (이사 후) : " + list.size()); // 4
        System.out.println(list.get(3));

        System.out.println("-------");

        System.out.println("남은 학생 수 (제외 전) : " + list.size()); // 4
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size()); // 3

        System.out.println("---------");

        // 순회
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------");

        // 변경, 수강권 양도
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "둠둠");
        System.out.println("수강권 양도 전 : " + list.get(0));

        System.out.println("---------");

        // 확인
        System.out.println(list.indexOf("버질"));
        // 선착순 5명 내에 포함됐는지 확인
        if (list.contains("버질")) {
            System.out.println("수강 성공");
        } else {
            System.out.println("수강 실패");
        }
        System.out.println("---------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트 빔");
        }
        System.out.println("---------");

        // 새 학기 시작

        list.add("클롭");
        list.add("마네");
        list.add("살라");
        list.add("버질");
        list.add("밀너");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

    }
}
