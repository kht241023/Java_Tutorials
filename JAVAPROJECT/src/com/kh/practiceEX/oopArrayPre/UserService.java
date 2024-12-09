package com.kh.practiceEX.oopArrayPre;

import java.util.Scanner;

public class UserService {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        User u = new User();

        // setter 를 이용해서 유저 저장

        // username 빈칸이거나 6글자 이상 저장 x return 시키기

        // email    빈칸이거나 30자 이상 작성 불가 return 시키기

        u.setUsername("홍길동"); // String 변수명 = u.setUserName 형식으로 변수명에 저장 불가
        u.setAge(10);           // int 변수명 = u.setAge 형식으로 변수명에 저장 불가
        u.setEmail("hong@hong.com");// String 변수명 = u.setEmail 형식으로 변수명에 저장 불가
        // set으로 저장된 값은 변수명에 넣어주는 것이 아니라 get으로 정보 반환할 수 있음


        System.out.println("------------- 저장된 사용자 정보 -------------");
        // ArrayList 이용해서 정보 저장하고
        // toString 을이용해서 저장된 사용자 정보 가져오기
    }
}
