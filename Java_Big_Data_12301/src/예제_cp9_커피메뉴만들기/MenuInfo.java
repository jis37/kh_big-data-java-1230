package 예제_cp9_커피메뉴만들기;

public class MenuInfo implements Comparable<MenuInfo>{
    String name;    // 메뉴명
    int price;      // 가격
    String group;   // 분류
    String desc ;   // 설명

    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }
    @Override // map 정렬
    public int compareTo(MenuInfo o){
        return name.compareTo(o.name); // 사전 순으로 정렬
//        return this.price - o.price; // 가격 기준으로 정렬
    }
}
