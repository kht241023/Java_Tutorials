package com.kh.practiceTotal;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound(); //super.기능() = 부모에 작성된 기능 그대로 출력
        System.out.println("Meow");
    }
}
