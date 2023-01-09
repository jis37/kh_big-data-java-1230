package 예제문자열반전;
import java.util.Scanner;
// abcdefg -> gfedcba
// 힌트1 : for 문을 이용, while 문으로도 가능
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.next();
//        int index = str.length(); // 5 글자를 찍으면 4가됨
//        while(true){
//            index--; // 입력 받은 글자 index 4를 하나씩 뺌
//            System.out.print(str.charAt(index)); //하나씩 빼면서 한글자씩 출력함
//            if(index == 0) break;
//        }
        for(int i = str.length()-1; i>=0; i--){ // for 문을 반대로 돌리면서 출력함
            System.out.print(str.charAt(i));
        }
    }
}
