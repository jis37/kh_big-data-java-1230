package chapter6_다운캐스팅;

import java.util.ArrayList;

// 다운 캐스팅 : 상위 클래스형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것을 다운 캐스팅이라 함
// instanceof : 형 변환 가능 여부를 확인하는 용도(참조 변수가 참조하고 있는 개체의 실제 타입을 알아 보기 위해 사용)
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();

    }
    public void addAnimal(){
        // ArrayList에 추가 되면서 타입이 Animal 형으로 변환
        aniList.add(new Human()); // 어레이 리스트에 추가하는 명령어 'add' // Animal 타입에 대한 객체가 추가 됨
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        for(Animal e : aniList) e.move();// 엘리먼트 타입이 Animal, 리스트 타입은 aniList
    }
    public void testCasting(){
        for(int i = 0; i < aniList.size();i++){
            Animal ani = aniList.get(i); // List의 해당 인덱스의 값을 가져 옴
            if(ani instanceof Human) { // instanceof -> Human 타입으로 형 변환 가능 여부를 물어 봄
                Human h = (Human) ani; // 형 변환 가능한지 물어보고 형 변환 함
                h.readBook();
            } else if (ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if (ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형 입니다.");
            }
        }
    }
}
