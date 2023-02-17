package 연습;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            int sNum = sc.nextInt();
            sum += sNum + sNum;
            System.out.println("Case #"+i+" : " + sum);
            sum = 0;

        }
    }
}
