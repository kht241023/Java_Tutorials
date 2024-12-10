package com.kh.practiceEX.filePre;

import java.io.File;
import java.io.FileWriter;

public class FileService {

    // File FileWriter 이용해서 바탕화면에 food.docs 생성하기
    // try- catch

    /** 파일 생성 및 작성하기 메서드
     * void createFile(String content)
     * @param content
     */
    public void createFile(String content) {
        // 사용자 바탕화면 경로 가져오기
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName); //파일경로와 파일명 가져오기

        // try() 안에 FileWriter 나 FileReader BufferedReader 를 작성하면 close 따로 작성 X
        try(FileWriter fw = new FileWriter(file)) {
            fw.write(content); //내용 작성하기
            System.out.println("파일이 성공적으로 생성되고, 내용이 작성되었습니다.");
        }catch (Exception e) {
            System.out.println("파일 생성 / 작성 중 오류 발생 : " + e.getMessage());
        }

    }
}
