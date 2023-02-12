package 예제시간입력;
// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력)
// 출력 : 오후 11시 05분 03초

import java.util.Scanner;

public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String times = sc.next();
        String[] splitTime = times.split(":"); // :을 기준으로 문자열을 배열 생성
        int intHour = Integer.parseInt(splitTime[0]); // 생성된 배열 문자를 정수 값으로 변경
        int intMin = Integer.parseInt(splitTime[1]);
        int intSec = Integer.parseInt(splitTime[2]);

        if(intHour > 12){
            intHour -= 12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n", intHour, intMin, intSec); // %02d 정수형 2자를 잡고, 2자리가 안될경우 앞에 0을 붙임
        }else System.out.printf("오전 %02d시 %02d분 %02d초\n", intHour, intMin, intSec);
    }
}
