package 예제랜덤게임;
//  주사위 2개 던져서 합이 12이면 탈출하는 게임

public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;
        while(true){  // 갯수가 정해지지 않은 경우 대부분 사용
            cnt++;
            // 랜덤 함수는 실수형으로 값이 생성되므로 형변환이 필요
            rand1 = (int) ((Math.random())*6)+1; // 임의의 숫자를 생성하는 함수(java는 실수의 임의값이 만들어짐)-앞에 int를 붘여 정수로 만듦
            rand2 = (int) ((Math.random())*6)+1; // 0부터 만들어지기 때문에 +1을 함
            if((rand1 + rand2) == 12){
                System.out.printf("무인도를 %d번 만에 탈출합니다.\n", cnt);
                break;
            }else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }

        }
    }
}
