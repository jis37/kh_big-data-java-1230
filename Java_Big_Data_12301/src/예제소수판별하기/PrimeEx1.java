package 예제소수판별하기;

import java.util.Scanner;

// 소수 : 1과 자기자신 이외에는 나누어 지지 않는 수
// 소수 판별하기
// 소수의 합 구하기 : 정수 값을 입력 받고, 입력 받은 정수 값 미만의 소수의 합을 구하는 문제
// 정수 입력 : 12
// 결과 : 2 + 3 + 5 + 7 + 11 -> 28
// 문제를 푸는 방법 : 메소드를 호출 시 정수 값을 입력해서 해당 정수가 소수이면 그 값을 반환
public class PrimeEx1 {
    public static void main(String[] args) {
//        소수의 합 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        int sum = 0; // 입력 받은 정수 미만의 소수의 합을 누적
        // 반복문 수행 : 입력 받은 정수 미만의 값으로 메소드 호출 (12 => 2 ~ 11)
        for (int i = 2; i < number; i++) {
            sum += primeSum(i);
        }
        System.out.println("소수의 합 : " + sum);
    }

    static int primeSum(int n) { // type이 int로 바뀜
        boolean isPrime = true; // 기본 값을 소수로 정함
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }
        if (isPrime) return n;
        else return 0;

    }






/* 소수 구하기
//        isPrime(100); // 아래에서 객체로 만들지 않아서 사용이 불가함 // static을 붙이면 사용가능함
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        boolean rst = isPrime(number);
        System.out.println("소수 여부 : " + rst);
        }


    // static 키워드로 선언되면 객체 생성 시 생성이 안되고 클래스 생성 시 단 한번 만들어짐
    // 해당 메소드 수행 후 반환 값이 true/false 임
    // 정수 값을 입력 받아 해당 정수가 소수인지 아닌지 판별 후 결과를 반환 함
    static boolean isPrime(int n){ // static으로 메모리 확보 후 호출 사용 가능함
    // 1과 입력 받은 값을 제외, 즉 2 부터 입력 받은 값 미만
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false;  // 전달 받은 수를 1과 자신을 제외하고 나누어 지는 경우를 의미
        }
        return true;
    }

 */
}
