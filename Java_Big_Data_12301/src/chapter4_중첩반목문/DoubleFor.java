package chapter4_중첩반목문;

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args) {
// 구구단 찍기
//        for (int i = 2; i < 10; i++) {
//            System.out.printf("== [%d]단 ==\n", i);
//            for (int j = 1; j < 10; j++){
//                System.out.printf("%d x %d = %d\n", i, j, (i * j));
//            }
//            System.out.println();
//        }

// 별 갯수 찍기
        Scanner sc = new Scanner(System.in);
        System.out.print("별의 갯수를 입력하세요 : ");
        int number = sc.nextInt();
        for(int i = 0; i < number; i++){
            System.out.printf("|%d| ", i);
            for(int j = 0; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
