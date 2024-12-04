package com.kh.practiceTotal;

public class BankAccount {
    // 계좌 번호
    // 비밀번호
    // 필드 = 속성 = 전역변수 = 멤버변수 = 인스턴트변수
    private String accountNumber;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * deposit 입금 기능
     * @param amount 입금할 금액
     */
    public void deposit(double amount) {
        if (amount > 0) { //입금할 금액이 0원보다 클 경우에만 입금 가능
            balance += amount; //현재 잔액에 입금금액 더하기
            System.out.println(amount + " 원이 입금되었습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println("올바른 금액을 입금해주세요.");
        }
    }

    /**
     * withdraw 출금기능
     * @param amount 출금할 금액
     */
    public void withdraw(double amount) {
        if (amount > balance) { //출금할 금액이 balance 잔액보다 크기 때문에
            System.out.println("잔액이 부족합니다. 출금이 불가능합니다.");
        } else {
            balance -= amount; //현재 잔액에서 출금금액 빼기
            System.out.println(amount + "원이 출금되었습니다. 남은 잔액 : " + balance + "원");
        }
    }
}
