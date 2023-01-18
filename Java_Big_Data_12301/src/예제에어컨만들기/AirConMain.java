package 예제에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException { // InterruptedException가 발생하면 throws(던진다)됨
        AirCon lgAircon = new AirCon();
        Scanner sc = new Scanner(System.in); // 에어컨을 켜기 위한 콘솔 입력을 받음
        int elapsedTime = 0; // 경과 시간을 계산하기 위한 변수
        boolean isSetTemp = false; // 온도가 변경 되어야 할 조건 확인
        System.out.print("에어컨을 켜시겠습니까?(Yes/No) : ");
        String isON = sc.next(); // 에어컨을 켜기 위한 문자열을 입력 받음
        if(isON.equalsIgnoreCase("yes")){
            lgAircon.setPower(true);
            lgAircon.setAirConState(); // 온도와 바람세기를 설정하고 설정에 따라 쿨러나 히터 값 변경
            while (true){
                sleep(1000); // 1000 -> 1초 동안 쓰레드가 잠을 잠 (sleep import 후 InterruptedException을 추가해야함)
                elapsedTime++;
                switch(lgAircon.getWindStep()){
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break;
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break;
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break;
                    default: // 예외처리(else 문과 같은 의미)
                }
                if(isSetTemp){
                    if(lgAircon.isHeater()) lgAircon.setCurrTemp(1);
                    if(lgAircon.isCooler()) lgAircon.setCurrTemp(-1);
                    lgAircon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                if(lgAircon.getCurrTemp() == lgAircon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.");
                    break;
                }
            }
        }
    }
}
