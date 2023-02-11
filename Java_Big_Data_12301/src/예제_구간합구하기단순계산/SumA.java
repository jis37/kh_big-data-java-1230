package 예제_구간합구하기단순계산;
import java.util.Scanner;
// 5 3
// 5 4 3 2 1
// 1 3
// 2 4
// 5 5
public class SumA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 갯수
        int x = sc.nextInt(); // 테스트 케이스
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0, right = 0;
        while(x != 0){ // x 가 0이 아닐때 까지 순회 // 자바는 while 문에서 참과 거짓으로 분류
            long sum = 0; // 매번 돌아 올 때 마다 초기화를 해야 함
            left = sc.nextInt();
            right = sc.nextInt();
            for(int i = left - 1; i < right; i++){
                sum += arr[i];
            }
            System.out.println(sum);
            x--;
        }
    }
}
