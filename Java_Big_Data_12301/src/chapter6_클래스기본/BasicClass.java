package chapter6_클래스기본;
// 클래스이름 참조변수 = new 클래스이름(생성자 자리);
public class BasicClass {
    public static void main(String[] args) { // 클래스 안에 메인이라는 메소드가 있음
        Car gv80 = new Car("GV80", "White","2023.01", 230); // 클래스로 객체 생성
        Car santafe = new Car("Santafe", "Gray","2023.01", 210); // 클래스로 객체 생성
        Car kona = new Car("Kona", "Blue","2023.01", 190); // 클래스로 객체 생성

        gv80.setName("GV80 Sports"); // 같은 클래스 내에 있는(아래에 생성함)경우 변경 가능
//        gv80.name = "GV80 깡통"; // 일반적으로 외부에서 접근시 접근 제한자가 있을 경우 변경 불가
        gv80.viewCar();

        santafe.viewCar();
        kona.viewCar();
    }
}
// 접근제한자가 default 인 클래스 생성(동일한 패키지 내에서 접근 가능)
class Car {
    // 클래스를 만들때 만들어짐
    static String manufacture = "현대자동차";  // 클래스 변수(넓은 의미에서 필드이다.) 정적 변수(static은 하나만 만들어짐-class에 붙어있다.객체로 만들어지는것이 아님)
    private String name;    // 인스턴스 필드 (클래스가 객체로 만들어 질 때 객체의 갯수만큼 생성 됨) - 접근제한자 private
    String color;   // 인스턴스 필드
    String productYear;
    int maxSpeed;
    // 인스턴스 필드나 생성자는 객체가 만들어질때 같이 만들어짐
    // 생성자 : 클래스 이름과 동일하고 반환 타입 없다.(void 조차 없음)
    // 생성자는 주로 개체 생성 시 객체 내부의 필드를 초기화 하는 목적으로 사용된다.
    // 필드는 생성자의 매개 변수로 전달된다.(객체를 생성하는 곳으로 부터 전달 받음)
    Car(String name, String color, String year, int speed) { // 매개 변수로 이동 되는 지역변수 (main
        this.name = name; //전달 받은 매개 변수와 객체 내부의 필드의 이름이 같은 경우는 숨겨진 this를 적어야 함
        //  자기 참조 변수(일반적으로 생략해도 되지만, 외부와 내부의 이름이 같을 때 붙여준다)
        this.color = color;
        productYear = year;
        maxSpeed = speed;
    }
    Car(){} // (생성자) 내용 없는 생성자를 만들고 main에 내용 없는 객체를 만들면 이 생성자를 사용함
    // Setter 메소드 : 인스턴스의 값을 설정하는 메소드
    void setName(String name){ // private 와 같은 접근제한자는 이 메소드를 통해서 접근 할 수 있음
        this.name = name;
    }
    void setColor(String color){ // void - 반환 값이 없는 경우
        String test = "test" ; // 지역 변수 (블럭 안에서 사용 후 사라짐)
        this.color = color;
    }
    void viewCar(){
        System.out.println("제 조 사 : " + manufacture);
        System.out.println("이   름 : " + name);
        System.out.println("출고연도 : "+ productYear);
        System.out.println("출력속도 : " + maxSpeed);
        System.out.println("--------------------");
    }
}
