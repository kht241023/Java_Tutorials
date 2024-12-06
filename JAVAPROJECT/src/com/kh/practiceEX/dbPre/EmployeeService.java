package com.kh.practiceEX.dbPre;

import java.util.Date;

public interface EmployeeService {

    /**
     * 신규 직원정보 추가 기능 (모든 정보를 전달 받음)
     * 단, 퇴사일과 퇴사 여부는 필수로 정보를 받는 것이 아닌 선택 여부로 빈칸으로 남겨두기!
     * @param employee
     */
    void addEmployee(Employee employee);

    /** set을 이용하거나 매개변수를 모두 받는 것이 아닌 부분 매개변수 전달 생성자를 만들어서
     * 정보수정한 내용을 DB 전달하고, ID가 일치한 사원의 정보로 덮어쓰기
     * 직원 정보 수정 기능 ( 직원정보를 수정할 때 사원ID,사원주민등록번호, 입사일은 변경 불가)
     * @param emp_name
     * @param email
     * @param phone
     * @param dept_code
     * @param job_code
     * @param sal_level
     * @param salary
     * @param bonus
     * @param manager_id
     * @param ent_date
     * @param ent_yn
     */
    void updateEmployee(String emp_name, String email, String phone, String dept_code, String job_code, String sal_level, double salary, double bonus, String manager_id, Date ent_date,char ent_yn);

    /** set을 이용해서 사원번호부터 퇴사여부까지 14가지 항목을 모두 전달받는 것이 아니라
     * 14가지 컬럼 중에서 4가지 컬럼이 일치하는 사원 삭제
     * 직원 삭제 기능 (사원번호, 사원이름, 사원이메일, 퇴사여부가 일치하는 사원만 정보 삭제하기)
     * @param emp_id   사원번호
     * @param emp_name 사원이름
     * @param email    이메일
     * @param ent_yn   퇴사여부
     */
    void deleteEmployee(String emp_id, String emp_name, String email, char ent_yn);

    /**
     * 특정 사원이 본인의 회원정보를 수정하기 위해
     * 사원번호, 사원이름, 이메일이 일치하는지에 대한 여부를 확인하고
     * 일치여부에 따른 값을 작성하고 작성한 내용이 DB에 일치하다면 회원정보 조회 기능
     * 회원정보를 조회할 때 사원번호나 사원이름이나 사원 이메일로 조회 가능
     * @param emp_id
     * @param emp_name
     * @param email
     */
    void viewEmployee(String emp_id, String emp_name, String email);

    /**
     * 특정 회원을 찾고자하는 상위 직급을 위한 회원정보 조회 기능
     * 회원정보를 조회할 때 사원번호가 존재하면 조회 가능
     * @param info_emp
     * 사원번호 또는 사원이름 또는 사원이메일 중에 하나라도 일치하는 정보가 존재하면 회원정보조회
     */
    void viewEmployee(String info_emp);

    /**
     * 사원의 이름과 이메일이 일치하는 회원정보 조회 기능
     * 동명이인이 존재할 때 추가적인 정보 확인으로 이름과 이메일이 일치하는 회원정보 조회
     * 회원정보를 조회할 때 사원이름이나 사원 이메일로 조회 가능
     * @param emp_name
     * @param email
     */
    void viewEmployee(String emp_name, String email);

    /**
     * 사원이 로그인을 진행할 때 이름과 핸드폰번호 일치여부 로그인 진행
     * @param emp_name
     * @param phone
     */
    void loginEmployee(String emp_name, String phone);
}











