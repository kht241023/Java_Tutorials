package com.kh.oopEx;

public class OopRun {


    // 만약에 Nation에 접근제한자나 static을 붙이길 원한다면
    // main()메서드 바깥에 작성해야함
    public Nation n1 = new Nation();
    public static Nation N_Two = new Nation();


    public static void main(String[] args) {
        /*
        기능명칭 왼쪽에 이미 public 과 static과 같은 기능을 사용한다 붙였기때문에
        {} 바깥에 표기된 성능을 따라야함
        {} 안에 있기 때문에 지역변수로 접근제한자를 앞에 붙이지 못함
        static main() 메서드 안에 있기 때문에 static 사용 불가
        */
        /* 접근제한자 사용 불가! */
        Nation n2 = new Nation();

        Student s = new Student();
    }


}
