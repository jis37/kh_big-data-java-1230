package 예제홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 7개 정수를 입력 받음(배열 생성 필요)
// 정수 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
public class OddEvenSeparator {
//ArrayLIst 사용

    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    void inputArray(){
        Scanner sc = new Scanner(System.in);
        int value =0;
        System.out.print("정수 입력 : ");
        while(true) {
            value = sc.nextInt();
            if (value == 999) break;
            inList.add(value); // ArrayList 값을 추가 함
        }
    }
    void separatorArray() {
        for(int e : inList){
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void printArray(){
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");
    }
}
/*
    int[] inputsArr = new int[7];
    int[] oddArr = new int [7];
    int[] evenArr = new int [7];
    int evenIdx = 0;
    int oddIdx = 0;
    // 7개의 정수를 입력 받음
    void inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        for(int i = 0; i < inputsArr.length ; i++) {
            inputsArr[i] = sc.nextInt();
        }
    }

    // 홀수 / 짝수 나누어 담기
    void separatorArray() {
        for (int e : inputsArr) {
            if(e % 2 == 0) evenArr[evenIdx++] = e; // 나눈 값이 0이면 evenIdx값에 evenArr에 대입 ++가 뒤에 있어서 대입 후 1 증가
            else oddArr[oddIdx++] = e;
        }
    }

    // 홀수 / 짝수 배열 출력
    void printArray(){
        System.out.print("홀수 : ");
        for(int i = 0; i < oddIdx; i++) System.out.print(oddArr[i] + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int i = 0; i < evenIdx; i++) System.out.print(evenArr[i] + " ");
    }
}

}
*/