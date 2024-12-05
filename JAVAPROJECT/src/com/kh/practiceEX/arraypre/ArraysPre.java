package com.kh.practiceEX.arraypre;

import java.util.Arrays;

public class ArraysPre {

    public void int1DArray(){
        int[] arr1 = {10, 300, 20, 50, 7000, 9999};
        int[] arr2 = {10, 300, 20, 50, 7000, 9999};
        //TODO :  1. Arrays toString 을 이용해서 arr1과 arr2출력
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //TODO :  2. arr1 오름차순 정렬
        Arrays.sort(arr1);
        System.out.println("arr1 오름차순 정렬 : " + Arrays.toString(arr1));

        //TODO :  3. arr1 안의 모든 값을 500 으로 변경
        Arrays.fill(arr1, 500);
        System.out.println("arr1 값 모두 500으로 변경 : " + Arrays.toString(arr1));

        //TODO :  4. arr1과 arr2의 값이 모두 같은지 비교하고 비교한 결과 출력
        boolean flag = Arrays.equals(arr1, arr2);
        System.out.println("arr1 과 arr2 비교 결과 :  " + flag);
    }

    public void string1DArray(){
        String[] arr1 =  {"apple", "banana", "cherry", "date", "elderberry"};
        String[] arr2 =  {"apple", "banana", "cherry", "date", "elderberry"};

        //TODO :  1. Arrays toString 을 이용해서 arr1과 arr2출력
        System.out.println("arr1 의 결과 : " + Arrays.toString(arr1));
        System.out.println("arr2 의 결과 : " + Arrays.toString(arr2));

        //TODO :  2. arr1 오름차순 정렬
        Arrays.sort(arr1);
        System.out.println("arr1 오름차순 정렬 : " + Arrays.toString(arr1));

        //TODO :  3. arr1 안의 모든 값을 mango 로 변경
        Arrays.fill(arr1, "mango");
        System.out.println("arr1 값 모두 mango 변경결과 : " + Arrays.toString(arr1));

        //TODO :  4. arr1과 arr2의 값이 모두 같은지 비교하고 비교한 결과 출력
        boolean flag = Arrays.equals(arr1, arr2);
        System.out.println("arr1 과 arr2의 비교 결과 : " + flag);
    }


    public static void main(String[] args) {
        ArraysPre arrayPre = new ArraysPre();
        arrayPre.int1DArray();
        arrayPre.string1DArray();

    }
}
