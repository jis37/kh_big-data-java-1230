package 예제간판만들기;
// 각 숫자마다는 차지하는 공간이 다르다.
// 0 = 4칸 차지, 1=두칸, 나머지 수는 3칸을 차지
// 간판의 각 숫자 사이는 1칸의 여백이 필요.
// 총 입력한 숫자를 표기하기 위해 몇 칸의 공간이 필요한지 계산하는 문제
// 120 = 1 + 2 + 1 + 3 + 1 + 4 + 1 = 13
// 5611 = 1 + 3 + 1 + 3 + 1 + 2 + 1 + 2 + 1 = 15
// 입력은 0이 들어 올 때 까지 계속 반복 입력이 가능하게 해야 함.(종료 조건)
import java.util.Scanner;

public class SignBoardMake {
    public static void main(String[] args) {
        int[] numberSize = {4,2,3,3,3,3,3,3,3,3};
        Scanner sc = new Scanner(System.in);
        String signNumber; // 문자열 입력 받는 변수
        int sum = 0;  //총 몇자리의 공간을 차지하는지 누적하는 변수
        while(true){
            signNumber = sc.next();
            if(signNumber.equals("0")) break; // 입력이 0으로 들어오면 종료
            for(int i = 0; i < signNumber.length(); i++){
                sum += numberSize[signNumber.charAt(i)-'0'] + 1; // 숫자 뒤의 공간을 위해 1을 더해 줌
            }
            System.out.println(sum + 1); // 전체 공간에서 맨 앞 여백을 위해 1을 더해 줌
            sum = 0;
        }

    }
}
