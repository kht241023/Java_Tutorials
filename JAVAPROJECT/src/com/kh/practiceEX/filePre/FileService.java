package com.kh.practiceEX.filePre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

    /* TODO :File FileReader BufferedReader 이용해서 파일 읽기 기능 설정
            try   - resource - catch 작성
    */
    public void readFile() {

        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName);
        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)) {
            System.out.println("["+ file + "] 내용");
            String line;
            while ((line = br.readLine()) != null) { //한줄씩 반복해서 다음줄이 빈값일 때 까지 출력
                System.out.println(line);
            }
        }catch(Exception e) {
            System.out.println("파일 읽기 모드 중 오류 발생 : " + e.getMessage());
        }

    }


    /* TODO : 바탕화면에 있는 food.docs 파일에 이어쓰기 기능 설정해서
              이어서 음식 작성
              줄바꿈 - 햄버거 줄바꿈 - 돈까스 줄바꿈 - 쌀국수 줄바꿈 - 카레
              File FileWriter
              FileServiceRun 에서 readFile 한번더 불러와 이어서 잘 작성되었는지 확인
              classRoom제출

     */

    /** 파일 이어쓰기 기능 설정
     * void appendToFile(String content)
     * @param content 파일내용
     */
    public void appendToFile(String content) {
        // System.getProperty("user.home") = c/users/user1 까지의 경로 + user1 안에 있는 desktop = 바탕화면 폴더 이어서 작성
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName);

        // 파일이 존재하는지 확인하고 파일이 존재하면 이어서 작성
        if (file.exists()) {
            try (FileWriter fw = new FileWriter(file, true)){
                fw.write(content);
                System.out.println("이어 작성하기를 완료했습니다.");
            } catch (Exception e) {
                System.out.println("파일을 이어서 작성하는 도중 문제가 발생했습니다 : " + e.getMessage());
            }
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
