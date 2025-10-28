package lv4_Kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <MenuItem> burgerItems = new ArrayList<>(); //버거하위메뉴 리스트  //변수명 아이템스 보단 리스트..
        burgerItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerItems.add(new MenuItem("Hamburger", 6.9, "비프패티를 기반으로 야채가 들어간 기본버거"));
        List <MenuItem> drinkItems = new ArrayList<>();//음료하위메뉴 리스트
        drinkItems.add(new MenuItem("아메리카노",4.0,"초콜릿 견과류 느낌이 나는 커피"));
        drinkItems.add(new MenuItem("카페라떼",5.5,"초콜릿 커피향과 우유가 어우러진 고소한 라떼"));
        drinkItems.add(new MenuItem("자몽에이드",6.4,"직접만든 자몽청이 들어간 깔끔한 에이드"));
        drinkItems.add(new MenuItem("자바칩프라푸치노",7.0,"벨기에 초콜렛이 들어간 고급스러운 프라푸치노"));
        List <MenuItem> dessertItem = new ArrayList<>();// 디저트하위 리스트
        dessertItem.add(new MenuItem("바스크치즈케이크",7.4,"오븐에 구워 풍미있는 치즈케이크"));
        dessertItem.add(new MenuItem("초코케이크",6.4,"벨기에 초콜렛이 함유된 쫀득한 초코케이크"));
        dessertItem.add(new MenuItem("크로아상",4.2,"프랑스 버터를 블렌딩하여 바삭하고 풍미있는 크로아상"));
        dessertItem.add(new MenuItem("샌드위치",8.4,"시그니처 소스가 들어간 샌드위치"));

        List <Menu> category = new ArrayList<>(); //카테고리메뉴(상위메뉴) 리스트  //변수명 s 추가
        category.add(new Menu("Burgers",burgerItems)); //비효율적인데 어떻게 바꿔야하는가?
        category.add(new Menu("Drinks",drinkItems));
        category.add(new Menu("Desserts",dessertItem));

//            MenuItem menuItem = new MenuItem("ShackBurger",6.5,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
//            menuItems.add(menuItem);

        Kiosk kiosk = new Kiosk(category); //Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍니다.

        kiosk.start(); //Kiosk 클래스를 시작하는 메서드
    }
}

