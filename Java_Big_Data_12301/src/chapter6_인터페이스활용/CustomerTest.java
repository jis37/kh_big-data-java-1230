package chapter6_인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();
        buyer.order();  // 재정의된 메소드가 호출 됨(자식 메소드)

//        Customer customer = new Customer();
//        Buy buyer = customer; // customer Type의 customer 참조 변수를 Buy 인터페이스형 buyer 참조 변수에 대입(형변환 됨)
//        buyer.buy(); // buyer는 Buy 인터페이스의 메소드만 호출 가능
//
//        Sell sell = customer; //    자동 형변환이 일어 남
//        sell.sell();
//
//        Customer customer1 = (Customer) sell; // 다시 역으로 형 변환 (다운 캐스팅)
//        customer1.buy();
//        customer1.sell();
    }
}
