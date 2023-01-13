package 예제PC방알바;

import java.util.Scanner;

// PC방에 PC가 100대 있음(배열의 인덱스 0~99)
// 손님들은 모두 자기가 앉고 싶어 하는 자리가 있음
// 만약 자기가 앉고 싶은 자리에 다른 손님이 있으면 거절을 해야하고, 아니면 자리를 사용 허가
// 손님의 수 입력 : 3
// 손님이 앉고 싶은 자리 번호 : 1 3 5 -> 0
// 손님의 수 입력 : 5
// 자리 번호 : 1 1 3 3 5
// 거절 횟수 출력 : 2
public class PcRoomEx {
    public static void main(String[] args) {
        // PC방 좌석에 대한 100개의 배열이 필요
        // 배열의 초기 값은 0이다. 즉, 0이면 비어 있는 자리이다.
        int[] pcRoom = new int[100]; // 좌석 100개 배열 생성
        int rejectCnt = 0; // 거절 횟수
        int seatNum; // 손님이 원하는 좌선 번호를 입력 받기 위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("손님의 수 : ");
        int n = sc.nextInt(); // 손님의 수를 입력 받음
        System.out.print("좌석 번호 : ");
        for(int i = 0; i < n; i ++){ // 손님의 수 만큼 반복문이 실행됨
            seatNum = sc.nextInt(); // 손님의 원하는 자리를 입력 받음//좌석 번호는 1번부터 시작
            if(pcRoom[seatNum - 1] == 1){ // 해당 배열의 값이 1이라는 건 이미 사용 중인 자리이다.
                rejectCnt++;
            }else {
                pcRoom[seatNum-1] = 1; //비어 있는 자리를 사용 함
            }
        }
        System.out.println("사용 중인 좌석 수 : " + rejectCnt);

    }
}
