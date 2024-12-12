package com.kh.oopEx;

import java.io.*;

public class PersonRun {
    public static void main(String[] args) {
        //Person 객체 생성 홍길동 40
        Person person = new Person("홍길동", 40);

        //홍길동 정보를 저장할 경로 바탕화면에 person.txt 설정
        String path = System.getProperty("user.home") + "/Desktop/person.txt";

        // 직렬화(Serialize)
        try (
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ){
           oos.writeObject(person);
           System.out.println("직렬화 완료 : " + person);
           System.out.println("파일이 바탕화면에 저장되었습니다. : " + path);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        // 역직렬화(Deserialize)
        try(FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Person person1 = (Person) ois.readObject();
            System.out.println("역직렬화 완료 : " + person1);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
