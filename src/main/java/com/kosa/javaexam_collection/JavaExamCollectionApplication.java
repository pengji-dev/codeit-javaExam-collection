package com.kosa.javaexam_collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
    }

}
