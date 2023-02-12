package 예제상속실습예제;
// 인간(Person)이라는 클래스 생성
// - age : 나이 특성을 가짐(정수 값 사용, 게터/세터) - 몇살?
// - sleep : 잠자는 특성(정수 값 사용, 게터/세터) - 몇시간 잠자는지?
// 인간으로 부터 직장인을 생성
// - work : 몇 시간 일하는지?(정수, 게터/세터)
// 인간으로 부터 학생을 생성
// - study : 공부하는 특성(1 입력 시 "열심히", 2 입력시 "적당히", 3 "놀면서")

public class InheritanceEx1 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setAge(30);
        worker.setSleep(8);
        worker.setWork(8);
        System.out.println("직장인이 " + worker.getWork() + "시간 동안 일을 합니다.");
        System.out.println("직장인의 나이는 " + worker.getAge() + "세 입니다.");
        System.out.println("직장인은 " + worker.getSleep() + "시간 동안 잠을 잡니다.");

        Student student = new Student();
        student.setAge(15);
        student.setSleep(6);
        student.setStudy(1); // []로 1,2,3 으로 입력 받음
        System.out.println("학생이 " + student.getStudy() + " 공부를 합니다.");
        System.out.println("학생이 " + student.getAge() + "세 입니다.");
        System.out.println("학생이 " + student.getSleep() + "시간 동안 잠을 잡니다.");
    }
}
