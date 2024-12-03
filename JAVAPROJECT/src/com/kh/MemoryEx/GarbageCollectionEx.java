package com.kh.MemoryEx;
/*
* 가비지 컬렉션(Garbage Collection)
* 메모리 관리 자동화를 위한 기능
* 프로그램 실행 중 더 이상 사용되지 않는 객체를
* 자동으로 찾아 제거함으로써 메모리 누수를 방지
* 개발자가 메모리를 명시적으로 해제할 필요가 없도록 도와줌
*
* * 명시적 : 분명히 드러나는 것
*
* 가비지 컬렉션 동작 : 자바가 특정 기능과 기준을 통해
*                       메모리를 정리
*                       메모리 정리를 직접적으로 언제 진행해달라 설정할 수 있음
*
*                       System.gc(); //메모리 정리 실행 요청
*
* */
/*
* Garbage : 1950 ~ 60 년대 프로그래밍 언어가 발전하던 시기에
*           불필요한 데이터나 사용되지 않는 메모리를 의미하는 은유적인 표현
*           사용되지 않는 메모리 영역을 Garbage 로 사용
*   자바는 이 전통을 이어받아서 메모리 관리 시스템의 이름을 가비지 컬렉션 지음
*/
/*
* 일상 영어 표현
* Trash   일상 생활 쓰레기 (종이, 플라스틱)
* Garbage 주방 쓰레기
* Rubbish 일반 쓰레기 (모든 종류)
* Litter  길거리 공원 쓰레기
* Waste   폐기물 산업 환경 쓰레기
*/
public class GarbageCollectionEx {

    public static void main(String[] args) {
        String 주소 = "https://";
        System.out.println("주소 : " + 주소);

        주소 += "www.naver.com";
        System.out.println("주소 : " + 주소);


        // String의 경우 불변성으로 인해 적합한 예제는 아니지만
        // 가장 직관적으로 가비지 컬렉션을 확인할 수 있어 예제 작성
    }
}
