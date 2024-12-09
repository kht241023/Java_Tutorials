package com.kh.practiceEX.oopArrayPre;

public class User {
    // 전역변수 필드 멤버변수 인스턴스변수 속성
    // username email age
    private String username;
    private String email;
    private int age;

    // 메서드 기본 / 매개변수 / setter /getter / toString

    public User() {
    }

    public User(String username, String email/*, int age*/) {
        this.username = username;
        this.email = email;
      /*  this.age = age;*/
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
