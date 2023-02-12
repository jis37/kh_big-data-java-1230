package 예제_소수단어;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int sum = 0; // 각 영어 문자를 더해서 총 함계를 만드는 변수
        boolean isPrime = true; // 소수인 상태를 기본 값으로 설정 // 두가지 중 하나 선택할 때 사용 할 수 있음
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        System.out.println("합 : " + sum);
        // 소수인지 판별하기, 1은 소수라 정하기로 했기 때문에 조건에서 제외
        for(int i = 2; i < sum; i++){
            if(sum % i == 0) isPrime = false; // 나누어지면 소수가 아님
        }
        if(isPrime) System.out.println("It is not a prime word.");
        else System.out.println("It is a prime word.");




/*
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.next();
        int num = 0;
        for(int i = 0; i < alphabet.length(); i++){
            if(alphabet.charAt(i) >= 'a' && alphabet.charAt(i) <= 'z'){
                num += alphabet.charAt(i) - 96;
            }
            if(alphabet.charAt(i) >= 'A' && alphabet.charAt(i) <= 'Z'){
                num += alphabet.charAt(i) - 38;
            }
        }
            if(num % 2 == 0) System.out.println("It is not a prime word.");
            else System.out.println("It is a prime word.");

        System.out.println(num);
    }

 */
    }
}