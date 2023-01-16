package chapter6_정적메소드;

import java.security.DomainCombiner;

import static chapter6_정적메소드.Util.DOMAIN;

public class StaticMethod {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinHan = new Bank("신한", 1000);
        Bank NH = new Bank("농협", 0);
        kakao.setDeposit(2000);
        kakao.setWithdraw(1580);
        kakao.viewAccount();

        System.out.println(Bank.getCount()); // getCount() 메소드는 정적메소드(static method)이며, 클래스 소속

        System.out.println("현재 시간을 출력합니다.");
        System.out.println(Util.getCurrentDate("yyyy년 MM월 dd일 - hh:mm:ss"));
        System.out.println("도메인 주소 : " + DOMAIN);


    }
}
