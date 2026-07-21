package com.kosa.javaexam_collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

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

        /*
            Collection
            3) Set 세트
                - 들어있는 값들이 모두 고유한(유니크) 리스트 = 중복값이 존재하지 않는다.
                - List에서 Element 요소의 중복을 자체적으로 방지해주는 자료구조
                - 구현체 종류 : HashSet / TreeSet : 자동 정렬
        */
//        Set<String> string_set = new HashSet<>();               // 빈 Set 선언 (String 요소)
//        string_set.add("1");
//        string_set.add("2");
//        string_set.add("3");

        Set<String> string_set = new HashSet<>(Arrays.asList("1", "2", "3"));
        string_set.add("4");
        string_set.remove("1");
        string_set.contains("1");
        string_set.clear();
        string_set.isEmpty();
        string_set.size();

//        Set<Integer> integer_set = new HashSet<>();               // 빈 Set 선언 (String 요소)
//        integer_set.add(1);
//        integer_set.add(2);
//        integer_set.add(3);

        Set<Integer> integer_set = new HashSet<>(Arrays.asList(1, 2, 3));
        integer_set.add(4);
        integer_set.remove(1);
        integer_set.contains(1);
        integer_set.clear();
        integer_set.isEmpty();
        integer_set.size();

        System.out.println(string_set);
        System.out.println(integer_set);

        /*
            Collection
            4) Map 맵
                - Key - Value 기반 자료구조 = 데이터베이스와 되게 유사 = Primary Key - Row(Data)
                - List 다음으로 많이 사용하는 자료구조
                - 시간 복잡도를 낮추기 위해 공간 복잡도를 Map으로 늘려 활용한다.
                - Entry : entrySet()
                - Key : keySet(), containKey()
                - Value : values(), containsValue()
                - 구현체 종류 : HashMap / TreeMap : 자동 정렬 / LinkedHashMap : 키 순서 보장
        */
        Map<Integer, String> string_map = new HashMap<>();            // 빈 Map 선언 (String 요소)
        string_map.put(1, "1");
        string_map.put(2, "2");
        string_map.put(3, "3");

        /* 주의 : Arrays.asList와 Map.of로 생성되는 Collection은 Immutable 불변성이기에 수정 불가 - get(), put(), remove() 등 불가 */
//        Map<Integer, String> string_map = Map.of(1, "1", 2, "2", 3, "3");
        string_map.get(2);                          // 조회
        string_map.put(4, "4");                     // 추가
        string_map.replace(4, "5");                 // 수정
        string_map.remove(3);                  // 삭제
        string_map.containsKey(1);                  // 포함
        string_map.containsValue("1");              // 포함
        string_map.entrySet();                      // - Entry = [Key, Value] (Set)
        string_map.keySet();                        // - Key (Set)
        string_map.values();                        // - Value (List)
        string_map.clear();                         // 리셋
        string_map.isEmpty();                       // 검사
        string_map.size();                          // 개수

        Map<Integer, Integer> integer_map = new HashMap<>();          // 빈 Map 선언 (Integer 요소)
        integer_map.put(1, 1);
        integer_map.put(2, 2);
        integer_map.put(3, 3);

        /* 주의 : Arrays.asList와 Map.of로 생성되는 Collection은 Immutable 불변성이기에 수정 불가 - get(), put(), remove() 등 불가 */
//        Map<Integer, Integer> integer_map = Map.of(1, 1, 2, 2, 3, 3);
        integer_map.get(2);                          // 조회
        integer_map.put(4, 4);                       // 추가
        integer_map.replace(4, 5);                   // 수정
        integer_map.remove(3);                  // 삭제
        integer_map.containsKey(1);                  // 포함
        integer_map.containsValue("1");              // 포함
        integer_map.entrySet();                      // - Entry = [Key, Value] (Set)
        integer_map.keySet();                        // - Key (Set)
        integer_map.values();                        // - Value (List)
        integer_map.clear();                         // 리셋
        integer_map.isEmpty();                       // 검사
        integer_map.size();                          // 개수

        System.out.println(string_map);
        System.out.println(integer_map);
    }

}
