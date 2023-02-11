package 예제_구간합구하기계산식;

import 예제_구간합구하기단순계산.SumA;

import java.util.Scanner;

public class RangeCalcEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        long[] sumArr = new long[n]; // 합 배열
        for(int i = 0; i < n; i++){ // 구간의 합을 구해 놓은 것
            arr[i] = sc.nextInt();
            if(i ==0) sumArr[0] = arr[0];
            else sumArr[i] = sumArr[i-1] + arr[i]; // s[i] = s[i-1] + A[i]
        }

        int left = 0, right = 0;
        while(x != 0){
            left = sc.nextInt();
            right = sc.nextInt();
            // 구간합 계산하기 : sum[R] - sum[L1], 인덱스로 계산하기 위해서는 -1을 더 해준다. 시간의 복잡도가 : O(1)
            if(left != 1) System.out.println(sumArr[right -1] - sumArr[left - 2]);
            else System.out.println(sumArr[right-1]-0);
            x--;
        }
    }
}
