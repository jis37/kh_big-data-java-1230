package chapter4_반복문ForEx1;

import java.util.Scanner;

// for 반복문 : for(초기식; 조건식; 증감식) {반복 수행 구간}
public class ForEx1 {
    public static void main(String[] args) {
/*
//  재귀? 호출
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number = sc.nextInt();
        int result = recursiveFunc(number);
        System.out.println(result);
    }
    public static int recursiveFunc(int n){ // 자기 자신이 자기 함수를 호출함
        if(n ==1) return 1;
        return n + recursiveFunc(n -1);

 */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number = sc.nextInt();
        int sum = 0; // 값 초기화가 필요함
        for(int i = 1; i <= number; i++){  // for 문으로 1부터 10까지 1씩 더함
            sum += i;
        }
        System.out.println("정수의 합은 : " + sum);
/*

    while 문으로 10에서 -1 씩 계속 더함
        int number = sc.nextInt();
        int sum = 0; // 값 초기화가 필요함
        while(number > 0){
            sum += number; // sum = sum + number;
            number--;
        }
        System.out.println("정수의 합은 : " + sum);


        for(int i = 1; i <= 100; i++){ //일반적인 for 문
            System.out.printf("%4d", i);
            if (i % 10 == 0) System.out.println();
        }

        int i = 1;
        while(i <= 100){
            System.out.printf("%4d", i);
            if (i % 10 == 0) {
                System.out.println();
            }
            i++;
        }
// while 문 형태와 같은 모양을 만들 수 있다 (추천하지 않음)
        int i = 1
        for(; i <= 100;){      // (;;)
            System.out.printf("%4d", i);
            if (i % 10 == 0) System.out.println();
            // if(i == 100) break; 이런 형태로 바꿀 수도 있음
            i++;
        }  */
    }
}
