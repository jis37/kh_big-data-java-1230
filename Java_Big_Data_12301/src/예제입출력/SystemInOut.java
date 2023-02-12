package 예제입출력;

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "경기도 수원시"; //문자를 그대로 표시
        char gender = '남'; // 큰따옴표는 문자"열"로 표시, 작은따옴표는 문자로 표시(같은 문자이지만 처리방식이 다름)-정수값으로 변환 후 그값을 표시
        int age = 30;
        int kor = 99;
        int eng = 88;
        int mat = 55;
        double aver = 0.0;
        //  자바 스타일 (메소드를 오버로딩 하는 방식)
        System.out.println("========== Java Style output ==========");
        System.out.print("Name : " + name + "\n");
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + mat)); // 앞에 문자열이 시작되면 뒷부분도 문자열로 인식() 연산자 우선순위 기호로 구별 할 수 있음
        System.out.println("평균 : " + ((double)(kor + eng + mat)/3));
        // C 언어 스타일(서식지정자를 사용)
        // 서식지정자 : %d-정수, %ld-긴 정수, %u-부호없는 정수, %f-실수, %.2f-소수점2자리까지, %s - 문자열, %c-문자, %%-서식이아닌 % 출력때, %b
        // 이스케이프시쿼스 : \n - 줄 바꿈, \r(cr) - 커서를 앞으로, \t - 탭 단위로 띄우기, \b(백스페이스) - 하나를 지움, \" - 따옴표를 넣음
        System.out.printf("========== Java Style output ==========\n");
        System.out.printf("이름 : %s, 주소 : %s\n", name, addr);  //  % 갯수에 따라 서식 갯수 적용
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + mat);
        System.out.printf("평균 : %.2f\n", (double)(kor+eng+mat)/3);

        System.out.println("\"Enter\" 키를 입력 하시면 종료 됩니다."); //백슬레시 뒤에 원하는 문자
        System.out.printf("오늘의 습도는 %d%%\n", 25);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++){ // n*n 만큼 숫자 정렬
            System.out.printf("%4d", i); // 일의 자리와 백의 자리를 오른쪽으로 자리 맞춤(엑셀처럼 숫자 정렬) %d 중간에 숫자만큼 공간을 확보(양수는 오른쪽, 음수는 왼쪽 정렬)
            if(i % n== 0) System.out.println();
        }


    }
}
