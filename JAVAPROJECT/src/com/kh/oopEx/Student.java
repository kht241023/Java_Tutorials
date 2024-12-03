package com.kh.oopEx;

public class Student {
    //필드 전역변수 접근제한자 사용가능 static  생략 가능
    private String name;
    private int age;

    //메서드 (매개변수) 지역변수 접근제한자 사용 불가능
    // 기본생성자 파라미터생성자 세터 게터 toString void return main()
    public Student() { //지역변수 매개변수 존재 X
    }

    public Student(String name, int age) { //매개변수 존재
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + ", age=" + age;
    }
}
