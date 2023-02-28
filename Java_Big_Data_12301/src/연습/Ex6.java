package 연습;
// 10950 번 문제
import java.util.Scanner;
// 반복될 정수 값 : 1
// 계산할 정수 값 : 1 2
// Case #1 : 3

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("반복될 정수 값 : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print("계산할 정수 값 : ");
            int sNum = sc.nextInt();
            int xNum = sc.nextInt();
            System.out.println("Case #"+(i+1)+" : " + (sNum + xNum));

        }
    }
}
