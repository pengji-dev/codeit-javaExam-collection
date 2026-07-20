package com.kosa.javaexam_collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@SpringBootApplication
public class JavaExamCollectionApplication {

    public static void main(String[] args) {
//        SpringApplication.run(JavaExamCollectionApplication.class, args);
        /*
            Collection
            1) Array 배열
                - 길이가 고정된 값의 나열
                - add()나 delete()와 같은 값을 추가하고 삭제하는 등 불가
                - 정확히는 Collection에 속하지 않는다.
        */
//        String[] string_array = new String[3];                // 길이 기반 Array 선언 (String 요소)
        String[] string_array = new String[]{"1", "2", "3", "4"};    // 값 기반 Array 선언 (String 요소)
        System.out.println(string_array.length);

//        Integer[] integer_array = new Integer[3];             // 길이 기반 Array 선언 (Integer 요소)
        Integer[] integer_array = new Integer[]{1, 2, 3, 4};       // 값 기반 Array 선언 (Integer 요소)
        System.out.println(integer_array.length);

        System.out.println(string_array);
        System.out.println(integer_array);

        /*
            Collection
            2) List 리스트
                - 값이 자유롭게 추가, 수정, 삭제될 수 있는 값의 나열(일렬로 나열한 데이터 집합)
                - add()나 delete() 등 리스트 변경 메서드 호출 가능
                - 구현체 종류
                    - ArrayList : 조회 성능 우수
                    - LinkedList : 삽입/삭제 성능 우수
        */
        List<String> string_list =  new ArrayList<>();          // 가변 길이 빈 List 선언 (String 요소)
        string_list.add("1");
        string_list.add("2");
        string_list.add("3");

//        List<String> string_list = Arrays.asList("1", "2", "3");        // 고정 길이 값 기반 List 선언 (String 요소)
        string_list.get(2);                         // 조회
        string_list.add("4");                       // 추가 -> Array.asList()에서는 배열에 연결된 List를 반환하기 때문에 요소의 개수를 변경할 수 없다.
        string_list.set(3, "5");                    // 수정
        string_list.remove(3);                // 삭제
        string_list.subList(0, 1);                  // 부분
        string_list.sort(String::compareTo);        // 나열
        string_list.contains("1");                  // 포함
        string_list.clear();                        // 리셋
        string_list.isEmpty();                      // 검사
        string_list.size();                         // 개수

        List<Integer> integer_list = new ArrayList<>();       // 빈 List 선언 (Integer 요소)
        integer_list.add(1);
        integer_list.add(2);
        integer_list.add(3);

//        List<Integer> integer_list = Arrays.asList(1, 2, 3);    // 값 기반 List 선언 (Integer 요소)
        integer_list.get(2);                        // 조회
        integer_list.add(4);                        // 추가
        integer_list.set(3, 5);                     // 수정
        integer_list.remove(3);               // 삭제
        integer_list.subList(0, 1);                 // 부분
        integer_list.sort(Integer::compareTo);      // 나열
        integer_list.contains(1);                   // 포함
        integer_list.clear();                       // 리셋
        integer_list.isEmpty();                     // 검사
        integer_list.size();                        // 개수

        System.out.println(string_list);
        System.out.println(integer_list);
    }

}
