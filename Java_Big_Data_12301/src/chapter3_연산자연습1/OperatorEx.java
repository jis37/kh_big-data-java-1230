package chapter3_연산자연습1;


// 이항연산자와 삼항연산자
// 산술 연산자 : +,-,*,/, %(나머지)
// 대입 연산자 : 값을 변수에 대입할 때 사용, 대입은 항상 뒤에서 앞으로 일어남
// 복합대입 연산자 : 연산 후 대입
// 증감 연산자 : 값을 1 증가하거나 감소 시키는 연산자(단항 연산자) - ++, --
//           우위와 전위에 따라 상황이 달라짐
// 비교 연산자 : 값의 크기를 비교하는 연산자
// 논리 연산자 : 참과 거짓을 판단 하는 것(AND &&, OR ||, NOT !)
// 삼항 연산자 : 항이 3개인 연산자(이건 참과 거짓이 있는 조건문과 같음)
// 문자열 결합 연산자 : 문자열을 이어주는 연산자

public class OperatorEx {
    public static void main(String[] args) {

        System.out.println("Java" + 11.03 + 12);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("나이를 입력 하세요 : ");
//        int age = sc.nextInt();
//        boolean isAdult = (age > 19) ? true : false; // 가장 빠른 코드
//        System.out.println(isAdult);



//        int x = 10, y = 20;
//        boolean rst1, rst2, rst3;
//        rst1 = (x > y) && (x > 5); // false (AND는 앞이 false 일때 뒷부분은 무시함)
//        rst2 = (x > y) || (x > 5); // true (OR는 앞이 true 일때 뒷부분은 무시함)
//        rst3 = !((x > y) || (x > 5)); // false
//
//        System.out.println(rst1);
//        System.out.println(rst2);
//        System.out.println(rst3);


//        int x = 10, y = 20;
//        System.out.println(x > y); // false
//        System.out.println(x < y); // true
//        System.out.println(x == y); // == 같다의 의미, = 대입의 의미
//        System.out.println(x >= y); //false
//        System.out.println(x <= y); // true


//        int num1 = 10;
//        System.out.println(num1++); // 대입 후 증가(현재 증가됨)
//        System.out.println(++num1); // 증가 후 대입(위 증가 값에 증가 후 대입됨)

//        int num1 = 10;
//        System.out.println(num1 += 2); // num1 = num1 + 2;
//        System.out.println(num1 -= 2); // num1 = num1 - 2; 일반적으로 +, - 까지 많이 쓰임
//        System.out.println(num1 *= 2); // num1 = num1 * 2;
//        System.out.println(num1 /= 2); // num1 = num1 / 2;
//        System.out.println(num1 %= 2); // num1 = num1 % 2;

//        int num1 = 10, num2 = 3;
//        System.out.println("+ 연산자 : " + (num1 + num2));
//        System.out.println("- 연산자 : " + (num1 - num2));
//        System.out.println("* 연산자 : " + (num1 * num2));
//        System.out.println("/ 연산자 : " + ((double)num1 / num2));
//        System.out.println("% 연산자 : " + (num1 % num2));

//        try { // 예외처리
//            System.out.println(5 / 0);
//        } catch (ArithmeticException e){
//            System.out.println("값을 0으로 나누면 안됩니다."); // 오류를 표시(예외 처리 문)
//        }

    }
}
