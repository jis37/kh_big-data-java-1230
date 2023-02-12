package 예제대소문자변경;
import java.util.Scanner;
// 영문자 소문자와 대문자로 이루어진 단어를 입력 받은 뒤 대문자는 소문자로, 소문자는 대문자로 변경하기
// 무조건 입력은 영문자이다.
// AbCdEf => aBcDeF
// 힌트1 : 문자열에서 문자를 추출하는 메소드는 charAt(인덱스)이다.
// 힌트2 : 자바에서의 문자는 정수 값으로 사용된다.
// 힌트3 : 정수 값으로 계산 후 출력 시(char)형 변환이 필요하다.
public class UpperLowerChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.next();
        char ch; // 문자열에 문자를 추출하기 위한 변수
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i); // 해당 인덱스의 문자 추출
            if(ch < 'a') System.out.print((char)(ch + ('a'-'A')));
            else System.out.print((char)(ch - ('a'-'A')));
        }
// a - 97
// z - 122
// A - 65
// Z - 90
    }
}
