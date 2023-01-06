package 연습;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int as = sc.nextInt();

        for(int i = 0; i < as; i++);
        System.out.printf("|%d|", as);

    }
}
