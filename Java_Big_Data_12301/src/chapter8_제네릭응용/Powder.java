package chapter8_제네릭응용;

public class Powder extends Material{
    public void doPrinting(){
        System.out.println("Powder 재료로 출력합니다.");
    }
    @Override
    public String toString(){ // 오브젝트에서 오버라이딩 함
        return "재료는 Powder 입니다.";
    }
}
