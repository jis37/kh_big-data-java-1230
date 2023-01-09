package 참조타입확인;
// 참조 변수의 ==(같음을 확인?)
public class RefType {
    public static void main(String[] args){
        String name1 = "진부연";
        String name2 = "진부연"; // name1과 주소를 같이 사용함
        String name3 = new String("진부연");
        if (name1 == name3){
            System.out.println("두개의 이름에 대한 참조가 같음");
        }else {
            System.out.println("두개의 이름에 대한 참조가 다름");
        }
        if (name1.equals(name3)){
            System.out.println("두개의 이름의 내용이 같음");
        }else {
            System.out.println("두개의 이름의 내용이 다름");
        }

/*
        int x = 0;
        String str = null; // 참조 타입의 변수가 객체를 참조하지 않는다는 의미(참조 할게 없다)
        int[] intArray = null;
        Integer val = null; // null;, 주소를 넣어도 되지만, 값을 넣어도 됨
        int val2 = val; // NullPointException 이 발생, Integer 에 값을 넣으면 값이 표시됨
        System.out.println(val2);

 */
    }
}
