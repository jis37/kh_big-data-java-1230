package 예제입출력2;

import java.util.Scanner; // 두번째로 많이 사용되는 자바 API(import해야함)

// 콘솔 입력에 대해서(화면 입력기에서 입력 받는 것)
// System.in.read() : 키보드의 입력을 ASCII 코드 값으로 읽어 들임
// Scanner 입력 : 키보드의 입력을 원하는 데이터 타입으로 반환 받음
public class ScannerEx {
/*  public static void main(String[] args) throws IOException {
        while(true){ // 반복문
            int ketCode = System.in.read(); // 빨간줄 누르고 인텔리제이에게 맡길 경우 위 코드(throws)가 추가됨
        }
        public static void main(String[] args) throws IOException {
        while(true){ // 반복문
            try {
                int ketCode = System.in.read();
                System.out.println("KeyCode : " + ketCode);
                if(ketCode == 'q') break;
            } catch (IOException e) {
                e.printStackTrace(); // first in, last out (stack 구조)
            }
        }      */

//*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte(); //키보드의 입력을 byte형으로 반환
        short b = sc.nextShort();
        int c = sc.nextInt();
        char ch = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출
        String s1 = sc.next(); //문자열을 공백 단위로 입력 받음(공백이 나오면 종료)
        String s2 = sc.nextLine(); //문자열을 줄바꿈 기준으로 입력 받음(줄바꾸면 종료)


    }
    //*/
}
