package chapter6_다형성응용예제2;

public class Vehicle {
    public void run(){
        System.out.println("자동차가 달립니다.");
    }
}
class Sportscar extends Vehicle{
    @Override
    public void run(){ // 오버라이딩은 접근제한자 반환타입 이름 모든 것이 동일 해야 함
        System.out.println("스포츠카가 달립니다.");
    }
}
class Bus extends Vehicle{
    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }
}
class Truck extends Vehicle{
    @Override
    public void run(){
        System.out.println("트럭이 달립니다.");
    }
}