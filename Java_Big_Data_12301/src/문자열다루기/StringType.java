package 문자열다루기;

import javax.swing.*;
import java.util.Locale;

// 메소드 : 객체나 클래스 내부에 있는(소속되어 있는) 함수
public class StringType {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
// equals() : 두 개의 문자열이 동일한지 비교하여 결과 값을 리턴
        System.out.println(a.equals(b)); // a의 문자열과 b의 문자열을 비교
        System.out.println(a.equals(c)); // a와 c를 비교
        System.out.println(a.equalsIgnoreCase("HELLO")); // 대소문자 구분을 안함
        System.out.println(a == c); // 문자열의 내용을 비교하는 것이 아닌 문자열의 참조, 즉 주소를 비교하는 것
        String d = "Hello Java Java";
// indexOf() : 문자열에 특정 문자 혹은 문자열이 시작되는 인넥스를 리턴
        System.out.println(d.indexOf("Java")+"w");
// contains() : 문자열에서 특정 문자열의 포함 여부를 리턴(포함 되어 있으면 true)
        System.out.println(d.contains("HELLO")); // 대소문자 구분 함
// charAt() : 문자열에서 특정 위치의 문자를 리턴 함
        System.out.println(d.charAt(1));
// replaceAll() : 문자열 중 특정 문자열을 다른 문자열로 대체 할 때 사용(공백으로 지울 수도 있음)
        String language = "Java, Python, C, C++, JavaScript, Kotlin, Swhift";
        System.out.println(language.replaceAll("Kotlin", "Jet Brain"));
        System.out.println(language.replace("Kotlin", "s"));
// substring() : 문자열에서 특정 문자열을 추출 할 때 사용
        String e = "Hello java";
        System.out.println(e.substring(5)); // 시작 인덱스부터 끝까지 추출
        System.out.println(e.substring(1,4)); // 시작 인덱스부터 종료 인덱스 '미만'까지 추출(파이썬도 동일)
// toUpperCase(), toLowerCase() : 문자열을 모두 대문자 또는 소문자로 변경
        System.out.println(e.toUpperCase());
        System.out.println(e.toLowerCase());
// trim() : 문자열의 앞과 뒤에 있는 공백만 제거
        String str = " 자바 프로그래밍     !!!!    ";
        System.out.println(str.trim());
// String.format() : 문자열 포매팅이랑? 문자열에 특정 문자를 삽입하는 방법(삽입을 위해서는 서식이 필요)
        System.out.printf("자바 프로그램을 %s 합시다.\n", "열심히");
        String newStr = "";
//        newStr = String.format("자바 프로그램을 %s 합시다.\n", "열심히");
//        String newStr = String.format("자바 프로그램을 %s 합시다.\n", "열심히");
        int number = 10;
        String day = "three";
        newStr = String.format("I ate %d apples. so I was sick for %s days", number, day);
        System.out.println(newStr);

        String newStr2 = "I ate " + number + " apples. so I was sick for " + day + " days";
        System.out.println(newStr2);
// toCharArray() : 문자열을 문자 배열 반환
        String name = "곰돌이사육사";
        char[] arrName = name.toCharArray(); // 문자열을 문자로 구성된 배열로 만듦
        System.out.println(name);
        System.out.println(arrName);

    }
}
