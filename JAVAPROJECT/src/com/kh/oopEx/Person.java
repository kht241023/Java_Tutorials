package com.kh.oopEx;

import java.io.Serializable;
// implements Serializable 직렬화를 사용하기 위해 Serializable 경로 설정 후 객체파일 불러오기
public class Person implements Serializable {
    private static final long serialVersionUID = 1L; //직렬화 ID

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "유저정보{" +"name='" + name +  ", age=" + age +'}';
    }
}
