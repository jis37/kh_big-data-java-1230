package chapter7_5_Calendar클래스;

import java.util.Calendar;

// Calendar 클래스 : 추상 클래스이므로 객체 생성 없이 사용, 날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이하기 때문
// 정적메소드인 getInstance() 메소드를 이용해서 운영체제의 시간 기준의 정보를 가져옴, 포함된 필드도 전부 클래스 변수
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // -->  Date now = new Date();
//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH) + 1); // 인덱스 정보가 넘어 오기 때문에 0부터 시작이라 0 -> 1월
//        System.out.println(now.get(Calendar.DAY_OF_WEEK));
//        System.out.println(now.get(Calendar.DAY_OF_MONTH));
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.HOUR));
//        System.out.println(now.get(Calendar.MINUTE));
//        System.out.println(now.get(Calendar.SECOND));
        // yyyy년 MM월 dd일 HH시 mm분 ss초

        int y = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH) + 1; // 인덱스 정보가 넘어 오기 때문에 0부터 시작이라 0 -> 1월
        int d = now.get(Calendar.DAY_OF_MONTH);
        int h = now.get(Calendar.HOUR_OF_DAY);
        int m = now.get(Calendar.MINUTE);
        int s = now.get(Calendar.SECOND);
        System.out.println(y + "년 " + mon + "월 " + d + "일 " + h + "시 " + m + "분 " + s + "초");

    }
}
