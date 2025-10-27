package lv4_Kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <MenuItem> menuItems = new ArrayList<>(); //버거하위메뉴 리스트
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거"));
        List <MenuItem> menuItems1 = new ArrayList<>();//음료하위메뉴 리스트
        menuItems1.add(new MenuItem("아메리카노",4.0,"ㅇㄹㄹㅇㄹㅇ"));
        menuItems1.add(new MenuItem("카페라떼",5.5,"ㅇㄹㄹㅇㄹㅇ"));
        menuItems1.add(new MenuItem("자몽에이드",6.4,"ㅇㄹㄹㅇㄹㅇ"));
        menuItems1.add(new MenuItem("자바칩프라푸치노",7.0,"ㅇㄹㄹㅇㄹㅇ"));
        List <MenuItem> menuItems2 = new ArrayList<>();// 디저트하위 리스트
        menuItems2.add(new MenuItem("치즈케이크",7.4,"ㅇㄹㄹㅇㄹㅇ"));
        menuItems2.add(new MenuItem("초코케이크",6.4,"ㅇㄹㄹㅇㄹㅇ"));
        menuItems2.add(new MenuItem("크로아상",4.2,"ㅇㄹㄹㅇㄹㅇ"));
        menuItems2.add(new MenuItem("샌드위치",8.4,"ㅇㄹㄹㅇㄹㅇ"));

        List <Menu> topMenu = new ArrayList<>(); //카테고리메뉴(상위메뉴) 리스트
        topMenu.add(new Menu("Burgers",menuItems,menuItems1,menuItems2)); //비효율적인데 어떻게 바꿔야하는가?
        topMenu.add(new Menu("Drinks",menuItems,menuItems1,menuItems2));
        topMenu.add(new Menu("Desserts",menuItems,menuItems1,menuItems2));

//            MenuItem menuItem = new MenuItem("ShackBurger",6.5,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
//            menuItems.add(menuItem);

        Kiosk kiosk = new Kiosk(topMenu); //Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍니다.

        kiosk.start(); //Kiosk 클래스를 시작하는 메서드
    }
}

