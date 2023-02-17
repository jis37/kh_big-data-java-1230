package 연습;
// n * n의 배열 모양 출력 하기
// ex : 3
// 1 2 3
// 4 5 6
// 7 8 9
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        for(int i = 1; i <= num * num; i++){
            System.out.printf("%4d", i);
            if(i % num == 0) System.out.println();
        }
    }
}
