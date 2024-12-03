package com.kh.accessModifierEx;

public class AccessModifierEx {
    /*
    * [캡슐화]
    *  - 객체의 속성(필드) 직접 접근하는 것을 제한하는 것이 원칙
    *  - 직접 접근을 제한하기 위해 모든 필드에 private 키워드 작성
    *  - 속성에 직접 접근을 할 수 없기 때문에
    *       간접 접근 기능(setter , getter)을 작성해서 접근
    *
    *   사용법
    *       private String 변수명;
    *
    *       // setter
    *       public void set변수명(String 매개변수명) {
    *           this.변수명 = 매개변수명;
    *       }
     *       // getter
    *       public String get변수명(){
    *          return 변수명;
    *
    *       }
    *
    * */

    /*
    * 접근 제한자
    *
    * public        외부클래스 접근 허용
    * protected     같은 패키지 또는 자식 클래스에서 접근 가능
    * default       접근제한자를 붙이지 않으면 default 가 됨
    *               같은 패키지에 소속된 클래스만 가능
    * private       외부 접근 불가
    *
    * */
}
