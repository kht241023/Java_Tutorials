package com.kh.practiceEX.arraypre;

import java.util.Arrays;

public class CarArrayPreService {

    public void carMethod1(){
    // Car 객체 배열 생성  자동차 종류들을 담는 배열 생성
    CarArrayPre[] cars = {
            new CarArrayPre("현대","소나타",2020),
            new CarArrayPre("기아","쏘렌토",2019),
            new CarArrayPre("아우디","A6",2022)
    };

    // todo: 1. Arrays.toString 을 이용해 cars 배열 출력
        System.out.println(cars);
        System.out.println("Arrays toString 을 이용한 차 종류들 출력 : " + Arrays.toString(cars));

    // todo: 2. cars 배열을 브랜드 이름을 기준으로 오름차순 정렬
        // DB 에서 ORDER BY ASC를 이용하면 됨!
        /** CAR 테이블에서 차 정보를 브랜드 오름차순으로 정렬하기
        SELECT *
        FROM CAR
        ORDER BY BRAND = ASC;
         */
        /* 버블 정렬 알고리즘
        * 배열의 인접한 두 값을 비교해 조건에 따라 위치를 바꿈
        * 반복 후 가장 큰 값이 배열의 끝으로 이동
        * 반복 횟수를 줄이면서 정렬 완료
        *
        * compareTo 메서드 배열 내에 존재하는 문자열 비교
        * cars[j].brand       cars[j + 1].brand     브랜드 이름을 비교했을 때
        * 가나다순으로 봤을 때 결과가 0보다 크다면 값 위치를 교체
        * */
        for( int i = 0; i < cars.length; i++){
            for (int j = 0; j < cars.length; j++){
                if(cars[j].brand.compareTo(cars[j + 1].brand) > 0){
                    // 두 값을 교체
                    CarArrayPre temp = cars[j]; //현재 찾아낸 cars[j]의 값을 temp 임시변수명에 저장
                    cars[j] = cars[j + 1]; // 비교했을 때 가나다 순으로 앞에 있어야 하는 단어위치를 앞으로 변경
                    cars[j + 1] = temp; // 뒤에 있어야 하는데 앞에 있는 단어를 뒤로 변경
                    /*
                    * 바지 / 가방
                    *  바지.compareTo(가방)  > 0   바지와 가방 단어를 비교했을 때 결과가 +로 나옴
                    *  바지와 가방의 위치를 교체
                    *  교체한 결과 -> 가방 / 바지
                    * */
                }
            }
        }

        System.out.println("브랜드 이름 기준으로 정렬된 자동차 배열 (버블정렬) : " + Arrays.toString(cars));

    // todo: 3. cars 배열의 모든 요소를 동일한 값으로 모두 변경
        Arrays.fill(cars, new CarArrayPre("BMW","X5",2018));
        System.out.println("모든 자동차를 BMW로 변경 됐는지 확인 : " + cars);

    // todo: 4. 다른 배열 값과 같은지 비교 비교 결과 같은지 확인
        CarArrayPre[] carsEquals = {
                new CarArrayPre("현대","소나타",2020),
                new CarArrayPre("기아","쏘렌토",2019),
                new CarArrayPre("아우디","A6",2022)
        };


        boolean areEquals = Arrays.equals(carsEquals, cars);
        System.out.println("cars 와 carsEquals 안에 들어있는 차들은 같은가 ? : "+areEquals);

    }

    public static void main(String[] args) {
        CarArrayPreService carArrayPreService = new CarArrayPreService();
        carArrayPreService.carMethod1();
    }
}
