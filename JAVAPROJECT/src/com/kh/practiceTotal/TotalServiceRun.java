package com.kh.practiceTotal;

public class TotalServiceRun {
    public static void main(String[] args) {
        TotalService totalService = new TotalService();

        System.out.println("=== 홀수더하기 기능 ===");
        totalService.oddSum();

        System.out.println("=== 첫 번째글자가 A로 시작하는 단어 찾기 ===");
        totalService.filterNames();

        System.out.println("\n === 나눗셈 결과 출력 ===");
        totalService.division();

        System.out.println("=== 파일 안에 있는 숫자 더하고, 더한 숫자 result.txt 저장하기 ===");
        totalService.fileSum();

        System.out.println("=== 계산기 실행하기 ===");
        totalService.arithmeticOperations();
    }
}
