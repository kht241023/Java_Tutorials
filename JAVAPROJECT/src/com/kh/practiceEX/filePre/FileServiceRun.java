package com.kh.practiceEX.filePre;

import java.io.File;

public class FileServiceRun {
    public static void main(String[] args) {
        FileService fileService = new FileService();

        // 파일에 작성할 내용
        String content = "맛있는 음식 목록 : \n - 피자 \n - 치킨 \n - 초밥 \n - 파스타";
        // createFile 기능 호출 자료형 없는 매개변수명으로 파일작성내용 넣어주기
        fileService.createFile(content);
        fileService.readFile();

        String content2 = "\n - 햄버거 \n - 돈까스 \n - 쌀국수 \n - 카레";
        fileService.appendToFile(content2);
        fileService.readFile();

    }
}
