package chapter6_정적메소드;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentDate(String fmt){  // 객체를 만들지 않음(호출만 하기 때문에 객체를 만들 필요가 없음)
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    final static String DOMAIN = "192.168.0.1"; // 하나의 고정된 값을 프로그램에서 사용될 경우 static을 사용 함
}