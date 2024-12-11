package com.kh.testEx.test2pre;

import java.util.ArrayList;

public class SnackRun {
    public static void main(String[] args) {

        Snack s1 = new Snack("포테이토칩","짠맛",1500);
        Snack s2 = new Snack("초코파이","단맛",2000);
        Snack s3 = new Snack("허니버터칩","허니버터맛",2500);

        ArrayList<Snack> snacks = new ArrayList<Snack>();

        snacks.add(s1);
        snacks.add(s2);
        snacks.add(s3);

        //Snack 출력
        for(Snack s: snacks) {
            System.out.println(s);
        }
    }
    /*
    for문으로 Snack 리스트 출력 결과 :
    Snack{name='포테이토칩', flavor='짠맛', price=1500}
    Snack{name='초코파이', flavor='단맛', price=2000}
    Snack{name='허니버터칩', flavor='허니버터맛', price=2500}
    */
}
