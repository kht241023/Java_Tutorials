package com.kh.testEx.test1pre;

public class MemberRun {
    /* todo
        set 생성자로 아이디 이름     비밀번호 넣기
        user1  강길자   pass1
        user1 pass1 로그인 성공할 경우 로그인 성공! 강길자님 환영합니다.
                      실패할 경우 로그인 실패! 아이디 또는 비밀번호를 확인하세요. 출력
    */
    public static void main(String[] args) {
        Member m = new Member();

        m.setId("user1");
        m.setName("강길자");
        m.setPassword("pass1");

        if(m.login("user1", "pass1")) {
            System.out.println("로그인 성공! " + m.getName() + "님 환영합니다.");
        } else {
            System.out.println("로그인 실패! 아이디 또는 비밀번호를 확인하세요.");
        }

    }
}
