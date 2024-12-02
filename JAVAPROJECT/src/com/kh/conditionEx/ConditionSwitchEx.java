package com.kh.conditionEx;

public class ConditionSwitchEx {

    /*
     * 자료형 변수명 = 특정값;
     *
     * switch(변수명) {
     *   case 조건1:
     *       조건1에 부합하는 기능 실행
     *       break; // break를 걸어주지 않으면 조건에 부합한 기능 실행 후 나머지 case 모두 실행
     *   case 조건2:
     *       조건1이 변수명에 일치하지 않아 조건1을 건너뛰고
     *       조건2에 부합하는 기능 실행
     *       break;
     *   default :
     *       변수명이 조건1과 조건2에 부합하지 않아 모두 건너뜀
     * }
     *
     * */
    public void method1() {
        int a = 10;

        switch (a) {
            case 1:
                System.out.println("나이가 " + a + " 입니다.");
                break;
            case 2:
                System.out.println("나이가 " + a + " 입니다.");
                break;
            case 10:
                System.out.println("나이가 " + a + " 입니다.");
                break;
            default:
                System.out.println("일치하는 나이가 없습니다.");
                break;
        }
    }


    /*
     * 자료형 변수명 = 특정값;
     *
     * switch(변수명) {
     *   case 조건1:  case 조건3: case 조건5:
     *       조건1,3,5에 부합하는 기능 실행
     *       break; // break를 걸어주지 않으면 조건에 부합한 기능 실행 후 나머지 case 모두 실행
     *   case 조건2:
     *       조건1,3,5 변수명에 일치하지 않아 조건1,3,5 건너뛰고
     *       조건2에 부합하는 기능 실행
     *       break;
     *   default :
     *       변수명이 조건 1,2,3,5 조건에 부합하지 않아 모두 건너뜀
     * }
     *
     * */
    public void method2() {
        int month = 10;
        String result;
        switch (month) {
            case 1: case 12: case 2:
                result = "겨울";
                break;
            case 3: case 4: case 5:
                result = "봄";
                break;
            case 6: case 7: case 8:
                result = "여름";
                break;
            case 9: case 10: case 11:
                result = "가을";
                break;
            default:
                result = "잘못된";
                break;
        }
        System.out.println(month + " 는 [" + result + " ]계절입니다.");
    }

    /*

    자바 14버전 이후 사용 가능
     * 자료형 변수명 = 특정값;
     *
     * switch(변수명) {
     *   case 조건 1, 3, 5:
     *       조건1, 3, 5에 부합하는 기능 실행
     *       break; // break를 걸어주지 않으면 조건에 부합한 기능 실행 후 나머지 case 모두 실행
     *   case 조건2:
     *       조건1, 3, 5 변수명에 일치하지 않아 조건1, 3, 5를 건너뛰고
     *       조건2에 부합하는 기능 실행
     *       break;
     *   default :
     *       변수명이 조건1, 2, 3, 5에 부합하지 않아 모두 건너뜀
     * }
     *
     * */

    public void method3() {
        int month = 10;
        String result;
        switch (month) {
            case 1, 12, 2:
                result = "겨울";
                break;
            case 3, 4, 5:
                result = "봄";
                break;
            case 6, 7, 8:
                result = "여름";
                break;
            case 9, 10, 11:
                result = "가을";
                break;
            default:
                result = "잘못된";
                break;
        }
        System.out.println(month + " 는 [" + result + " ]계절입니다.");
    }



}
