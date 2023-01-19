package chapter6_인터페이스네트워크;

import java.util.Scanner;

public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetworkAdapter adapter = null; // 참조변수에 초기 값은 null이기 때문
        Scanner sc = new Scanner(System.in);
        System.out.println("연결한 네트워크를 선택하세요.\n [1]WiFi [2]5G [3]LTE : ");
        int num = sc.nextInt();
        switch(num){
            case 1 :
                adapter = new WiFi("KT MegaPass");
                break;
            case 2 :
                adapter = new FiveG("SK Telecom");
                break;
            case 3:
                adapter = new LTE("LG U+");
                break;
            default:
                System.out.println("네트워크를 잘 못 선택하였습니다.");
        }
        adapter.connect();
    }
}
