package com.kh.inheritanceEx;
// 자식클래스가 부모클래스를 상속받아 자식이 자신의 것처럼 사용
// 상속 키워드 extends
public class 자식 extends 부모 {
    // 필드
    private String computer;

    public 자식() {
        // super() : super생성자 부모생성자
        // 자식 객체 생성 시 부모 생성자를 호출하는 생성자
        // super() 생성자를 작성할 경우 항상 자식 생성자 안에서 맨 첫 번째 줄에 작성
        super();
    }

    public 자식(String 성씨, int money, String car, String computer) {
        super(성씨, money, car); //부모의 성씨와 돈 차를 먼저 가져오기
        this.computer = computer;// 자식이 가진 필드 작성
    }

    @Override
    public String toString() {
            // super.toString() 부모 클래스에 작성된 toString 불러와서 사용
        return super.toString() + "자식은 " +"computer='" + computer;
    }
}
