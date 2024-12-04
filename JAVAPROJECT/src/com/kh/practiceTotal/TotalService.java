package com.kh.practiceTotal;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TotalService {

    /*
    문제 1: 배열과 반복문
    정수 배열 numbers 가 주어집니다.
    배열에 들어 있는 홀수 값의 합을 계산하는 프로그램을 작성하세요.

    예시 입력: numbers = {1, 2, 3, 4, 5}
    예시 출력:홀수 값의 합: 9
    */
    public void oddSum(){
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0){
                sum += numbers[i];
            }
        }
        System.out.println("홀수의 합 : " + sum);
    }

    /*
    문제 2: 컬렉션과 조건문
    ArrayList<String>에 저장된 이름 리스트 중에서 특정 문자로 시작하는
    이름만 출력하세요.
    예를 들어, "A"로 시작하는 이름만 출력해야 합니다.
    예시 입력: names = {"Alice", "Bob", "Andrew", "Eve"}
    예시 출력: A로 시작하는 이름: Alice, Andrew

     for (String name : names) {
        	if (name.startsWith("A")) {
               	System.out.print(name + " ");
        	}
    }
    */
    public void filterNames(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Eve");
        /*
        String 참조 자료형에 들어있는 기능
        * 맨 앞에 변수명으로는 boolean을 쓸 수 있음
        * startsWith(String prefix) = prefix로 시작하는 글자가 있는지 확인
        *  예제 ) boolean startWord = String으로들어있는변수명.startsWith("시작하는단어글자");
        *
        * endWith(String suffix) = suffix로 끝나는 글자가 있는지 확인
        * 예제 ) boolean endWord = String으로들어있는변수명.endWith("끝나는단어글자");
        *
        **  prefix = 시작하는 접두사
            suffix = 끝나는   접미사
            접두사 = 접할 접 머리두 언어 사
            접미사 = 접할 접 꼬리미 언어 사 (사는 축사 축하하는 말씀 할 때 쓰는 사)
        * */
        System.out.println("A로 시작하는 이름 ↓ ");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }
    }
    /*
    문제 3: 예외 처리
    사용자로부터 두 개의 정수를 입력받아 나눗셈 결과를 출력하는 프로그램을 작성하세요.
     단, 0으로 나누려고 하면 "Cannot divide by zero"라는 메시지를 출력해야 합니다.

    예시 입력: a = 10, b = 2
    예시 출력: 결과: 5

    예시 입력: a = 10, b = 0
    예시 출력: Cannot divide by zero
    */
    public void division(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.println("두 번째 정수를 입력하세요 : ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("결과 : " + result);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }

    }
    /*
    문제 5: 파일 입출력 (IO)
    "numbers.txt" 파일에서 숫자를 읽어와,
    모든 숫자의 합을 계산하고
    "result.txt" 파일에 결과를 저장하는 프로그램을 작성하세요.

    예시 "numbers.txt" 내용:
     5
     10
     15

    예시 "result.txt" 내용:
     Sum: 30
    */
    public void fileSum(){
        String path = System.getProperty("user.home") + "/Desktop/";
        String readFile = "numbers.txt";
        int sum = 0;
        // 파일 쓰기 = File(경로랑 파일이름 가져오기) FileWriter (가져온 파일에 글자를 작성하기)
        // 파일 읽기 = FileReader(읽어올 파일의 경로와 이름가져오기)  BufferedReader(FileReader를 도와주는 객체)

        // File은 try catcth 안에 들어있지 않음
        // FileWriter FileReader BufferedReader는 try 내부에 들어있어야함  try{} try()
        try (
                FileReader file = new FileReader(path + readFile);
                BufferedReader reader = new BufferedReader(file)
        ) {

            String line;
            while((line = reader.readLine())!= null){
                //window 컴퓨터의 경우 뒤에 숨겨진 공백이 존재하기 때문에
                // trim() 양쪽 공백 제거를 이용해서 한 번 제거를 진행해야함
                // 우리 눈에는 공백이지만 \r 과 같은 공백이 포함되어있음  \r 왼쪽 끝으로 키보드 커서 이동
                sum += Integer.parseInt(line.trim());
            }
        }catch (Exception e) {
           System.out.println("예상치 못한 문제로 파일을 읽을 수 없습니다." + e.getMessage());
        }

        // 위는 numbers.txt 내부에 들어있는 숫자들을 모두 더하는 기능

        // 아래는 모두 더해진 숫자를 result.txt 작성하는 기능
        try( FileWriter writer = new FileWriter(path + "results.txt");) {
           writer.write("Sum : " + sum);
           System.out.println("더한 결과 작성 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /*
    문제 7: 연산자와 변수
    사용자로부터 정수 두 개를 입력받아, 다음 연산 결과를 출력하세요:
     - 합
     - 차
     - 곱
     - 몫
     - 나머지
     */

    public void arithmeticOperations(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int b = scanner.nextInt();

        System.out.println("합 : " + (a + b));
        System.out.println("차 : " + (a - b));
        System.out.println("곱 : " + (a * b));
        try {
            System.out.println("몫 : " + (a / b)); //b의 값이 0 이 오면 0으로 숫자를 나눌 수 없습니다 예외 발생
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("나머지 : " + (a % b));
    }

}
