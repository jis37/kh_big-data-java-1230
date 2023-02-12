package 예제_블랙잭;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 5 21 => 카드 장수, 주어진 값
// 5 6 7 8 9 => 카드 중 3장의 카드를 골라서 주어진 값과 같거나 작은 값 중 제일 가까운 값을 찾아야 함.

public class BlackJak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // 3장의 카드의 합
        System.out.print("카드 장 수 : ");
        int rst = sc.nextInt(); // 3장의 카드의 합으로 만들어진 결과 값
        System.out.print("주어진 값 : ");
        int cnt = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 배열 i 번째에 입력 값을 넣음
        }
        for (int i = 0; i < cnt; i++) {
            for (int j = i + 1; j < cnt; j++) { // j 는 i 와 겹치지 않게 + 1 을 해줌
                for (int k = j + 1; k < cnt; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum <= m && rst < sum) rst = sum;
                }
            }
        }
        System.out.println("결과 : " + rst);
    }
}