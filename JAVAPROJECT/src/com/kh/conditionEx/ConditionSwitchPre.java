package com.kh.conditionEx;

public class ConditionSwitchPre {

    /*
     * 사용자가 입력한 숫자에 따라 해당 숫자가 어떤 요일인지 출력하는 프로그램
     *  1부터 7까지의 숫자를 입력받아 switch 문을 사용해 요일 출력
     *
     * 1: 월요일 2: 화요일 3: 수요일
     * 4: 목요일 5: 금요일 6: 토요일 7: 일요일
     * */

    public void choiceDay(int choice) {
        String result;
        switch (choice) {
            case 1:
                result = "월";
                break;
            case 2:
                result = "화";
                break;
            case 3:
                result = "수";
                break;
            case 4:
                result = "목";
                break;
            case 5:
                result = "금";
                break;
            case 6:
                result = "토";
                break;
            case 7:
                result = "일";
                break;
            default:
                result = "잘못 입력한 ";
                break;
            /* default break 밑으로 기능 구문 작성 X */
        }
        System.out.println(choice + " 일자는 " + result + "요일 입니다.");
    }
}
