package com.kh.inheritanceEx;

public class 손자 extends 부모 {
    // 필드
    private String 장난감;


    public 손자() {
        // super() 내장되어 있음
    }

    public 손자(String 성씨, int money, String car, String 장난감) {
        super(성씨, money, car);
        this.장난감 = 장난감;
    }

    public String get장난감() {
        return 장난감;
    }

    public void set장난감(String 장난감) {
        this.장난감 = 장난감;
    }

    @Override
    public String toString() {
            // 할머니 할아버지의 성씨 자산 차
        return               super.toString() + "손자의 " +"장난감='" + 장난감 ;
    }
}
