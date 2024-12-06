package com.kh.practiceEX.arraypre;
/*
Object Array
자바에서 객체를 배열로 관리할 수 있는 자료구조
같은 타입의 객체를 여러 개 저장하고 싶을 때 유용하게 사용
데이터를 그룹으로 다루거나 반복문으로 처리할 수 있음
*/
public class CarArrayPre {
    // 차 브랜드 차 모델 차 년도
    String brand;
    String model;
    int year;

    public CarArrayPre() {}

    public CarArrayPre(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + ", model='" + model + ", year=" + year ;
    }
}
