package com.kh.testEx.test3Pre;

import java.util.HashMap;
import java.util.Map;

public class StudentScoreManager {
    public static void main(String[] args) {
        // 학생이름과 점수를 저장할 Map 생성
        Map<String, Integer> studentScores = new HashMap<String, Integer>();
        StudentScoreManager ssm = new StudentScoreManager();
        /*
            학생 정보 저장
            학생 이름을 키(key), 점수를 값(value)으로 저장한다.
            기본 데이터는 아래와 같다:(모두 줄바꿈 형태)
            "김철수": 85 "이영희": 92 "박민수": 77 "최수진": 88
        */
        // 데이터 입력
        studentScores.put("김철수", 85);
        studentScores.put("이영희", 92);
        studentScores.put("박민수", 77);
        studentScores.put("최수진", 88);

        /*
        학생 정보 출력
        저장된 모든 학생 이름과 점수를 출력한다.(모두 줄바꿈 형태)
        김철수: 85점 이영희: 92점 ...
        * */
        System.out.println("학생 정보 출력");
        for(Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "점");
        }
        /*
        점수 기준으로 합격/불합격 판단
        합격 기준은 80점 이상이다.
        합격/불합격 여부를 학생 이름과 함께 출력한다.
        형식 예시:(모두 줄바꿈 형태)
        김철수: 합격 이영희: 합격 박민수: 불합격
        */
        System.out.println("합격 / 불합격 판단:");
        ssm.printPassFailStudentScores(studentScores);


        /*
        점수 수정 기능
        특정 학생의 점수를 수정할 수 있는 코드를 작성하시오.
        예를 들어, "박민수"의 점수를 77점에서 82점으로 수정하고, 다시 합격/불합격 여부를 출력한다.
        예외 처리
        존재하지 않는 학생의 점수를 수정하려고 하면 존재하지 않는 학생입니다.라는 메시지를 출력한다.
        */
        String updateName = "박민수";
        if(studentScores.containsKey(updateName)) {
            studentScores.put(updateName, 82);
            System.out.println(updateName + "의 점수를 82점으로 수정합니다.");
        } else {
            System.out.println("존재하지 않는 학생입니다.");
        }

        // 점수 수정 후 합격 / 불합격 판단

        System.out.println("점수 수정 후 합격 / 불합격 판단:");
        ssm.printPassFailStudentScores(studentScores);


    }

    // 점수 출력 기능 메서드

    /** 학생점수로 합격 불합격 판단여부 출력하는 메서드
     * printPassFailStudentScores(Map<String, Integer> studentScores)
     * @param studentScores = 특정학생들의 이름과 점수가 넘어오면 학생들의 대한 점수를 판단후 출력
     */
    public void printPassFailStudentScores(Map<String, Integer> studentScores) {
        for(Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String status = (entry.getValue()>=80) ?"합격" :"불합격";
            System.out.println(entry.getKey() + " : " + status + " : " + entry.getValue());
        }
    }




    /*
    다음은 특정 학생들의 이름과 점수를 관리하고 출력하는 프로그램입니다.
    Map을 활용하여 학생 정보를 저장하고, 조건에 맞게 처리하는 프로그램을 작성하시오.



    점수 수정 기능
    특정 학생의 점수를 수정할 수 있는 코드를 작성하시오.
    예를 들어, "박민수"의 점수를 77점에서 82점으로 수정하고, 다시 합격/불합격 여부를 출력한다.
    예외 처리
    존재하지 않는 학생의 점수를 수정하려고 하면 존재하지 않는 학생입니다.라는 메시지를 출력한다.

     */
}
