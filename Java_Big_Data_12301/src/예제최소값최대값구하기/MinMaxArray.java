package 예제최소값최대값구하기;
// 정수 값 입력
// 입력된 정수 범위의 임의의 값 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
// 정수 값 입력 : 10
// 1 2 4 5 8 5 3 6 7 20
// Min : 1
// Max : 20

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        // 키보드 입력을 위한 스캐너 생성
        // 정수 값 입력을 받음
        // 입력 받은 변수의 갯수 크기 만큼 배열을 생성
        // 생성된 배열 갯수 만큼 순회하면서 배열의 정수 값을 입력 받음
        // 배열에서 제일 작은 값과 제일 큰 값을 찾음
        // 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("배열 갯수 입력 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt(); //   배열의 갯수 만큼 입력 받음
        }
        int min = arr[0]; // min의 기준 찾는 값을 '배열'의 0(첫번째)부터 찾음
        int max = arr[0]; // max의 기준 찾는 값을 '배열'의 0(첫번째)부터 찾음

        for(int e : arr){ // 향상된 for 문으로 arr 배열을 int e에 넣어 찾음
            if(min > e) min = e; // e 값이 min 값보다 작으면 e 값을 min에 대입
            if(max < e) max = e; // e 값이 max 값보다 크면 e 값을 max에 대입
        }
/*  일반 for 문으로 하는 코드

        for(int i = 0 ; i <arr.length; i++){
            if(min < arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }

*/
        System.out.println("최솟값 : " + min);
        System.out.println("최댓값 : " + max);
    }
}
