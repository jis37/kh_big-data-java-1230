package 예제cp6_1_자동차만들기;

import java.util.Scanner;

public class CarMakeMain {
    public static void main(String[] args) {
        //자동차 클래스 변수
        Car car = null;
        // 지역 배열
        int[] location = {0,400,200,150,300};
        //스캐너입력
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역을 선택하세요 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int area = sc.nextInt();
        System.out.print("이동 할 승객수 입력 : ");
        int personCnt = sc.nextInt();
        System.out.print("이동 차량을 선택하세요 [1]스포츠카 [2]자동차 [3]버스 : ");
        int selectCar = sc.nextInt();
        switch (selectCar){
            case 1 : car = new SprotsCar("스포츠카");break;
            case 2 : car = new Sedan("자동차");break;
            case 3 : car = new Bus("버스");break;
            default:
        }
        System.out.print("부가가능의 ON/OFF 선택하세요 [1]ON [2]OFF : ");
        int selectON = sc.nextInt();
        if(selectON == 1){
            car.addON(true);
        }else if(selectON == 2){
            car.addON(false);
        }
        //출력
        car.result(location[area],personCnt);

    }
}