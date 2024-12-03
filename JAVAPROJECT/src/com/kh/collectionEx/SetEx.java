package com.kh.collectionEx;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    /*
    * 중복을 허용하지 않는 컬렉션
    * 순서가 없다는 특징이 있으며, 중복된 데이터를 제거하거나, 고유한 값만 관리할 때 사용
    * 대표적인 클래스 : HashSet(빠른 검색과 삽입), LinkedHashSet(순서유지가 돼서 느림), TreeSet
    *
    * 특징
    * 중복된 값 저장 불가 : 동일한 요소(값)를 두 번 추가하려고 해도 한 번만 저장
    * 순서 없음 : 저장된 요소들의 순서는 보장되지 않음
    * null 허용 : null을 하나만 허용 (왜냐하면 null이 두개면 중복이기 때문!)
    *
    * 메서드
    * add (E e)          : 요소(= 값) 추가 / 이미 존재하는 요소를 추가하려하면 false를 반환
    * remove(Object o)   : 특정 요소를 제거
    * contains(Object o) : 특정 요소가 존재하는지 확인
    * size()             : 저장된 요소의 개수를 반환
    * clear()            : 모든 요소 제거
    *
    *   사용법
    *           Set<> 변수이름 = new HashSet<>();
    *       HashSet<> 변수이름 = new HashSet<>();
    *
    * 나머지는 List 동일
    * */

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();
    }
}
