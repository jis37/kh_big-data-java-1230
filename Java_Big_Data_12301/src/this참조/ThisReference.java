package this참조;
// this : this 참조 변수는 자기 자신의 객체 주소를 참조하는 변수
// this() : this() 메소드는 생성자에서만 사용가능
// 만들어진 목적 : 같은 클래스내에서 여러개의 생성자가 만들어 지는 경우 중복된 코드가 많이 생기는 것을 보완하기 위해서 사용
public class ThisReference {
    public static void main(String[] args) {

    }
}
class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    public Car(String modelName, int modelYear, String color, int maxSpeed){
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public Car(String modelName, int modelYear, String color){
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }
    public Car(){ // 빈 생성자로 만들어 져도 다른 생성자의 값을 불러 올 수 있다. this()로 가능
        this("싼타페", 2022, "Red");
    }
    public Car(String model){
        this(model,2022, "Red", 22);

    }
}
