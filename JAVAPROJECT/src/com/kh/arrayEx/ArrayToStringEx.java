package com.kh.arrayEx;

import java.util.ArrayList;
import java.util.Arrays;

/*
次元 (= Dimension , 차원)
次 = 다음 차        차례, 차선 과 같이 다음 단계 순서로 쓰임
元 = 시작 원        원조, 원상태로 와 같이 기본적인 단위 시작 이라는 의미로 사용
1D = 1Dimension 1차원 선
2D = 2Dimension 2차원 평면
3D = 3Dimension 3차원 공간
*/
public class ArrayToStringEx {

    public void toString1DMethod(){
        int[] numbers = {1,2,3,4,5};

        System.out.println("numbers                 : " + numbers);
        System.out.println("numbers[0]                : " + numbers[0]);
        System.out.println("numbers[1]                : " + numbers[1]);
        System.out.println("numbers[2]                : " + numbers[2]);
        System.out.println("numbers[3]                : " + numbers[3]);
        System.out.println("numbers[4]                : " + numbers[4]);

        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }
        // 주소값으로 배열의 위치 출력 numbers  : [I@682a0b20
        System.out.println("Arrays.toString(numbers): " + Arrays.toString(numbers));
        //System.out.println("Arrays.deepToString(numbers): " + Arrays.deepToString(numbers));
        // deepToString 은 2차원 이상부터 가능하기 때문에 1차원인 numbers 에러가 발생
    }

    public void toString2DMethod(){
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        // 각 행에 값들이 존재하기 때문에 행열의 위치 주소결과가 출력  [ = 1차원배열 [[ = 2차원 배열 I = int 줄임말 @주소시작
        System.out.println("numbers                 : " + numbers);       // 출력결과 : [[I@682a0b20
        System.out.println("numbers[0]                : " + numbers[0]); // 출력결과 : [I@214c265e
        System.out.println("numbers[1]                : " + numbers[1]); // 출력결과 : [I@448139f0
        System.out.println("numbers[2]                : " + numbers[2]); // 출력결과 :  [I@7cca494b

        System.out.println("Arrays.toString(numbers)  : " + Arrays.toString(numbers));
        // Arrays.toString(numbers)  : [[I@214c265e, [I@448139f0, [I@7cca494b]
        System.out.println("Arrays.toString(numbers[0])  : " + Arrays.toString(numbers[0])); // [1, 2, 3]
        System.out.println("Arrays.toString(numbers[1])  : " + Arrays.toString(numbers[1])); // [4, 5, 6]
        System.out.println("Arrays.toString(numbers[2])  : " + Arrays.toString(numbers[2])); // [7, 8, 9]
        System.out.println("Arrays.deepToString(numbers)  : " + Arrays.deepToString(numbers));
        // Arrays.deepToString(numbers)  : [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

        // 배열에서  Arrays 내에 toString 이나 deepToString 를 이용하면
        // for문으로 순회해서 출력을 하지 않아도 됨!

    }

    // ArrayToStringEx에 작성한 method 기능 실행용 main 메서드
    public static void main(String[] args) {
        ArrayToStringEx atse = new ArrayToStringEx();
        //atse.toString1DMethod();
        atse.toString2DMethod();
    }
}
