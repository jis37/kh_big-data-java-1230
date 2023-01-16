package 예제상근날드;

import java.util.Scanner;

//  상근날드 가게에서는 세트 메뉴를 판매합니다.
//  햄버거는 3개 종류
//  음료 2가지 종류
//  입력 : 총 5개의 값을 연속으로 입력, 햄버거 3종 가격, 음료 2가지 가격을 연속으로 입력 : (0,1,2) - 햄버거 (3,4)-음료
//  입력된 값 중 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2중 싼 것 선택하고, 세트 메뉴이기 때문에 50원 할인
//  총 세트 메뉴의 금액 구하는 문제

public class SetMenu {
    public static void main(String[] args) {
        int[] set = new int[5]; // 5개의 정수로 구성된 배열 생 [new] -> heap 영역에 메모리를 자리 잡는다
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : "); //햄버거 3개와 음료 2개의 가격을 입력 받기 위한 화면출력
        for(int i = 0; i < set.length; i++) {  // 범위를 <=로 설정하면 입력은 6개로 받지만 범위를 벗어난 에러로 출력됨(현재는 6개로 입력되도 정상출력이 됨)
            set[i] = sc.nextInt(); // 배열의 길이 만큼 순회하며 값을 연속으로 입력 받음
        }
        int minBurger = set[0]; // 0 ~ 2 인덱스 사이의 햄버거 중 하나의 값을 기본 값을 설정
        int minDrink = set[3]; // 3 ~ 4 인덱스 사이의 음료 중 하나의 값을 기본 값으로 설정
        // 반복문을 순회하면서 햄버거 1개와 음료 1개 선택(제일 싼 것)
        for (int i = 0; i < set.length; i++){
            // i가 3보다 작을 때 위 minBurger를 0번 째로 초기화
            // 처음 코드 실행 때 set[i]는 minBurger와 0번째로 같기 때문에 다음으로 넘어감
            // set[1] 번째 일때 minBurger보다 더 작으면 set[1]번가격을 minBurger에 대입
            if((i < 3) && (minBurger > set[i])) minBurger = set[i];  // 코드가 한 줄이면 '{'를 생락 할 수 있음
            if((i > 2) && (minDrink > set[i])) minDrink = set[i];
        }
        System.out.println(minBurger + minDrink - 50);
    }
}
