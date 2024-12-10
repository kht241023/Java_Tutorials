package com.kh.practiceEX.oopArrayPre;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();
        Scanner scanner = new Scanner(System.in);
        // false가 될 때 까지 반복
        while (true) {
            System.out.println("\n===== 상품 설정 시스템 =====");
            System.out.println("1. 상품추가하기");
            System.out.println("2. 모든상품보기");
            System.out.println("3. 원하는 상품 보기(상품번호로 조회)");
            System.out.println("4. 상품제거하기(상품번호로 제거)");
            System.out.println("5. 종료하기");
            System.out.print("번호를 선택하세요 : ");


            try {
                int choice = scanner.nextInt();// InputMismatchException
                scanner.nextLine(); //줄바꿈 버퍼 제거

                // switch case 사용해서 기능 완성
                switch (choice) {
                    case 1:
                        System.out.println("-----상품 추가 기능입니다.-----");
                        System.out.print("상품번호 : ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("상품이름 : ");
                        String name = scanner.nextLine();
                        System.out.print("상품가격 : ");
                        int price = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("상품수량 : ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
                        Goods goods = new Goods(id, name, price, quantity);
                        goodsService.addGoods(goods);
                        System.out.println("상품이 추가되었습니다.");
                        break;
                    case 2:
                        System.out.println("-----모든 상품 조회하기-----");
                        goodsService.displayAllGoods();
                        break;
                    case 3:
                        System.out.println("-----상품 찾기 서비스-----");
                        System.out.print("찾고자하는 상품 번호를 입력하세요 : ");
                        int findNum = scanner.nextInt() ;
                        scanner.nextLine();
                        goodsService.getGoodsById(findNum);
                        break;
                    case 4:
                        System.out.println("-----상품 제거 서비스-----");
                        System.out.print("삭제하고 싶은 상품 번호를 입력하세요:");
                        int removeNum = scanner.nextInt();
                        scanner.nextLine();
                        goodsService.removeGoodsById(removeNum);
                        break;
                    case 5:
                        System.out.println("시스템 종료를 선택하셨습니다.");
                        return; //종료를 원할경우 return 처리 가능
                    default:
                        System.out.println("잘못입력했습니다. 숫자만 입력 가능합니다.");
                        break;
                }
            } catch (InputMismatchException e) { //숫자칸에 문자를 넣었을 때 보여줄 출력문
                System.out.println("숫자 형식만 가능합니다." + e.getMessage());
                scanner.nextLine(); //예외 발생 시 입력 버퍼에 남아있던 잘못된 값을 비우기
             }catch (Exception e) {
                //숫자형식에 글자를 넣었을 문제 이외 다른 문제가 발생했을 경우
                // 표기할 출력문 작성
                System.out.println("문제가 발생했습니다." + e.getMessage());
            } finally { // 실행하는 반복문이 우선이기 때문에 동작 X
                System.out.println("프로그램을 종료합니다.");
            }


        }
    }
}
