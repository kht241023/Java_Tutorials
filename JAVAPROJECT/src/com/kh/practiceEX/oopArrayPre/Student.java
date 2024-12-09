package com.kh.practiceEX.oopArrayPre;

public class Student {
    // 멤버변수 필드 전역변수 인스턴스변수 속성
    //name age idCard
    private String name;
    private int age;
    private String idCard;



    // 기본생성자 : 객체를 처음 생성할 때 () 파라미터명을 하나도 넣지 않겠다는 생성자
    public Student() {
    }

    // 필수생성자 : 파라미터 매개변수 생성자 () 필수로 저장해야하는 변수명을 작성하는 생성자
    public Student(String name, int age /*, String idCard */) {
        this.name = name;
        this.age = age;
        /*
        this.idCard = idCard;
        idCard는 만들고 싶은 학생만 선택적으로 만들고 DB 에 만든 아이디카드를 저장
        */
    }

    // DB에 값을 저장할 때 선택할 수 있음
    // 파라미터생성자 메서드를 이용해서 DB에 한 번에 저장하는 방법
    // 파라미터생성자 주로 사용해서 저장할 때 = 회원가입에서 필수로 작성해야하는값

    // Setter 저장하기 위해서는 기본생성자를 이용해서 객체를 생성하고 저장
    // Setter         메서드를 이용해서 DB에 하나씩 값을 체크하고 저장하는 방법
    // Setter         주로 사용해서 저장할 때 = 로그인, 회원가입에서 선택사항이나
    //                                          비밀번호 암호화 처리해서 저장할 때
    //Getter DB에 저장된 값을 프론트에 전달 반환


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age +", idCard=" + idCard ;
    }
}
