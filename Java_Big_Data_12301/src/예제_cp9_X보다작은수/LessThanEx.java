package 예제_cp9_X보다작은수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제 : 정수 n개로 이루어진 배열 A와 정수 X가 주어진다. 이 때 A에서 X보다 작은 수를 모두 출력
// 10 5 -> 배열의 길이와 주어진 수
// 1 10 4 9 2 3 8 5 7 6
// 결과 : 1 4 2 3
public class LessThanEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(); // 배열의 개수
        int x = sc.nextInt(); // 비교 값
        for(int i = 0; i < n; i++){ // n의 범위까지 순회
            list.add(sc.nextInt()); // 입력 받는 값을 바로 리스트로 입력 받음
            if(list.get(i) < x ) System.out.print(list.get(i) + " "); // 입력받은 값을 get으로 가져와서 i를 출력
        }
    }
}
