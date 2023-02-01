package 예제_암호;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 입력
// nice day
// love
// 출력 : btgz oet
public class PassWord {
    public static void main(String[] args){
        // 암호화 키의 반복 : lovelovelove => love 문자열을 입력 받아 문자배열로 만듦, 문자 배열의 길이는 4 (0,1,2,3)
        // 만약에 결과가 음수가 나오면 해당 값에서 26만큼 더해줌
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = sc.nextLine(); // 평문은 공백이 있음
        System.out.print("암호화 키 : ");
        String encrypt = sc.next();
        char[] enc = encrypt.toCharArray(); // 반복되게 하기 위해 받은 문자열을 문자 배열로 만듦 (인덱스가 필요하기 때문)
        char value = 0; // 암호문을 만들기 위한 문자 변수
        List<Character> vig = new ArrayList<>();
        for(int i = 0; i < normal.length(); i++){
            if(normal.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char)(normal.charAt(i) - (enc[i % encrypt.length()] - 'a') -1 );
                if(value < 'a') value += 26;
                vig.add(value);
            }
        }
        for(Character e : vig) System.out.print(e);
    }
}
