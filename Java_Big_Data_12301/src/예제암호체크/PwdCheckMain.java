package 예제암호체크;
// 암호체크
// 암호의 길이는 10 ~ 30자 사이( 10 <= len <= 30)
// 암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
// 특수문자는 (!, %, _, #, &, +, -, *, /) 9개 중의 하나
// 입력 받은 패스워드가 조건을 만족하면 "Good PassWord", 만족하지 않으면 "Bad PassWord"출력
// 반복문을 사용하고 사용자가 "종료" 또는 "exit"를 입력하면 프로그램 종료

import java.util.Scanner;

public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdCheckClass pwdCheck = new PwdCheckClass();
        String pwd; // 암호를 입력 받는 변수 생성
        while (true) {
            System.out.print("암호 입력 : ");
            pwd = sc.next();

            if (pwd.equals("종료") || pwd.equalsIgnoreCase("exit")) break;

            if(!pwdCheck.validLength(pwd)){ // 길이가 맞는지 검사
                System.out.println("Bad Length PassWord");
                continue;
            }
            if(!pwdCheck.validNumber(pwd)){ // ! -> 참이 아니면
                System.out.println("Bad Number PassWord");
                continue;
            }
            if(!pwdCheck.validLowerAlphabet(pwd)){ // 소문자 검사
                System.out.println("Bad Lower Alpahbet PassWord");
                continue;
            }
            if(!pwdCheck.validUpperAlphabet(pwd)){ // 대문자 검사
                System.out.println("Bad Lower Alpahbet PassWord");
                continue;
            }
            if(!pwdCheck.validRex(pwd)){ // 특수 문자 검사
                System.out.println("Bad Rex PassWord");
                continue;
            }
            System.out.println("Good PassWord");
        }
    }
}









//        char ch;
//        int i;
//        for (i = pwd.length(); i <= 10 && i <= 30; i++) {
//            ch = pwd.charAt(i);
//            if (ch > 10) System.out.println("Bad Pass Word");
//            else if (ch < 'z' || ch > 'a') System.out.println("Bad Pass Word");
//            else if (ch < 'Z' || ch > 'A') System.out.println("Bad Pass Word");
//            else System.out.println("Good Pass Word");
//        }
//    }

// a - 97
// z - 122
// A - 65
// Z - 90
