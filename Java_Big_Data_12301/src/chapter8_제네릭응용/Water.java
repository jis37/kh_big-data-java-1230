package chapter8_제네릭응용;

public class Water extends Material{
    public void doPrinting(){
        System.out.println("Water 재료로 출력합니다.");
    }
    @Override
    public String toString(){ // 오브젝트에서 오버라이딩 함
        return "재료는 Water 입니다.";
    }
}
