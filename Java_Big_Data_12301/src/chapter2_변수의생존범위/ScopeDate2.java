package chapter2_변수의생존범위;

import java.util.Scanner;

// 상수랑? 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미
// 변수와 다른 점은 프로그램이 실행되는 동안 값이 변경이 안됨(한번만 값을 넣을 수 있음)
// 자바에서 상수는 finale 키워드로 정의하고, 단 한번만 값을 설정 할 수 있다.
public class ScopeDate2 {
    public static void main(String[] args) {

/*        final int AGE; //한번 값을 지정한 후 변경 불가(final) - 보통 상수 값은 대문자로 표기하는 관례지만 사용하지 않는 경우도 있음
        AGE = 30 + 100;
        System.out.println("당신의 나이는 " + AGE + "입니다.");
*/
        final double taxRate = 0.10; // final로 인해 다른 사람이 변경할 수 없도록 막음
        Scanner sc = new Scanner(System.in); // scanner : 키보드의 입력을 받음(import가 필요함)
        System.out.print("당신의 수입을 입력 하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신이 내야할 세금은 " + income * taxRate);
    }
}
