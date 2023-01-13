package 예제KMT문제;
// 입력 : Knuth-Morris-Pratt
// 출력 : KMP
// 입력 : Mirko-Slavko
// 출력 : MS
import java.util.Scanner;

public class StringKmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = sc.next();
        // 첫번째 방법 : split()
//        String[] splitName = name.split("-"); // (정규식을 넣을 수 있다) 하이픈(-)기준으로 나눔
//        for(String e : splitName) System.out.print(e.charAt(0));
        // 두번째 방법 : 대문자만 골라내는 방법
//        for(int i = 0; i < name.length(); i++){ // name의 범위 만큼 돌리면서 아래 조건으로 넘어감
//            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') { // 대문자 구간 조건
//                System.out.print(name.charAt(i));
//            }
//        }
        // 세번째 방법 : 0번째 문자 출력, 그리고 '-' 다음 문자 출력
//        for(int i = 0; i < name.length(); i++){
//            if(i == 0) System.out.print(name.charAt(i));
//            else {
//                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }
        // 네번째 방법 : 문자 배열로 변경 후 대문자 골라 내기
        char[] chName = name.toCharArray(); // 문자열을 문자 단위로 바꿈
        for (char e : chName){
            if(e >= 'A' && e <= 'Z') System.out.print(e); // A-Z까지 범위에 포함된 글자를 출력
        }
        // 향상된 for 문 : 만들어진 자료 구조등에 사용(만들어진 값을 변경할 수 없음, 갯수를 정하고 입력을 받는 코드에서는 사용이 불가)
    }
}
