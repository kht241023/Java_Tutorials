package com.kh.StringEx;

public class StringEx {
/*
* String에 적혀있는 대표적인 기능들
*
* String str = "안녕하세요";
*
* str.length()                                = 문자열의 길이를 반환
* str.charAt(int index)                       = 특정 숫자위치의 문자를 반환
* str.indexOf(String str)                     = 특정 문자열의 첫 번째 위치를 반환 (못 찾으면 -1)
* str.lastIndexOf(String str)                 = 특정 문자열의 마지막 위치를 반환
* str.contains(String str)                    = 문자열에 특정 값이 포함되어 있는지 true false로 확인
* str.equals(String str)                      = 문자열이 같은지 비교(대소문자구분)
* str.equalsIgnoreCase(String str)            = 문자열이 같은지 비교(대소문자구분 X)
* str.toUpperCase()                           = 문자열을 모두 대문자로 변환
* str.toLowerCase()                           = 문자열을 모두 소문자로 변환
* str.trim()                                  = 문자열의 앞뒤 공백 제거
* str.subString(int beginIndex)               = 특정 위치부터 끝까지 자르기
* str.subString(int beginIndex,int endIndex)  = 특정 범위를 잘라내기
* str.replace(target, replaceMent)            = 특정(target)문자를 다른 문자로대체
* str.replaceAll(String regex, replaceMent)   = 정규식을 이용해서 치환
* str.split(String regex)                     = 문자열을 정규식 기준으로 나누기
* str.concat(String str)                      = 문자열을 결합
* str.join(구분자, 결합1, 결합2, 결합3,...)   = 구분자를 이용해 문자열 결합
* str.isEmpty()                               = 문자열이 비어있는지 확인 true false
* str.isBlank()                               = 공백만 포함하거나 비어있는지 확인 true false
* */

    public static void main(String[] args) {
        StringEx se = new StringEx();
        se.methodString();
    }

    public void methodString(){
        String str1 = "  Hello World!  ";
        String str2 = "hello";

        // 1. str1 문자열의 길이 반환
        System.out.println("str1 문자열 길이 : " + str1.length());

        // 2. str2 1번 위치의 문자가 무엇인지 확인
        System.out.println("str2 1번 위치의 문자열 : " + str2.charAt(1));

        // 3. str2 첫 번째 위치 반환 대상자는 영어알파벳 l(=L)
        System.out.println("str2 에서 l의 첫번째 위치는 : " + str2.indexOf('l'));

        // 4. str2 마지막 위치 반환 대상자는 영어알파벳 l(=L)
        System.out.println("str2 에서 l의 마지막 위치는 : " + str2.lastIndexOf('l'));

        // 5. str1 World 라는 값이 포함되어 있는지 확인 결과 : boolean
        System.out.println("str1 [World] 단어 포함유무 : " + str2.contains("World"));

        // 6. 문자열 비교 대소문자 구분 str1 과 str2 비교
        System.out.println("str1과 str2가 동일한가? : " + str1.equals(str2));

        // 7. 문자열 비교 대소문자 구분 X "hello world!" 와 비교
        System.out.println("str1을 [hello world!]와 비교 : " + str1.equalsIgnoreCase("hello world!"));
        // 7. 문자열 비교 대소문자 구분 X "hello world!" 와 공백 제거 후 비교
        System.out.println("str1을 [hello world!]와 비교 : " + str1.trim().equalsIgnoreCase("hello world!"));

        // 8. str1 문자열을 모두 대문자로 변환
        System.out.println("str1 모두 대문자로 변환 : " + str1.toUpperCase());

        // 9. str2 문자열을 모두 소문자로 변환
        System.out.println("str1 모두 소문자로 변환 : " + str1.toLowerCase());

        // 10. str1 앞 뒤 공백 제거
        System.out.println("str1 앞 뒤 공백제거 : " + str1.trim());

        String str3 = "Hello Java World";

        // 11. subString 이용해서 str3 6번째부터 끝까지 자르기
        String sub1 = str3.substring(6);
        System.out.println("11. str3 6번째부터 자르기 : " + sub1);

        // 12. subString str3 3 ~ 7까지만 자르기
        String sub2 = str3.substring(3, 7);
        System.out.println("12. str3 3번 ~ 7번째 까지 자르기 : " + sub2);

        // 13 .replace   Java 를 HTML로 대체
        String replaced = str3.replace("Java", "HTML");
        System.out.println("13. Java -> HTML : " + replaced);

        // 14. concat    str4를 str3와 결합 str3 + str4
        String str4 = "Let`s learn!";
        String concated = str3.concat(str4);
        System.out.println("14. str3 + str4 : " + concated);

        // 15. split 문자열을 " " 기준으로 나누고 for-each문을 이용해서 출력
        // split 는 배열 형식
        String[] splitArray = str3.split(" ");
        System.out.println("15. str3를 공백으로 나눈 결과 출력");
        for(String str : splitArray){
            System.out.println(str);
        }
    }

    public void method1(){
        String str = "안녕하세요. 반갑습니다.";
        System.out.println(str);
        str = "식사는 맛있게 하셨나요?";
        System.out.println(str);
    }

    public void method2(){
        String str = "Hello"; //1번 Hello가 들어있는 영역
        str += "World";       // 2번 HelloWorld가 들어있는 영역
        System.out.println(str); //HelloWorld
    }


}
