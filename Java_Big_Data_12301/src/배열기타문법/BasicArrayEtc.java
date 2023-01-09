package 배열기타문법;

import java.util.Arrays;

public class BasicArrayEtc {
    // args : 문자열에 참조 변수로 주소 값이 있음
    public static void main(String[] args) { // 소괄호는 매개 변수 자리, 외부 값을 가져올때 args 자리에 입력
/*
        if(args.length != 2){
            System.out.println("외부에서 전달한 값이 없어 강제 종료 함");
            System.exit(0); //프로그램을 강제 종료 시킴
        }
        String val1 = args[0];
        String val2 = args[1];
        int num1 = Integer.parseInt(val1); // 입력 받은 문자열을 정수로 변환
        int num2 = Integer.parseInt(val2);
        System.out.println("외부에서 전달하는 값 : " + (num1 + num2));

 */
/*
//      배열 중 원하는 배열 값 출력
        String[] city = {"서울", "부산", "대구", "인천", "수원"};
        for(String e : city) System.out.print(e + " ");
        System.out.println();
        System.out.println(city[3]); // 3번째 배열 출력

 */
/*
//      입력받은 문자 표시
        String[] city = {"서울", "부산", "대구", "인천", "수원"};
        for(String e : city) System.out.print(e + " ");

*/

//*
//      예외사항이 발생 할 수 있는 코드
        int[] score = new int[5]; // 국어, 영어, 수학, 과학, 미술
        for(int i = 0; i <= score.length; i++) {
            score[i] = 100;
        }
        System.out.println(Arrays.toString(score));

//*/
    }
}
