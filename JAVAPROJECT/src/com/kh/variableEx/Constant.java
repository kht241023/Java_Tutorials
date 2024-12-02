package com.kh.variableEx;
// Constant : 끊임없는 , 변하지 않는 값 끊임없이 똑같은 값 = 상수
public class Constant {
    // 보통 상수의 경우 어디서든 사용할 수 있도록 static을 앞에 붙여줌
    // static 이 붙은 상수나 변수는 어디서든 접근 가능하기 때문에 글로벌 상수 / 글로벌 변수
    public static final int NUMBER = 100;

    public static void main(String[] args) {
        /*
        지역변수 - 이미 선언된 메서드의 내부 범위로 접근이 제한되기 때문에 접근 제한자를 추가로 지정할 필요 없음
         main() 뿐만 아니라 public void method1(){} public 자료형 method1(){}에서도 사용 불가
         */
        /* 접근제한자 사용불가 */Variable variable = new Variable();
        // 상수 : 한 번 값을 기록하면 값을 바꿀 수 없는 수
        // 상수 키워드 : final
        // 상수명 작성 : 대문자 작성, 연결되는 단어 사이는 "_"구분 짓도록 개발자들 간의 약속
        final double PI = 3.14;
        final int MIN = 0;
        final int MAX = 100;


    }
}
