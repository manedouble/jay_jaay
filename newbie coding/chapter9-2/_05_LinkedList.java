package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("클롭");
        list.add("마네");
        list.add("살라");
        list.add("버질");
        list.add("밀너");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("-------");
        // 추가
        list.addFirst("각포");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("선수 추가 전 (index 1) : " + list.get(1));
        list.add(1,"헨도");
        System.out.println("선수 추가 후 (index 1) : " + list.get(1));
        System.out.println("선수 추가 후 (index 2) : " + list.get(2));

        System.out.println("-------");


        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());

        // 첫 학생, 마지막 학생 모두 전학
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        list.removeFirst(); // 첫 데이터
        list.removeLast(); // 마지막 데이터
        System.out.println("남은 학생 수 (전학 후) : " + list.size());
        for (String s : list) {
            System.out.println(s);
        }

        // 변경 (수강권 양도)
        list.set(0, "둠둠");
        System.out.println(list.get(0));

        // 확인
        System.out.println("클롭");
        if (list.contains("클롭")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }
        System.out.println("-------");

        // 새 학기
        list.add("클롭");
        list.add("마네");
        list.add("살라");
        list.add("버질");
        list.add("밀너");

        Collections.sort(list); // 정렬
        for (String s : list) {
            System.out.println(s);
        }

    }
}
