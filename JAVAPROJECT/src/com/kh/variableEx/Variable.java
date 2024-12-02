package com.kh.variableEx;
 //  Variable = 변하기 쉬운
public class Variable {
    public static void main(String[] args) {
    //변수 : 메모리에 값을 저장하기 위한 공간

    // 자료형 참조형

    // 기본 자료형
    /*
            boolean  (1byte)  - true false

            byte      (1byte)  숫자 뒤에 b
            short     (2byte)  숫자 뒤에 sh
            int       (4byte) - 기본 사용
            long      (8byte)  숫자 뒤에 l

            float     (4byte)  숫자 뒤에 f
            double    (8byte) - 기본 사용

            char      (2byte) - 문자 하나, 문자 양옆에 ''
     */
    // 참조자료형
    /*
    * String  - 작성하는 값이 곧 크기이기 때문에 크기를 가늠할 수 없음
    *         - "" 사용해서 내용 작성 맨 첫글자는 대문자 S
    */

    // 변수 선언 : 메모리에 공간 생성

    boolean isTrue; // 컴퓨터 메모리에 boolean 저장공간 1byte를 생성하고
                    //아직 그 공간에는 아무것도 없는 상태이지만
                    // 그 공간의 이름을 isTrue라고 부르겠다.

    // 값 대입 : 변수에 값을 집어넣는 것 ( 이미 값이 존재하는 변수에 대입하면 --> 덮어쓰기)
    isTrue = true;

    // 변수선언 + 초기에 num1이라는 공간에 들어갈 값까지 한 번에 설정
    int num1 = 100;



    }
}











