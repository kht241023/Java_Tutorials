package com.kh.arrayEx;
/*
Tip
1차원 배열
int[] arr = {숫자값 직접 넣기};
int []arr = new int[몇 개의 숫자가 들어갈지 숫자 들어갈 칸 자릿수];
int arr[] ;


2차원 배열
[첫 번째 시작하는  {} 배열 갯수]  [ {{배열 안에 몇 개의 값을 배치할지 설정}} ]
int[][] arr = {     {      } , {      }, {      }     };
int [][]arr = new int[세로칸][가로칸];
int arr[][] ;

배열 [] or [][] 이용하다보니 배열이라는 객체를 만들어 개발자들에게 유용한
기능을 제공 => Arrays 파일로!


Arrays.toString(출력하고자 하는 변수명);
1차원 출력할 때 적합!
1차원 배열의 요소들을 문자열로 변환하여 출력
2차원 이상의 배열 요소들은 값을 제대로 출력하지 못하고 각 값들의 주소값만 출력

Arrays.deepToString(출력하고자 하는 변수명);
2차원 이상 출력할 때 적합!
2차원 이상의 모든 값을 순차적으로 순회해서 사람이 읽을 수 있는 형태로 변환
내부 배열까지 모두 탐색해서 각 값을 출력

*/
public class ArrayEx {

    /*
    * 배열 (자료구조)
    *   Java에서의 배열
    *   -> 같은 자료형의 변수를 하나의 묶음으로 다루는 것
    *
    *   - 생성된 배열의 요소는 index를 이용해서 구분  (요소 = 값)
    *   - 생성된 배열을 활용하기 위해서는 배열을 참조하는 "참조형 변수"를 이용
    *
    *   [참조형 변수]
    *   - 주소를 저장하는 변수
    *
    *   - 변수 사용 시 저장된 주소로 찾아가서
    *       그곳에 위치한 배열, 객체 참조
    *   ** 기본 자료형 8개를 제외한 나머지 자료형은 모두 참조형 변수
    *       기본 자료형 : byte short int long boolean float double char
    * */
    public void method1(){
        // 변수 선언
        int num;
        // Stack 영역에 int 자료형을 저장할 수 있는 변수(공간)을 생성하고
        // 그 변수(공간)의 이름을 num 지정

        // 배열 선언
        int[] arr;
        // Stack 영역에 int[] 자료형을 참조할 변수를 생성하고 (주소 저장)
        // 그 변수의 이름을 arr 로 지정

        // 배열 할당
        arr = new int[3];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        // Heap 영역에 int 4개짜리 배열을 할당한 후 생성된 배열의 주소를 arr 변수에 대입
        // arr 이용해서 배열을 참조할 수 있음

        // 배열 초기화
        // 1) 초기화 전 -> 0이 대입되어 있는지 확인
        System.out.println("초기화 전");

        // 2) 인덱스를 이용한 초기화
        arr[0] = 100;
        arr[1] = 2000;
        arr[2] = 5;
        System.out.println("초기화 후");

    }

    public void method2(){
        String str;
        //arr[0] = 초기화 전 = null = 0

        String[] arr = new String[4];
        arr[0] = "java";
        arr[1] = "html";
        arr[2] = "css";
        arr[3] = "javaScript";
        //01_배열 선언, 초기화 전 후 메모리구조_string


        String arr2[] = {"java", "html", "css", "javaScript"};

    }

    /*
    * 배열 길이 확인 length 를 이용해 개수 확인
    *
    * */
    public void method3(){
        int num[] = {1, 100, 1000};

        System.out.println(num.length);
        //num에 숫자가 몇 개 들어있는지 확인 가능
    }

    /*
    * 2차원 배열
    * int[][] arr = new int[1][2];
    *                   // 2칸짜리 1차원 배열을 1개 묶은 배열
    *
    * */


    public void method4(){
        int arr[][] = new int[2][3];
        arr[0][0] = 10;
        arr[0][1] = 100;
        arr[0][2] = 1000;
        arr[1][0] = 20;
        arr[1][1] = 200;
        arr[1][2] = 2000;
    }

}
