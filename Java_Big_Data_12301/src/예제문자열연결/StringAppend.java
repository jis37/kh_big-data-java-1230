package 예제문자열연결;
// 문자열 추가하기
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수 값 입력 : 2
// 첫번째 문자열에서 입력 받은 정수 갯수 만큼의 문자를 뒤에서 부터 잘라, 두번재 문자열 앞에 추가하기
// 2를 입력하면 : ulkorea
// 3을 입력하면 : oulkorea
// 힘트 1 substring(index) : 문자열의 시작 위치부터 끝까지 잘라냄
// 힌트 2 substring 메소드를 이용해 문자열 추출하기 index 계산이 필요


import java.util.Scanner;

public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 : ");
        String str1 = sc.next();
        System.out.print("두번째 문자열 : ");
        String str2 = sc.next();
        System.out.print("정수 값 입력 : ");
        int num = sc.nextInt();

        System.out.println(str1.substring(str1.length()-num)+str2);
/*
        int num = sc.nextInt();
        int position = str1.length() - num;
        String sub = str1.substring(position);
        System.out.println(sub + str2);
 */

    }
}
