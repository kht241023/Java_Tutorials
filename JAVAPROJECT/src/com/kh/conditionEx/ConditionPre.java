package com.kh.conditionEx;

public class ConditionPre {

    public void method1(int month){
        String result; // 계절에 따른 결과

        // 중괄호를 생략해서 마지막에 계절의 결과 표기
        if(month >= 3 && month <= 5)        result = "봄";
        else if (month >= 6 && month <= 8)  result = "여름";
        else if (month >= 9 && month <= 11) result = "가을";
        else                                result = "겨울";

        System.out.println(month + " 월 의 계절은 [ " + result + " ] 입니다.");

    }
}
