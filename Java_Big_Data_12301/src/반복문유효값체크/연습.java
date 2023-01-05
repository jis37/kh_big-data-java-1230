package 반복문유효값체크;

import java.util.Scanner;

public class 연습 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(age < 0 || age > 100) {
                System.out.println("나이를 잘 못 입력하셨습니다.");break;
            }
            else if(age < 20 && age >0){
                    System.out.println("미성년자입니다."); break;
                }else
            System.out.println("당신의 나이는 " + age + "입니다."); break;
            }

        }
    }

