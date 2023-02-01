package 예제_cp9_커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// [1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료
public class CoffeeMenuEx {
    Map<String, MenuInfo> map = new TreeMap<>(); // 정렬을 위해 treeMap으로 변경
    public static void main(String[] args){
        CoffeeMenuEx coffee = new CoffeeMenuEx();
        coffee.makeMenu();
        coffee.selectMenu();
    }

    void makeMenu(){
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본 커피입니다."));
        map.put("Espresso", new MenuInfo("Espresso", 2500,"Coffee", "진한 커피입니다."));
        map.put("Latte", new MenuInfo("Latte", 4500, "Coffee", "우유가 포함된 커피입니다."));
    }
    void selectMenu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("메뉴를 선택하세요 : ");
            System.out.print("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]메뉴수정, [6]종료");
            int selMenu = sc.nextInt();
            String key = ""; // int 처럼 초기화 가능
            switch(selMenu){
                case 1 :
                    System.out.println("======= 메뉴 보기 =======");
                    for(String e : map.keySet()){ // 메뉴 보기를 순회하는 방법 -> 향상된 for 문
                        System.out.println("메뉴 : " + map.get(e).name);
                        System.out.println("가격 : " + map.get(e).price);
                        System.out.println("분류 : " + map.get(e).group);
                        System.out.println("설명 : " + map.get(e).desc);
                        System.out.println("=======================");
                    }
                    break;
                case 2 :
                    System.out.print("조회 할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)){ // map 내에 키가 존재 여부 확인(true/false)
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                        System.out.println("=======================");
                    } else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3 :
                    System.out.println("추가 할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    } else{
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine(); // 버퍼 비우기
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.put(key, new MenuInfo(key,price,group,desc));
                    }
                case 4 :
                    System.out.print("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제 했습니다.");
                    } else System.out.println("삭제할 메뉴가 없습니다.");
                    break;
                case 5 :
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String group = sc.next();
                        sc.nextLine(); // 버퍼 비우기
                        System.out.print("설명 입력 : ");
                        String desc = sc.nextLine();
                        map.replace(key, new MenuInfo(key,price,group,desc));
                    } else System.out.println("수정할 메뉴가 없습니다.");
                case 6 :
                    System.out.println("메뉴를 종료 합니다.");
                    return; // 메소드 자체로 결과 값이 넘어 가게 하기 위해 // break; 사용하면 반복문을 벗어 날 수 없음
            }
        }
    }
}
